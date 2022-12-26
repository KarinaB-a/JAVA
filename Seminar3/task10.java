package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//*Сортировка списка.
public class task10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        list.sort(Comparator.comparing((String x) -> x));
        
        System.out.println(list);

    }
}
