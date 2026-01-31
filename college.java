interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount);
        System.out.println("Status: Fetching card details and authorizing...");
    }
}

class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment " + amount);
        System.out.println("Status: Validating PIN...");
    }
}

class PaymentService {
    public void executeTransaction(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
        System.out.println("Transaction completed successfully!\n");
    }
}

public class college{
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        System.out.println("Payment System");

        Payment myCard = new CreditCardPayment();
        service.executeTransaction(myCard, 5000.00);

        Payment myUPI = new UPIPayment();
        service.executeTransaction(myUPI, 1200.50);
    }
}