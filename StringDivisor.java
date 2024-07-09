import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StringDivisor {

    public static void main(String[] args) {
        System.out.println(stringDivisor("ABCABCABC","ABC"));
    }
  public static String stringDivisor(String s1, String s2){
        if((s1+s2).equals(s2+s1)){
            int gcd = 0;
            for (int i = 1; i <=s1.length() && i<=s2.length()  ; i++) {
                if(s1.length() % i == 0 && s2.length() % i == 0){
                    gcd = i;
                }
            }
            return s1.substring(0,gcd);
        }
        return "";
    }
}
