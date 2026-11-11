import java.util.*;

public class Prog1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Neymar");
        set.add("Messi");
        set.add("Ronaldo");
        System.out.println(set.contains("Ronaldo"));


        Map<Integer,String> map=new HashMap<>();

        map.put(23,"Nikhil");
        map.put(22,"Yadav");

        System.out.println(map.containsKey(22));
        System.out.println(map.get(22));
    }

}
