import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MaxPairOrKsum {

    public static void main(String[] args) {
       System.out.println(maxPairOrKsum(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4},2));
    }

public static int maxPairOrKsum(int[] array, int k){
        int left = 0;
        int right = array.length - 1;
        int op = 0;
        Arrays.sort(array);

        while (left<right){
            if(array[left] + array[right] == k){
                op+=1;
                left++;
                right--;
            }else if(array[left] + array[right] > k){
                right--;
            }else{
                left++;
            }
        }
        return op;
    }

}
