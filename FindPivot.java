import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FindPivot {
    public static void main(String[] args) {

      System.out.println("PIVOT: E  3: "+findPivot(new int[]{1,7,3,6,5,6}));
    }

public static int findPivot(int[] nums) {
        //1,7,3,6,5,6
        if (nums.length == 0) return -1;
        int leftSum = 0, rightSum = 0;
        for (int num : nums)
            rightSum += num;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

}
