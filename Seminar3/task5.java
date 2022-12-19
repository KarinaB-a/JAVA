package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Обновить определенный элемент списка по заданному индексу.
public class task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        list.set(1, "white");
        System.out.println(list);
    }
}
