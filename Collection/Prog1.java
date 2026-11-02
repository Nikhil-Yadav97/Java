import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        Collection<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(7);
        arr.add(5);
        arr.add(4);

        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
