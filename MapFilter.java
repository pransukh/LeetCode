package JAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilter {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a1",0);
        map.put("a2",0);
        map.put("a3",1);
        map.put("a4",1);
        List<String> act = new ArrayList<>();
        List<String> del = new ArrayList<>();

                map.forEach((key, value) -> {
                    if (value == 0)
                        act.add(key);
                    if (value == 1)
                        del.add(key);

                });
        System.out.println(act);
        System.out.println(del);
    }
}
