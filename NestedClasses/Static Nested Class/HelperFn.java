public class HelperFn {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.computeInterest(1000));
    }
}

class BankAccount {
    // using class as helper fn 
    private static class InterestCalculator {
        static double calculateYear(double principle, double rate) {
            return rate * principle;
        }
    }

    public double computeInterest(double principle) {
        return InterestCalculator.calculateYear(principle, 0.09);
    }
}
