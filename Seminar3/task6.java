package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Удалить третий элемент из списка.
public class task6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("red", "blue", "green"));
        list.remove(2);
        System.out.println(list);
    }
}
