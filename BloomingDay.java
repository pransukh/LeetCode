package JAVA.LEETCODE;

import java.util.Arrays;

public class BloomingDay {
    static int bloomingDays[]={1,10,3,10,2};
    static int bouquets = 3;
    static int flowerInEachBouquet=1;
    public static void main(String[] args) {
        System.out.println(solution(bloomingDays,bouquets,flowerInEachBouquet));
    }
    static int solution(int[] bloomDay,int m, int k){
        if ((long) m * k > bloomDay.length) {
            return -1;
        }


        int low = 1, high = (int) 1e9;
        System.out.println(high);
        while (low < high) {
            int mid = low + (high - low) / 2;
            System.out.println(mid);
            if (isPossibleBouquets(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        };

        return low;
    }
    static boolean isPossibleBouquets(int[] bloomDay, int m, int k, int day){
        int total = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            int count = 0;
            while (i < bloomDay.length && count < k && bloomDay[i] <= day) {
                count++;
                i++;
            }

            if (count == k) {
                total++;
                i--;
            }

            if (total >= m) {
                return true;
            }
        }

        return false;
    }
}