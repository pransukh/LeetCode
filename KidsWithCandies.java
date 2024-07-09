import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class KidsWithCandies {

    public static void main(String[] args) {
      int[] kidsWithCandies = {12,1,12};
        int extraCandies = 10;
        boolean[] resutl = candies(kidsWithCandies,extraCandies);
        for(boolean data : resutl){
            System.out.println(data);
        }
    }

  public static boolean[] candies(int[] kidsWithCandies, int extraCandies){
        boolean[] result = new boolean[kidsWithCandies.length];
        int currentMax = kidsWithCandies[0];
        int i =1;
        while (i< kidsWithCandies.length){
            if(kidsWithCandies[i] > currentMax ){
                currentMax = kidsWithCandies[i];
            }
            i++;
        }
        for (int j = 0; j < kidsWithCandies.length ; j++) {
            result[j] = kidsWithCandies[j] + extraCandies >= currentMax ;
        }
        return result;
    }

}
