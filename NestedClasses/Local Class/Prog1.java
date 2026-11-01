public class Prog1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

class Outer {
    void greet() {
        int y = 5;

        // rule of effective final
        // cant do this either declar final or dont change the vairables
        // y++;

        class Local {
            void sayHello() {
                System.out.println(y);
            }
        }

        Local local = new Local();
        local.sayHello();
    }
}
/* can be created inside these blocks
Contructor
Method
If
Loop
Static block
*/