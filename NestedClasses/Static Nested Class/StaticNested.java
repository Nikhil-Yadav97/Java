public class StaticNested {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
    }
}

class Outer {
    // y belong to instance so we need obj of outer to get value of y
    int y;
    static int x = 4;

    static class Inner {
        Outer outer;
        Inner(Outer outer){
            this.outer=outer;
        }
        void fun() {
            System.out.println(x);
            System.out.println(outer.y);

        }
    }
}
