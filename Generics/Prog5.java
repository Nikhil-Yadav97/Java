public class Prog5 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        // Number class ensure the values are of number type not sting or other things
        b1.value = 5;
        b1.printDouble();
    }
}
// Generics --> T can be anything
// Bounds in Generics
// Upper bound --> T is atleast Number or its subtype


// Number extended by all int float double classes
class Box<T extends Number> {
    T value;

    public void printDouble() {
        // doubleValue fn is in all Number extended classse like integer flaot double 
        // print number in double format 
        System.out.println(value.doubleValue());
    }
}