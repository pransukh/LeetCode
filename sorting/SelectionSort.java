package JAVA.sorting;

public class SelectionSort {

    static void swap(int array[],int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
    public static void main(String[] args) {
       int[] array = new int[]{5,3,7,2,8,1,9,4,6};

        for(int i = 0;i<=array.length - 1;i++){
            int min = i;
            for(int j = i + 1;j<=array.length - 1;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for(int data:array){
            System.out.print(data);
        }
    }
}
