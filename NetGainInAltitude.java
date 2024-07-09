import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class NetGainInAltitude {
    public static void main(String[] args) {
    System.out.println(netGainInAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
      
    }

public static int netGainInAltitude(int[] altitudeArray) {
        int max = 0;
        int gain = 0;
        int i = 0;
        while (i < altitudeArray.length) {
            gain += altitudeArray[i];
            if (gain > max)
                max = gain;
            i++;
        }
        return max;
    }
}
