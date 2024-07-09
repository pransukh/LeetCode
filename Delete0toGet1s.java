import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Delete0toGet1s {
    public static void main(String[] args) {

System.out.println(delete0toGet1s(new int[]{0, 0, 0}));
    }



public static int delete0toGet1s(int[] array) {
        int left = 0, right = 1;
        int counter = 0;
        int zeroCounter = 0;
        int ans = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0) {
                zeroCounter += 1;
                //left
                left = i - 1;
                while (left >= 0 && array[left] > 0) {
                    counter += 1;
                    left -= 1;
                }
                //right
                right = i + 1;
                while (right < array.length && array[right] == 1) {
                    counter += 1;
                    ++right;
                }
                i = right;
                if (counter > ans) {
                    ans = counter;
                }
                counter = 0;
            } else {
                i++;
            }

        }
        if (zeroCounter == array.length) {
            ans = 0;
        } else if (ans == 0) {
            ans = array.length - 1;
        }
        return ans;
    }
}
