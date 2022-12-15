package Seminar2;

import java.util.Scanner;

//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a number1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a number2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n1);
        sb.append(" + ");
        sb.append(n2);
        sb.append(" = ");
        sb.append(n1+n2);
        sb.append(" ");
        sb.append(n1);
        sb.append(" - ");
        sb.append(n2);
        sb.append(" = ");
        sb.append(n1-n2);
        sb.append(" ");
        sb.append(n1);
        sb.append(" * ");
        sb.append(n2);
        sb.append(" = ");
        sb.append(n1*n2);
        System.out.println("Result: "+sb.toString());
        sc.close();
    }
}
