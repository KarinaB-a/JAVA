package Seminar3;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Итерация всех элементов списка цветов и добавления к каждому символа '!'.
public class task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "blue", "green");
        ListIterator<String> i = list.listIterator();
        while (i.hasNext()) {
            String v = i.next();
            i.set(v + "!");
        }
        System.out.println(list);
    }
}
