
public class Prog1 {
    public static void main(String[] args) {
        // used when want to ovveide any fn for particular obj only
        String name="Nikhil";
        Person p1=new Person(){
            @Override 
            void introduce(){
                System.out.println("Insaan nahi insane hoo");
                // cant call greet using p1 as Person dont have this fn but can call it locally inside overriden fn 
                greet();
            }

            void greet(){
                System.out.println("hello i am fine");
            }
        };
        p1.introduce();
    }
}

class Person{
    void introduce(){
        System.out.println("Hello I am Human");
    }
}

// instead of doing this use anonymous class
// class Guest extends Person {
//     @Override
//     void introduce() {
//         System.out.println("Hi, I am a Guest");
//     }
// }