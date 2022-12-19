package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Удалить из первого списка все элементы отсутствующие во втором списке.
public class task9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("orange", "black", "pink"));
        list2.addAll(list.subList(0, 1));
        System.out.println(list);
        System.out.println(list2);
        List<String> result = list
            .stream()
            .filter(item -> list2.indexOf(item) >= 0)
            .collect(Collectors.toList());
        System.out.println(result);
    }
}
