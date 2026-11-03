// basic enum syntax
public class Prog2 {
    public static void main(String[] args) {
        // return obj
         PaymentStatus status = PaymentStatus.FAILED;

        System.out.println(status.name());
    }
}


enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}