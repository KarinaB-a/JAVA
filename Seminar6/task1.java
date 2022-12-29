package Seminar6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
//Добавить пять элементов в множество.
//Отсортировать значения используя итератор.
//Отсортированный результат сохранить в LinkedHashSet
//Создать TreeSet с компаратором.
//Скопировать содержимое первого множества (HashSet) в TreeSet.
public class task1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Иванов Иван Иванович 28 м");
        set.add("Иванов Петр Иванович 29 м");
        set.add("Иванов Василий Иванович 30 м");
        set.add("Иванова Василиса Ивановна 25 ж");
        set.add("Иванов Евгений Иванович 25 м");
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
        TreeSet<String> ts = new TreeSet<>(Comparator.comparing(x -> Integer.parseInt(x.split(" ")[3])));
     
        // Добавляем элементы к набору древ
        ts.addAll(sorted);
        System.out.println(ts);
 
    }
}
