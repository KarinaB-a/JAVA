package Seminar6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
//Добавить пять элементов в множество.
//Отсортировать значения используя итератор.
//Отсортированный результат сохранить в LinkedHashSet
public class task1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("28");
        set.add("29");
        set.add("30");
        set.add("25");
        set.add("25");
        System.out.println(set);
        LinkedHashSet<String> sorted = new LinkedHashSet<>();
        while (set.size() > 0) {
            Iterator<String> i = set.iterator();
            String s = i.next();
            while(i.hasNext()) {
                String v = i.next();
                if(v.compareTo(s) > 0) {
                    s = v;
                }
            }
            set.remove(s);
            sorted.add(s);
        }
        System.out.println(sorted);
 
    }
}
