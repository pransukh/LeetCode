import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueOccurrence {
    public static void main(String[] args) {
System.out.println("Unique: E T "+uniqueOccurrence(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
        System.out.println("Unique: E F "+uniqueOccurrence(new int[] {1,2}));
        System.out.println("Unique: E T "+uniqueOccurrence(new int[] {1,2,2,1,1,3}));
        System.out.println("Unique: E T "+uniqueOccurrence(new int[] {5,-2,-2,1,5,-2}));
}

public static boolean uniqueOccurrence(int[] array){
        if(array.length == 1){
            return true;
        }
        if(array.length == 2 && array[0] != array[1]) return false;
        Set<Integer> occurrence = new HashSet<>();
        int counter = 0;
        Arrays.sort(array);
        int j = 0;
        for (int i = 0; i <array.length ;) {

            while (j<array.length ){
                if(array[i] == array[j]){
                    counter+=1;

                }else {
                    break;
                }
                j++;

            }
            counter = counter == 1 ? counter - 1: counter;
            boolean res = occurrence.add(counter);
            if(!res){
                return false;
            }
            counter  = 0;
            i = j;
        }
        return true;
    }
}
