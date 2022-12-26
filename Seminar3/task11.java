package Seminar3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//*Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
public class task11 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        long s = System.currentTimeMillis();
        for(int i =0; i < 100_000; i++) {
            list.add(0, "yellow");
        }
        System.out.printf("Result ArrayList: %d\n", System.currentTimeMillis()-s);

        List<String> list2 = new LinkedList<String>();

        s = System.currentTimeMillis();
        for(int i =0; i < 100_000; i++) {
            list2.add(0, "yellow");
        }
        System.out.printf("Result LinkedList: %d\n", System.currentTimeMillis()-s);

        
    }
}
