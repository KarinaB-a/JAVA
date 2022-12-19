package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Извлечь элемент (по указанному индексу) из заданного списка.
public class task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        System.out.println(list.get(1));
    }
}
