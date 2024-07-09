package JAVA.sorting;

public class BubbleSort {
    static int[] array = new int[]{4,3,2,1,5};
    public static void main(String[] args) {
        sort(array,array.length);
        for(int data: array){
            System.out.println(data);
        }
    }

    static void sort(int[]  array, int len){
        for(int i=0;i<len;i++){

            for(int j=i+1;j<len;j++){
                int eleCurr = array[i];
                int eleNext = array[j];
                if(eleCurr > eleNext){
                    swap(array,i,j);
                }

            }
        }
    }


    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
