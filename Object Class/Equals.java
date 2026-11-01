
public class Equals {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nikhil";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Nikhil";
        s2.age = 22;

        // System.out.println(s1.equals(s2));
        // gives false

        System.out.println(s1.equals(s2));
    }
}

class Student extends Object {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;

        // need to be converted into Student 
        Student s=(Student)obj;
        return (this.name == s.name) && (this.age == s.age);
    }
}
