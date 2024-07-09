import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Subsequence {

    public static void main(String[] args) {
System.out.println("Subsequence: "+subsequence("abc","akkbllc"));
}
 public static boolean subsequence(String pattern, String input ){
        pattern = "aaaaaa";
        input = "bbaaaa";
        int j =0;
        int found = 0;
        for (int i = 0; i < pattern.length(); i++) {
           String patt = String.valueOf(pattern.charAt(i));
           while (j < input.length()){
               if(patt.equals(String.valueOf(input.charAt(j)))){
                   found++;
                   j++;
                    break;
               }
               j++;
            }
        }

        return found == pattern.length();
    }


}
