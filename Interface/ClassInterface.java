
 public class ClassInterface {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

// Java Resolution priority rule

interface A {
    default void fun() {
        System.out.println("Inside A interface");
    }
}

// class B get higher priority than A if want to give higher Prioirty to A then can overrid A.super.fun() 
class B {
    public void fun() {
        System.out.println("Inside B class");
    }
}

class C extends B implements A {
    @Override
    public void fun() {
        A.super.fun();
        System.out.println("Inside C class");
    }
} 
