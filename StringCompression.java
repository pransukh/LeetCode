import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {
      System.out.println("String Compression:" + stringCompression(null));
    }

  public static int stringCompression(char[] input){
        int count = 1;
        String result = "";
//        input = new char[]{'a','a','b','b','c','c','c'};
//        input = new char[]{'a'};
        input = new char[]{'a','b','b','b','b','b','c','c','c','c','c','c','c'};
        char []input2 = input;
        int i = 0;     // p1
        while(i<input.length){
            int j = i + 1; // p2
            while (j<input.length && input[i] == input[j]){
                count++;
                j++;
            }
            result = count > 1 ? result + input[i]+count : result + String.valueOf(input[i]);
            i = j;
            count=1;
        }
        System.out.println(result);
        return result.length();
    }

}
