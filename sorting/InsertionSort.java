package JAVA.sorting;

public class InsertionSort {
    static int[] array = new int[]{4,3,2,1,5,8,6,9,7};



    public static void main(String[] args) {
        insertionSort(array);
        for(int data:array){
            System.out.println(data);
        }
    }

    static void insertionSort(int [] array){
        for(int i=1;i<array.length;i++){
            int key = array[i]; // 4
            int j = i-1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] =key;
        }
    }
}
