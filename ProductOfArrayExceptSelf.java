import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
   System.out.println("Product: "+productOfArrayExceptSelf(new int[]{1,2,3,4}));
        System.out.println("Product: " + productOfArrayExceptSelf(new int[]{-1, 1, 0, -3, 3}));

}


public static int[] productOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = 1;
        }
        int leftProduct = 1;
        for(int i = 0; i<n; i++){
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for(int i = n -1; i>=0; i--){
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
        //1,2,3,4
//        int[] result = new int[array.length];
//        long product = 1;
//        boolean zero = false;
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array.length; j++) {
//                if (j == i) continue;
//                if (array[j] == 0) {
//                    zero = true;
//                    break;
//                }else{
//                    product *= array[j];
//                }
//
//            }
//            result[i] = zero ? 0 : Math.toIntExact(product);
//            product=1;
//            zero = false;
//
//
//        }
//
//        return result;
    }

}
