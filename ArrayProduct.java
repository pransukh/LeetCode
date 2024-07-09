import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MergeStrings {

    public static void main(String[] args) {
int[] ans = arrayProduct(new int[]{1,2,3,4});
        for(int data : ans){
            System.out.println(data);
        }
    }

 public static int [] arrayProduct(int[] array){

        int[] ans = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            int pro = 1;
            for (int j = 0; j < array.length; j++) {
                if(j == i) continue;
                pro *= array[j];
            }
            ans[i] = pro;
        }
        return ans;
    }
}
