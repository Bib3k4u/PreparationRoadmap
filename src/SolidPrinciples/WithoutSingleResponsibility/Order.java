package SingleResponsibility.WithoutSingleResponsibility;

import java.util.*;

public class Order {
    private int orderId;
    private List<String> items;
    private String customerEmail;

    public Order(int orderId, List<String> items, String customerEmail){
        this.orderId = orderId;
        this.items  = items;
        this.customerEmail = customerEmail;
    }

    //process the order
    public void processOrder(){
        if(validateOrder()){
            saveToDatabase();
            sendEmailNotification();
        }
    }

    // Save order to the database
    private void saveToDatabase() {
        System.out.println("Order saved to the database.");
        // Code to save order to the database
    }

    // Send email notification
    private void sendEmailNotification() {
        System.out.println("Email notification sent to " + customerEmail);
        // Code to send email notification
    }

    private boolean validateOrder() {
        if (items.isEmpty()) {
            System.out.println("Order validation failed: No items in the order.");
            return false;
        }
        System.out.println("Order validated successfully.");
        return true;
    }
}
