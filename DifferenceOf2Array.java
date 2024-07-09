
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class DifferenceOf2Array {
    public static void main(String[] args) {

System.out.println("differenceOf2Array: " + differenceOf2Array(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println("differenceOf2Array: " + differenceOf2Array(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
}

public static List<List<Integer>> differenceOf2Array(int[] array1, int[] array2) {


        List<List<Integer>> outterList = new ArrayList<>();
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        Set<Integer> set11 = new HashSet<>();
        Set<Integer> set12 = new HashSet<>();
        set11.addAll(set1);
        set12.addAll(set2);

        set1.removeAll(set2);
        outterList.add(set1.stream().toList());

        set12.removeAll(set11);
        outterList.add(set12.stream().toList());


        return outterList;
    }

}
