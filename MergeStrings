import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MergeStrings {
public static void main(String[] args) {
        //1
        System.out.println(mergeAlternately("ABCD","PQRS")); //APBQCRDS
        System.out.println(mergeAlternately("ABCD","PQ"));//APBQBC
        System.out.println(mergeAlternately("AB","PQRS"));//APBQQR
}
public static String mergeAlternately(String word1, String word2) {
        String result = "";
        String bs = "";
        int min = word1.length() < word2.length() ? word1.length():word2.length();
        for (int i = 0; i < min ; i++) {
            result = result + String.valueOf(word1.charAt(i)+""+word2.charAt(i));
        }
        bs =word1.length() > word2.length() ? word1:word2;
        result = result+bs.substring(min,bs.length());
        return result;
    }
}
