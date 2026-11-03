public class Prog6 {
    public static void main(String[] args) {
        // can make obj of Box class with datatype that which implement Swimmable and extend animal
        Box<Fish> b1 = new Box<>();
    }
}

class Box<T extends Animal & Swimmable> {
    T value;
}

class Animal {
    void display() {
        System.out.println("Displaying Animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {

}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
