package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program {
    public static int getI(int k) {
        // Задача 1
        int i = new Random().nextInt(k);
        return i;
    }
    public static int getN(int i) {
        // Задача 2
        int n = 0; //старший значащий бит
        while(i>0) {
            i = i/2;
            n++;
        }
        return n;
    }
    public static List<Integer> getM1(int i,int n) {
        // Задача 3
        List<Integer> m1 = new ArrayList<Integer>();  
        for (int z = i; z <= Short.MAX_VALUE; z++) {
            if(z%n == 0) {
                m1.add(z);
            }
        }
        return m1;
    }
    public static List<Integer> getM2(int i,int n) {
        // Задача 4
        List<Integer> m2 = new ArrayList<Integer>();  
        for (int z = Short.MIN_VALUE; z <= i; z++) {
            if(z%n != 0) {
                m2.add(z);
            }
        }
        return m2;
    }
    public static void main(String[] args) {
        System.out.println("Hi my world!");
        int i = getI(2000);
        System.out.println(i);
        // Задача 2
        int n = getN(i);
        System.out.println(n);
        // Задача 3
        List<Integer> m1 = getM1(i,n);
        System.out.println(m1);
        // Задача 4
        List<Integer> m2 = getM2(i,n);
        System.out.println(m2);
    }   
}
