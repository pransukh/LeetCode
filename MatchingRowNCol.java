import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MatchingRowNCol {
    public static void main(String[] args) {

    System.out.println("MachingGrid: E 1 "+matchingRowNCol(new int[][] {{3,2,1},{1,7,6},{2,7,7}}));
        System.out.println("MachingGrid: E 3 "+matchingRowNCol(new int[][] {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println("MachingGrid: E 0 "+matchingRowNCol(new int[][] {{3,1,},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println("MachingGrid: E 2 "+matchingRowNCol(new int[][] {{11,1},{1,11}}));
}

public static int matchingRowNCol(int[][] grid){

        int counter = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        if(rows != cols) return 0;
        String[] rowss = new String[rows];
        String[] colss = new String[cols];
        //Match First Row will all cols
        outter:for (int row = 0; row < rows; row++) {
            String sRow = "";
            String sCol = "";
            inner:  for (int col = 0; col < cols ; col++) {
                    int ele = grid[row][col]; // 3
                    int ele2 = grid[col][row]; // 3

                if(col != cols-1) sRow+=String.valueOf(ele)+",";
                else sRow+=String.valueOf(ele);
                if(col != cols-1) sCol+=String.valueOf(ele2)+",";
                else sCol+=String.valueOf(ele2);
                }

                rowss[row] = sRow;
                colss[row] = sCol;


            }



        for (int i = 0; i < rowss.length ; i++) {
            for (int j = 0; j < rowss.length ; j++) {
                if(rowss[i].equalsIgnoreCase(colss[j])) counter+=1;
            }
        }
        return counter;
    }

}
