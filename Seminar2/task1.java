package Seminar2;

import java.util.Scanner;

//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
public class task1 {
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
        System.out.println(str.toLowerCase().indexOf(strTo.toLowerCase(), 0));

    }
}
