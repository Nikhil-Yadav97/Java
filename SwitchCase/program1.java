// use break if one cond is true the other below stmt will exe irrespective of checking the cases
public class program1 {
    public static void main(String[] args) {
        int value=1;
        switch (value) {
            case 1:
                System.out.println("This is the correct case");
                break;
            case 2:
                System.out.println("wrong case this is case 2 ");
                break;
            case 3:
                System.out.println("wrong case this is case 3");
                break;
                
            default:
                System.out.println("this is default");
                break;
        }
    }
}
