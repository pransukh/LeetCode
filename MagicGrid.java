public class MagicGrid {

    static int MG = 0;

    static int sums[] = new int[8];

    public static void main(String[] args) {
        System.out.println(doProcess(new int[][]{{3, 2, 1, 6}, {5, 9, 6, 8}, {1, 5, 1, 2}, {3, 7, 3, 4}}));
        System.out.println(doProcess(new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}}));
        System.out.println(doProcess(new int[][]{{1, 8, 6}, {10, 5, 0}, {4, 2, 9}}));
        System.out.println(doProcess(new int[][]{{9, 8, 3}, {4, 5, 6}, {7, 2, 1}}));
    }
    public static int doProcess(int[][] grid) {
        MG = 0;

        int startR = 0;
        int startC = 0;
        int endC = 2;
        boolean keepRunning = true;
        if (grid.length < 3 || grid[0].length < 3) {
            return 0;
        }
        while (keepRunning) {

            int[][] subGrid = getGrid(startR, startC, endC, grid);
            MG += processSubGrid(subGrid);
            if (endC == grid[0].length - 1) {

                startR += 1;
                startC = 0;
                endC = 2;
                if (grid.length - startR < 3) {
                    System.out.println("we are done");
                    keepRunning = false;
                }
            } else {
                System.out.println("next grid");
                startC += 1;
                endC += 1;
            }

        }
        return MG;

    }
    public static int processSubGrid(int[][] grid) {
        int cSum = 0;
        int rSum = 0;
        int firtColSumToMatchWithOthers = 0;
        int firtRowSumToMatchWithOthers = 0;
        int MG = 0;
        boolean error = false;
        outter: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if ((i != j && grid[i][j] == grid[j][i])) {
                    error = true;
                    break outter;
                }
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    error = true;
                    break outter;
                }
                rSum += grid[i][j];
                cSum += grid[j][i];
            }
            if (firtRowSumToMatchWithOthers == 0 && firtColSumToMatchWithOthers == 0) {
                firtRowSumToMatchWithOthers = rSum;
                firtColSumToMatchWithOthers = cSum;
            }
            if (firtRowSumToMatchWithOthers != rSum || firtColSumToMatchWithOthers != cSum) {
                error = true;
                break outter;
            } else {
                error = false;
            }
            rSum = 0;
            cSum = 0;
        }
        if (!error) {
            int d1 = grid[0][0] + grid[1][1] + grid[2][2];
            int d2 = grid[2][0] + grid[1][1] + grid[0][2];
            if (d1 != d2) {
                return 0;
            } else {
                MG = 1;
            }
        }

        return MG;
    }

    public static int[][] getGrid(int rowNumber, int colStart, int colEnd, int[][] mainGrid) {

        int[][] subGrid = new int[3][3];
        int insertingRowIdx = 0;
        int insertingColIdx = 0;

        for (int row = rowNumber; row <= rowNumber + 2; row++) {

            for (int col = colStart; col <= colEnd; col++) {

                subGrid[insertingRowIdx][insertingColIdx] = mainGrid[row][col];
                insertingColIdx += 1;

            }
            insertingColIdx = 0;
            insertingRowIdx += 1;
        }
        return subGrid;
    }

}
