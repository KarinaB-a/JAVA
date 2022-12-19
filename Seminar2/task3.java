package Seminar2;

import java.util.Scanner;

//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
public class task3 {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hi my world!");
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Result");
        System.out.println(reverseString(str));
        sc.close();
    }
}
