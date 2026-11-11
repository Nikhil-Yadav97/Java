import java.util.*;

public class Prog3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        TreeSet<Integer> set2 = new TreeSet<>(List.of(3, 5, 1, 0));

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(200);
        set.add(100);

        // sorted set interface O(LogN)
        System.out.println(set.first()); // smallest
        System.out.println(set.last()); // largest

        System.out.println(set.headSet(80)); // smaller then 80 is exclusive
        System.out.println(set.tailSet(80)); // larger then 80 is inclusive
        System.out.println(set.subSet(20,80)); // inclusive 20 and exclusive 80

         // // largest number smaller then 80
    //     System.out.println(set.lower(10));

    //     // greatest element less thern or equal to 80
    //     System.out.println(set.floor(10));

    //     //smallest no. greater then 80
    //     System.out.println(set.higher(80));

    //     // smallest no. greater then or equal to 80
    //     System.out.println(set.ceiling(80));

    
    // System.out.println(set.pollFirst()); give smallest and pop it 
    // System.out.println(set.pollLast()); give largest and pop it
    // System.out.println(set.descendingSet());
    
    // Iterator<Integer> it = set.descendingIterator();
    
    // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }
        
        System.out.println(set.headSet(80, true));
        set.tailSet(80, false);
        set.subSet(10, false, 80, true);
        
    }
}
