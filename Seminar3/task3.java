package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Вставить элемент в список в первой позиции.
public class task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        list.add(0, "yellow");
        System.out.println(list);
    }
}
