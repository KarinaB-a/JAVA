package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Поиска элемента в списке по строке.
public class task7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        String result = list.stream()
            .filter(item -> item.contains("ue"))
            .findAny()
            .orElse(null);
        System.out.println(result);
    }
}
