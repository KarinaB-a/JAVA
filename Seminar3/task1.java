package Seminar3;

import java.util.ArrayList;
import java.util.List;

//Создать новый список, добавить несколько строк и вывести коллекцию на экран.
public class task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("summer");
        list.add("autumn");
        list.add("winter");
        list.add("spring");
        System.out.println(list);
    }
}
