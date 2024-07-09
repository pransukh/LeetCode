package JAVA.searching;

import java.util.Objects;
import java.util.Scanner;

//Write me a program for string matching in kmp algo


public class BruteForce {

    static String Reset = "\033[0m";
    static String Red = "\033[31m";
    static String Green = "\033[32m";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        String pattern = scan.next();
        System.out.printf("Finding '%s' in '%s'", pattern, text);
        System.out.println();
        int startIdx = getIndexOfSearchedString(text,pattern);
        if( startIdx > 0){

            for(int i = 0;i<=text.length() - 1;i++){
                if(i >= startIdx && i<=startIdx+pattern.length() - 1){
                    System.out.print(Red+text.toCharArray()[i]+Reset);
                }else{
                    System.out.print(text.toCharArray()[i]);

                }
             }
            System.out.println();
            for(int i = 0;i<=text.length() - 1;i++){
                if(i >= startIdx && i<=startIdx+pattern.length() - 1){
                    System.out.print(Red+"^"+Reset);
                }else{
                    System.out.print("-");

                }
            }
        }

    }

    static int getIndexOfSearchedString(String text,String pattern){
        String[] text_ = text.split("");
        String[] pattern_ = pattern.split("");
        int tl = text.length();
        int pl = pattern.length();
        for(int i=0;i <= tl-pl;i++){
            int j = 0;
            while (j < pl && pattern_[j].equalsIgnoreCase(text_[i + j])){
                j = j + 1;
            }
            if(j==pl) return i;
        }
        return -1;
    }
}
