public class Prog2 {
    public static void main(String[] args) {
        MathConstant m=new Random();
        m.fun();

        // can do this also
        System.out.println(MathConstant.PI);
    }
}

interface MathConstant{
    double PI = 3.14;
    // internally public static final
    int VALUE=10;
    void fun();
}

class Random implements MathConstant{
    @Override 
    public void fun(){
        System.out.println(PI);
    }
}
