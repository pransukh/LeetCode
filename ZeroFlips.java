import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ZeroFlips {
    public static void main(String[] args) {
        
        System.out.println(zeroFlips(new int[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0}, 2));
}
 public static int zeroFlips(int nums[], int k) {
        int left = 0, right = 0, maxOnes = 0, zeroCount = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right - left + 1);
            right++;
        }
        return maxOnes;
    }

}
