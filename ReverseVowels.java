import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MergeStrings {

    public static void main(String[] args) {
 System.out.println("reverse vowels: "+reverseVowels("leetcode"));

    }

public static String reverseVowels(String string){

        char[] charArray = string.toCharArray();

        int leftIdx = 0;
        int rightIdx = string.length() - 1;
        String vowels = "aeiouAEIOU";
        while (leftIdx<rightIdx){
            String left = String.valueOf(string.charAt(leftIdx));
            String right = String.valueOf(string.charAt(rightIdx));
           if(vowels.contains(left)
                && vowels.contains(right)){
               // exchage
               charArray[leftIdx] = string.charAt(rightIdx);
               charArray[rightIdx] = string.charAt(leftIdx);


               leftIdx ++;
               rightIdx --;
           }else if(!vowels.contains(String.valueOf(string.charAt(leftIdx)))){
               leftIdx++;
           }
           else if(!vowels.contains(String.valueOf(string.charAt(rightIdx)))){
               rightIdx--;
           }
        }
        return String.valueOf(charArray);
    }
}


