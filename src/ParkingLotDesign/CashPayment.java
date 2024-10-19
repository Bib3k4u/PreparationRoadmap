package ParkingLotDesign;


public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Logic to process cash payment
        System.out.println("Processing cash payment of: " + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "Cash"; // Return the name of the payment method
    }
}
