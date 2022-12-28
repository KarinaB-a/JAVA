package Seminar5;

import java.util.HashMap;

//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
//Изменить значения сделав пол большой буквой.
public class task1 {
   public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "Иванов Иван Иванович 28 м");
    map.put(2, "Иванов Петр Иванович 29 м");
    map.put(3, "Иванов Василий Иванович 30 м");
    map.put(4, "Иванова Василиса Ивановна 25 ж");
    map.put(5, "Иванов Евгений Иванович 25 м");
    System.out.println(map);
    map.put(1, "Иванов Иван Иванович 28 М");
    System.out.println(map);


   } 
   
}
