import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(1));// take index

        list.set(0, 3); // at index 0 set 3

        list.addAll(0, List.of(4, 5, 3));// at elements at index 0 and do shifting
        list.add(4);
        System.out.println(list);

        System.out.println(list.indexOf(4));// first index
        System.out.println(list.lastIndexOf(4));// last index

        ListIterator<Integer> it = list.listIterator();// this iterator give more functionality can move back and
                                                       // forward using iterator
        // ListIterator<Integer> it = list.listIterator(3);
        // iterator from index 3 onwaards
        while (it.hasNext()) {
            // it.hasPrevious() to iterate backward
            System.out.println(it.next());
            // it.previous()
        }

        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        l.add(9);
        System.out.println(l);
    }
}
