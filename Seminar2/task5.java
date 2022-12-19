package Seminar2;

import java.util.Scanner;

//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
public class task5 {
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
            i = sb1.deleteCharAt(i).insert(i, "равно").indexOf("=");
        }
        System.out.println("Result: "+sb1.toString());

        sc.close();
    }
}


