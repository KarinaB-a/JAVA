package Seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
//Изменить значения сделав пол большой буквой.
//Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
//*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
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
        for (Integer key : map.keySet()) {
            String[] a = map.get(key).split(" ");
            System.out.printf("%s %s.%s.\n", a[0], a[1].substring(0, 1), a[2].substring(0, 1));
        }
        List<String> values = new ArrayList<>(map.values());
        values.sort(Comparator.comparing(x -> Integer.parseInt(x.split(" ")[3])));
        for (String i : values) {
            String[] a = i.split(" ");
            System.out.printf("%s %s.%s. %s %s\n", a[0], a[1].substring(0, 1), a[2].substring(0, 1), a[3], a[4]);
        }

    }
}
