

public class LuckyNumber {
    public static void main(String[] args) {
//        int[][] array = {
//                {1, 10, 4, 2},
//                {9, 3, 8, 7},
//                {15, 16, 17, 12}
//        };
//        int[][] array = {
//                {3, 7, 8},
//                {9, 11, 13},
//                {15, 16, 17}
//        };
//        int[][] array = {
//                {7, 8},
//                {1, 2}
//        };
        int[][] array = {
                {3, 6},
                {7, 1},
                {5, 2},
                {4, 8}
        };


        System.out.println(LuckyNumber.luckyNumber(array));
    }

    static int luckyNumber(int[][] nums) {

        int min = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < nums.length; i++) {
            min = nums[i][0];
            row = i;
            col = 0;
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] < min) {
                    min = nums[i][j];
                    col = j;
                }
            }
            if(!checkGreaterInCol(nums,row, col)){
                continue;
            }else{
                return nums[row][col];
            }
        }
        return -1;
    }
    static boolean checkGreaterInCol(int[][] nums,int row, int col){
        int max = nums[row][col];
        for (int i = 0; i < nums.length; i++) {

            if(nums[i][col] > max){
                return false;
            }
          }
        return true;
    }
}
