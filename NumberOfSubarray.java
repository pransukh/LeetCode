
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NumberOfSubarray {

    public static void main(String[] args) {
System.out.println(numberOfSubarray(new int[]{7,3,2,1,5},31));


    }



public static int numberOfSubarray(int[] nums, int k){
        int res = 0, count = 0;
        for (int l = 0, r = 0; r < nums.length; r++){
            if (nums[r] % 2 == 1){
                k--;
                count = 0;
            }
            while (k == 0){
                count++;
                k += (nums[l++] % 2);
            }
            res += count;
        }
        return res;
    }
}
