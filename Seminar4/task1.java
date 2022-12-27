//Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
//Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void sortByAge(ArrayList<List<String>> db){
        db.sort(Comparator.comparing(x -> Integer.parseInt(x.get(1))));

    }
    public static void sortByFIO(ArrayList<List<String>> db){
        db.sort(Comparator.comparing(x -> x.get(0).charAt(0)));

    }
    public static void sortBySex(ArrayList<List<String>> db){
        db.sort(Comparator.comparing(x -> x.get(2)));

    }
    public static List<String> createUser(Scanner sc) {
        System.out.print("Введите ФИО: ");
        String FIO = sc.nextLine();
        System.out.print("Возраст: ");
        String age = sc.nextLine();
        System.out.print("Пол: ");
        String sex = sc.nextLine();

        return Arrays.asList(FIO, age, sex);
    }

    public static void printDB(ArrayList<List<String>> db) {
        for (List<String> row : db) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<List<String>> db = new ArrayList<List<String>>();
        while(true) {
            System.out.print("Выберите команду:\n1 - ввести пользователя\n2 - вывести базу пользователей\n3 - выйти\n4 - сортировка по ФИО\n5 - сортировка по возрасту\n6 - сортировка по полу\n");
            String command = sc.nextLine().trim();

            if(command.equals("1")){
                db.add(createUser(sc));
            }
            else if(command.equals("2")){
                printDB(db);
            }
            else if(command.equals("3")){
                break;
            }
            else if(command.equals("4")){
                sortByFIO(db);
                printDB(db);
            }
            else if(command.equals("5")){
                sortByAge(db);
                printDB(db);
            }
            else if(command.equals("6")){
                sortBySex(db);
                printDB(db);
            }
        }
        sc.close();
        
    }
}
        
