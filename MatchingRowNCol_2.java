import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MatchingRowNCol_2 {
    public static void main(String[] args) {
System.out.println("MachingGrid_2: E 1 "+matchingRowNCol_2(new int[][] {{3,2,1},
                                                                                {2,7,6},
                                                                                {1,7,7}}));
        System.out.println("MachingGrid_2: E 3 "+matchingRowNCol_2(new int[][] {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println("MachingGrid_2: E 0 "+matchingRowNCol_2(new int[][] {{3,1,},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println("MachingGrid_2: E 2 "+matchingRowNCol_2(new int[][] {{11,1},{1,11}}));
}


public static int matchingRowNCol_2(int[][] grid){

        int counter = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        if(rows != cols) return 0;

        for (int row = 0; row < grid.length ; row++) {

            for (int col = 0; col < grid.length ; col++) {
                counter+=1;
                int ele = grid[row][col];
                for (int iR = 0; iR < rows ; iR++) {
                    if(grid[row][iR]!=grid[iR][col]){
                        counter-=1;
                        break;
                    }
                }
            }
        }
        return counter;
    }

}
