package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()) {
            if (iter.next() < 6) {
                iter.remove();
            }
        }

        numbers.forEach(System.out::println);
    }
}
