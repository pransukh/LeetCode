package org.example;

import java.util.Arrays;

public class package org.example;

import java.util.Arrays;

public class SumOfSubArray {
    public static void main(String[] args) {
        System.out.println(sumOfSubArr(new int[]{1,2,3,4}, 1, 5));
    }

    public static int sumOfSubArr(int[] arr, int li, int ri){
        int newArray[] = new int[(arr.length*(arr.length + 1))/2];
        int newArrIdx = 0;
        int innerIdx = 0;
        int sum = 0;
        int ansSum = 0;
        for (int i = 0;i < arr.length; i++) {
            innerIdx = i;
            sum = 0;
            while (innerIdx<arr.length){
                sum+=arr[innerIdx];
                newArray[newArrIdx] = sum;
                newArrIdx+=1;
                innerIdx+=1;
                }
        }
        Arrays.sort(newArray);
        int ans = 0;
        final int mod = (int) 1e9 + 7;
        for (int i = li - 1; i < ri; i++) {
            ans = (ans + newArray[i]) % mod;
        }
        return ans;

    }
}
 {
    public static void main(String[] args) {
        System.out.println(sumOfSubArr(new int[]{1,2,3,4}, 1, 5));
    }

    public static int sumOfSubArr(int[] arr, int li, int ri){
        int newArray[] = new int[(arr.length*(arr.length + 1))/2];
        int newArrIdx = 0;
        int innerIdx = 0;
        int sum = 0;
        int ansSum = 0;
        for (int i = 0;i < arr.length; i++) {
            innerIdx = i;
            sum = 0;
            while (innerIdx<arr.length){
                sum+=arr[innerIdx];
                newArray[newArrIdx] = sum;
                newArrIdx+=1;
                innerIdx+=1;
                }
        }
        Arrays.sort(newArray);
        int ans = 0;
        final int mod = (int) 1e9 + 7;
        for (int i = li - 1; i < ri; i++) {
            ans = (ans + newArray[i]) % mod;
        }
        return ans;

    }
}
