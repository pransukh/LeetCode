import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MergeStrings {

    public static void main(String[] args) {
       System.out.println("reverse String:"+reverse("   HELLO    NAME  "));
    }

public static String reverse(String string){
        string = "a good   example";
        String []chunk = string.split(" ");
        string = "";
        for (int i = chunk.length - 1 ; i >=0 ; i--) {
            if(chunk[i].length()>0){
                string += chunk[i].trim()+" ";
            }

        }
        return string.trim();
    }

}
