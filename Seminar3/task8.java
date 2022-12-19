package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создать новый список и добавить в него несколько елементов первого списка.
public class task8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("orange", "black", "pink"));
        list2.addAll(list.subList(0, 2));
        System.out.println(list);
        System.out.println(list2);
    }
}
