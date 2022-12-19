package Seminar2;

import java.util.Scanner;

//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
public class task2 {
    public static String reverseString(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
    }  
    public static void main(String[] args) {
        System.out.println("Hi my world!");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str = sc.nextLine(); 
        System.out.print("Search: "); 
        String strTo = sc.nextLine();
        System.out.println("You have entered: "+str);      
        System.out.println("Trying find "+strTo);  
        System.out.println("Result");  
        System.out.println(str.equals(reverseString(strTo)));
        sc.close();
    }
}
