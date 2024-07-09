import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FlowerBed {

    public static void main(String[] args) {
      int[] flowerBed = {0,1,0};
        int plantsToBePlanted = 1;
        System.out.println("FLowers plated : "+flowerBed(flowerBed,plantsToBePlanted));

    }
   public static boolean flowerBed(int[] flowerBed, int numberOfNewPlants){
        for (int i = 0; i < flowerBed.length ; i++) {

            boolean leftSide = i == 0 || flowerBed[i -1]==0;
            boolean rightSide = i == flowerBed.length -1 || flowerBed[i + 1] == 0;

            if(leftSide && rightSide && flowerBed[i] == 0){
                flowerBed[i] = 1;
                numberOfNewPlants--;
            }

        }
        return numberOfNewPlants <=0;
    }
}
