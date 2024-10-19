package ParkingLotDesign;


public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of: " + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card"; // Return the name of the payment method
    }
}
