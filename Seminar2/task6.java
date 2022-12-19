package Seminar2;

import java.util.Scanner;

//*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a number1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a number2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n1)
            .append(" + ")
            .append(n2)
            .append(" = ")
            .append(n1+n2)
            .append(" ")
            .append(n1)
            .append(" - ")
            .append(n2)
            .append(" = ")
            .append(n1-n2)
            .append(" ")
            .append(n1)
            .append(" * ")
            .append(n2)
            .append(" = ")
            .append(n1*n2);
        String res = sb.toString();
        // System.out.println("Result: "+res);

        StringBuilder sb1 = new StringBuilder(res);
        int i = sb1.indexOf("=");
        while (i>=0){
            i = sb1.replace(i, i+1, "равно").indexOf("=");
        }
        System.out.println("Result: "+sb1.toString());

        sc.close();
    }
}
