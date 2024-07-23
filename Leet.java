package com.org.let;

import java.util.*;
// find the frequency of elemnt and the sort the array according to the frequency of element.



public class Leet {
    public static void main(String[] args) {
        sort(new int[]{1,1,2,2,2,3});
        sort(new int[]{2,3,1,3,2});
        sort(new int[]{-1,1,-6,4,5,-6,1,4,1});
    }
    public static void sort(int[] arr){
        HashMap<Integer, Integer>  map = new HashMap<>();
        for (int i : arr){
            if(!map.isEmpty() ){
                if(map.containsKey(i)){
                    map.put(i,map.get(i) + 1);
                }else{
                    map.put(i,1);
                }
            }else{
                map.put(i,1);
            }
        }


        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return -1;
                }
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        int idx = 0;
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
            for (int i = 0 ; i < aa.getValue() ; i++ ) {
                arr[idx] = aa.getKey();
                idx+=1;
             }

        }

        for(Map.Entry<Integer,Integer> set : temp.entrySet()){
            System.out.println(set.getKey()+"--"+set.getValue());
        }

        for(int a : arr){
            System.out.println(a);
        }
    }
}
