package JAVA.LEETCODE.CrackInterviewIn75QA;

import edu.princeton.cs.algs4.In;

import java.util.Stack;

public class Asteroid {
    public static void main(String[] args) {
//       
        int asteroids[] = new int[]{10,2,5,11,14,100,15,16,55,17};
        int[] dom = null;

        Stack<Integer> ans = new Stack();
        for (int i = 0; i < asteroids.length ; i++) {

            if(!ans.isEmpty() && asteroids[i] < 0){
                if(Math.abs(ans.peek()) == Math.abs(asteroids[i])){
                    ans.pop();
                    continue;
                }
               while (!ans.isEmpty() && Math.abs(ans.peek()) < Math.abs(asteroids[i]) ){

                   ans.pop();
               }

               if(ans.empty() || !ans.isEmpty() && ans.peek() < 0){
                   ans.add(asteroids[i]);
               }
            }else{
                ans.add(asteroids[i]);
            }
        }

        dom = new int[ans.size()];
        for (int i = 0; i < ans.size() ; i++) {
            System.out.println(ans.get(i));
            dom[i] = ans.get(i);
        }



    }
}
