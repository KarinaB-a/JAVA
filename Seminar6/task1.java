package Seminar6;

import java.util.HashSet;

//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
//Добавить пять элементов в множество.
public class task1 {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.add("Иванов Иван Иванович 28 м");
        map.add("Иванов Петр Иванович 29 м");
        map.add("Иванов Василий Иванович 30 м");
        map.add("Иванова Василиса Ивановна 25 ж");
        map.add("Иванов Евгений Иванович 25 м");
        System.out.println(map);
    }
}
