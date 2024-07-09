package JAVA.sorting;

public class QuickSort {

    static void printArray(int array[]){
        for(int data:array){
            System.out.print(data+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = new int[]{5,3,7,2,8,1,9,4,6};
        int lowIdx = 0;
        int highIdx = array.length - 1;
        printArray(array);
        quickSort(array,lowIdx,highIdx);

    }
    static void quickSort(int array[], int lowIdx, int highIdx){
        if(lowIdx < highIdx){
            int idxOfLowestEle  = getPivot(array,lowIdx,highIdx);


            printArray(array);

            quickSort(array,lowIdx,idxOfLowestEle - 1); // left sub array, highIdx should be minimized
            quickSort(array,idxOfLowestEle + 1, highIdx); // right sub array, lowIdx should be maximized

        }

    }

    static int getPivot(int array[], int low, int highIdx){
        int pivotEle = array[highIdx]; // 6
        int idxOfLowEle = low - 1;
        for(int i=low;i<=highIdx - 1;i++){
            if(array[i] < pivotEle){
                idxOfLowEle++;
                swap(array,idxOfLowEle,i);
            }
        }
        swap(array,idxOfLowEle + 1,highIdx);
        return idxOfLowEle + 1;
    }

    static void swap(int array[], int i, int highIdx){
        int temp = array[i];
        array[i] = array[highIdx];
        array[highIdx] = temp;
    }
}
