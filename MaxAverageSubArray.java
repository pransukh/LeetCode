import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MaxAverageSubArray {

    public static void main(String[] args) {
      System.out.println(maxAverageSubArray(new int[]{1,12,-5,-6,50,3},4));
    }
public static double maxAverageSubArray(int[] array, int windowSize){
        BufferedReader reader;
        int[] kk = new int[10000];
        int jj = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\pran.sukh\\Downloads\\GOLong\\JAVA\\LEETCODE\\CrackInterviewIn75QA\\data.txt"));
            String line = reader.readLine();

            while (line != null) {
                kk[jj] = Integer.valueOf(line);
                jj++;
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        array = kk;
        windowSize = 6514;
        int left = 0;
        int right = windowSize - 1;
        double avg = 0.0;
        while (right<array.length){
            int sum = 0;
            for (int i = left; i <=right ; i++) {
                sum += array[i];
            }
            double currAvg=(double) sum/windowSize;

            if(array.length == windowSize){
                avg = currAvg;
            }else {

                avg = Double.max(avg,currAvg);
            }

            // move winodw to right
            left++;
            right++;

        }
        return avg;
    }
}
