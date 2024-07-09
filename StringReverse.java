package JAVA.LEETCODE;

import java.util.HashSet;
import java.util.Set;

public class StringReverse {
    public static void main(String[] args) {
        reverse(args,0,args.length-1);
        for (String s: args){
            System.out.println(s);
        }
        merge(new int[]{5,3,7},new int[]{6,2,4});
        reverse2("HELLO MY NAME IS SANDEEP");
        prefixSum(new int[]{1,2,3,4,5});
    }

    static void reverse(String[] input,int start, int end){
        if(start>=end){
           return;
        }
        String temp = input[start];
        input[start] = input[end];
        input[end] = temp;
        reverse(input,start+1,end-1);
    }

    static void merge(int[] a, int[] b){
        Set<Integer> setA = new HashSet<>();
        for (int k : a){
            setA.add(k);
        }
        for (int k : b){
            setA.add(k);
        }

        for (int k : setA){
            System.out.println(k);
        }

    }

    static void reverse2(String input){
        String[] chunks = input.split(" ");
        System.out.println(input);
        System.out.println(process(chunks,chunks.length));
    }
    static String process(String[] chunks,int len){

        if(len == 1){
            return chunks[0].toString();
        }
        return chunks[len-1] +" "+ process(chunks, len - 1);

    }

    static void prefixSum(int[] input){
        for (int i = 0; i < input.length ; i++) {
            if(i != 0) input[i] = input[i-1] * input[i];
        }
        for (int i : input){
            System.out.print(i+",");
        }
    }
}
