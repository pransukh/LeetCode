package JAVA.LEETCODE;

import java.util.HashMap;
import java.util.Map;

class Profit {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       JOB [] jobs = new JOB[difficulty.length];
        for (int i = 0; i < worker.length ; i++) {
            jobs[i]=new JOB(difficulty[i],
            profit[i]);
        }
        int n = worker.length;
        int i = 0;
        int currentProfit = 0;
        int maxProfit = 0;
        for (int able :worker) {
           while(i < n ){
               if(jobs[i].job<=able) {
                   currentProfit = Math.max(currentProfit, jobs[i].profit);

               }
            i++;
           }
            i =0;

            System.out.println(currentProfit);
            maxProfit+=currentProfit;
            currentProfit = 0;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int []difficulty = new int[]{5,50,92,21,24,70,17,63,30,53};
        int []profit = new int[]{68,100,3,99,56,43,26,93,55,25};
        int []worker = new int[]{96,3,55,30,11,58,68,36,26,1};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
}

class JOB{
    int job;
    int profit;
    JOB(int job, int profit){
        this.job = job;
        this.profit = profit;
    }
}