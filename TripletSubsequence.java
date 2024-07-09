import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TripletSubsequence {

    public static void main(String[] args) {
System.out.println("Triple: "+tripletSubsequence(new int[]{2,1,5,0,4,6}));
    }
 public static boolean tripletSubsequence(int array[]){


        if(array.length < 3){
            return  false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : array) {
            if (n <= first) {
                first = n; // smallest so far
            } else if (n <= second) {
                second = n; // second smallest
            } else {
                return true; // found a triplet
            }
        }

        return false;
    }

}
