package JAVA.sorting;

public class MergeSort {

    static void printArray(int array[],int from, int to){
        if(from>=0 && to >= 0){
            for(int i = from;i<=to;i++){
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = new int[]{5,3,7,2,8,1,9,4,6};
//      int[] array = new int[]{5,3,7};

        int l = 0;
        int r = array.length - 1;
        int len = array.length;
        sort(array,l,r);
        for(int data: array){
            System.out.print(data);
        }
    }

    static void merge(int array[],int l, int mid, int r){
        System.out.printf("%d %d %d",l,mid,r);
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = array[l + i];
        }
        for(int i=0;i<n2;i++){
            R[i] = array[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        //copy the leftover to main array
        while(i<n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k] = R[j];
            j++;
            k++;
        }

    }
    static void sort(int array[], int l, int r){

       // printArray(array,l,r);
        if(l<r){

            int mid = l + (r - l)/2;
            sort(array,l,mid);
            sort(array,mid+1,r);
            merge(array,l,mid,r);
            for(int data:array){
                System.out.print(data);
            }
            System.out.println();
        }

    }
}
