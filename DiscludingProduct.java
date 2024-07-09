package JAVA.LEETCODE.CrackInterviewIn75QA;

public class DiscludingProduct {
    public static void main(String[] args) {
        new DiscludingProduct().process(new int[]{1,2,4,6,0});
        new DiscludingProduct().process2(new int[]{1,2,4,6,0});
    }

    private void process(int[] array){
//        48, 24, 12, 8,
//        1,2,4,6
//        1,1,2,8
//
        int[] sol = new int[array.length];
        int left = 1;
        int right = 1;

        for (int i = 0 ;i< array.length;i++){
            sol[i] = left;
            left *= array[i];
        }

        for (int i = array.length -1 ;i >= 0;i--){
            sol[i] *= right;
            right *= array[i];
        }

        for (int k : sol){
            System.out.print(k+", ");
        }
    }

    void process2(int[] array){
        System.out.println();
        boolean zeroFound = false;
        int idx = -1;
        int product = 1;
        for(int d : array){
            idx += 1;
            if(d != 0){
                product*=d;
            }else{
                zeroFound = true;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                array[i] = product/array[i];
            }
        }
        for(int d : array){
            System.out.print(d+", ");
        }
    }
}
