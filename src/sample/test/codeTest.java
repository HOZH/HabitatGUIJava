package sample.test;

import java.util.HashSet;
import java.util.Iterator;

public class codeTest {

    public static void main(String[] args) {


        HashSet<Integer> thatset = new HashSet<>();

        for (int i = 0; i < 10; i++)
            thatset.add(i)
                    ;

        Iterator<Integer> iter1 = thatset.iterator();
        Iterator<Integer> iter2 = thatset.iterator();
        while (iter1.hasNext()) {
            if (iter1.next() == 8) break;
            System.out.println(iter2.next());
        }

    }
}
