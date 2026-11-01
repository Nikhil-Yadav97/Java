
public class toString {
    public static void main(String[] args) {
        Student s1 = new Student("Nikhil", 22);
        // System.out.println(s1.toString());
        // print this->>Student@28a418fc
        System.out.println(s1.toString());
    }
}

// class student extends Object internal implementation
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name->>" + this.name + "\n" + "age-->" + this.age;
    }
}
