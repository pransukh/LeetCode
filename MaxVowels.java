
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MaxVowels {
    public static void main(String[] args) {
 System.out.println(maxVowels("aeiou", 2));
    }

 public static int maxVowels(String text, int k) {
        String vowels = "AEIOUaeiou";
        int textLen = text.length();
        int count = 0;
        int left = 0;
        int right = k;
        while (right <= textLen) {
            int currCount = 0;
            for (int j = left; j <= right - 1; j++) {
                System.out.print(text.charAt(j));
                if (vowels.contains(String.valueOf(text.charAt(j)))) {
                    currCount++;
                }
            }
            System.out.println();
            count = Math.max(currCount, count);
            left++;
            right++;

        }

        return count;
    }
}
