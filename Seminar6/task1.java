package Seminar6;

import java.util.HashSet;

//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
public class task1 {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.put(1, "Иванов Иван Иванович 28 м");
        map.put(2, "Иванов Петр Иванович 29 м");
        map.put(3, "Иванов Василий Иванович 30 м");
        map.put(4, "Иванова Василиса Ивановна 25 ж");
        map.put(5, "Иванов Евгений Иванович 25 м");
        System.out.println(map);
}
