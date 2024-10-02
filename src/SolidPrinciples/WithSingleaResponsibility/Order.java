package SingleResponsibility.WithSingleaResponsibility;

import java.util.List;

class Order {
    private int orderId;
    private List<String> items;
    private String customerEmail;

    public Order(int orderId, List<String> items, String customerEmail) {
        this.orderId = orderId;
        this.items = items;
        this.customerEmail = customerEmail;
    }

    public List<String> getItems() {
        return items;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getOrderId() {
        return orderId;
    }
}

class OrderValidator {
    public boolean validate(Order order) {
        if (order.getItems().isEmpty()) {
            System.out.println("Order validation failed: No items in the order.");
            return false;
        }
        System.out.println("Order validated successfully.");
        return true;
    }
}

class OrderRepository {
    public void save(Order order) {
        System.out.println("Order with ID " + order.getOrderId() + " saved to the database.");
        // Logic for saving order to the database
    }
}

class EmailService {
    public void sendOrderConfirmation(String customerEmail) {
        System.out.println("Email notification sent to " + customerEmail);
        // Logic for sending email notification
    }
}

class OrderProcessor {
    private OrderValidator validator;
    private OrderRepository repository;
    private EmailService emailService;

    public OrderProcessor(OrderValidator validator, OrderRepository repository, EmailService emailService) {
        this.validator = validator;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void process(Order order) {
        if (validator.validate(order)) {
            repository.save(order);
            emailService.sendOrderConfirmation(order.getCustomerEmail());
        }
    }
}



