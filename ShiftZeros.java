import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ShiftZeros {

    public static void main(String[] args) {
System.out.println("Shift Zero: ");
        int array[] = new int[]{0,1,0,3,12};
        shiftZeros(array);
        for (int data:array){
            System.out.println(data);
        }
    }

 public static void shiftZeros(int[] array){
        int left = 0;

        for (int right = 0; right<array.length ; right++) {
            if(array[right] != 0){
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
            }
        }

    }

}
