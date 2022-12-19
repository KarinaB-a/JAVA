package Seminar2;

import java.util.Scanner;

//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a number1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a number2: ");
        int n2 = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000; i++)
            sb.append(n1)
                .append(" + ")
                .append(n2)
                .append(" = ")
                .append(n1+n2);
            
        String res = sb.toString();

        long s = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder(res);
        int i = sb1.indexOf("=");
        while (i>=0){
            i = sb1.replace(i, i+1, "равно").indexOf("=");
        }
        System.out.printf("Result StringBuilder: %d \n", System.currentTimeMillis()-s );

        s = System.currentTimeMillis();
        i = res.indexOf("=");
        while (i>=0){
            res = res.substring(0, i) +"равно"+ res.substring(i+1);
            i = res.indexOf("=");
        }
        System.out.printf("Result String: %d\n", System.currentTimeMillis()-s);

        sc.close();
    }
}

