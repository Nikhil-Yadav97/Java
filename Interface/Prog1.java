public class Prog1 {
    public static void main(String[] args) {
        Payment p1=new CreditCard();
        p1.pay();
        Payment p2=new UPI();
        p2.pay();

    }    
}

interface Payment{
    void pay();
}


class CreditCard implements  Payment{
    @Override 
    public void pay(){
        System.out.println("You paid by credit card");
    }

}

class UPI implements  Payment{
    @Override 
    public void pay(){
        System.out.println("You paid by UPI");
    }

}