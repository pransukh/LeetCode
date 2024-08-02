package org.example;

public class AmazonKth {
    public static void main(String[] args) {
        System.out.println(new AmazonKth().kthFactor(4,4));
    }

    int kthFactor(int num, int k){
        int count = 0;
         for (int i = 1; i <= num ; i++) {
            if(num % i == 0) {
                count++;
            }
            if(count == k){
                return  i;
            }
        }
        
         return -1;

    }
}
