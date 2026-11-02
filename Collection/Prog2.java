import java.util.*;

public class Prog2 {
    public static void main(String[] args) {
        Collection<Integer> c= new ArrayList<>();
        c.add(8);
        c.add(5);
        c.add(3);
        c.add(4);

        int size=c.size();
        System.out.println(size);

        System.err.println(c.isEmpty());

        System.out.println(c.contains(3));

        // can give array from llist stack queue but it return object class obj array need to typecast first
        Object []obj=c.toArray();

        for(Object o : obj){
            System.out.println(o);
        }


        Integer[] arr2=new Integer[0];
        // this tell toArray fn to convert to Integer array
        Integer[] arr=c.toArray(arr2);
        // OR 
        // Integer[] arr=c.toArray(new Integer[0]);


        for(Integer i : arr)
        {
            System.out.println(i);
        }

        boolean b=c.add(8);
        System.out.println(b);

        System.out.println(c.remove(2));
        // true if 2 is removed else false 
        // in case of set that doesnt have 2 return false

        c.addAll(List.of(2,4,5,6));

        System.out.println(c.containsAll(List.of(1,2,3)));
        // true if all ele are there 

        c.removeAll(List.of(1,2));

        c.retainAll(List.of(3,4));
        // remove other ele except 3,4


        c.clear();
    }
}
