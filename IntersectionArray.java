package JAVA.LEETCODE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,2,1};
        int[] array2 = new int[]{2,2};

        Set set1 = new HashSet(Arrays.asList(array1));
        Set set2 = new HashSet(Arrays.asList(array2));

        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
    }
}
