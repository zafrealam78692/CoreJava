package com.kodewala.abstraction1;
public class OrderService {
    // Public method exposed to other classes
    public void placeOrder(String product, int quantity) {
        validateOrder(product, quantity);
        processPayment();
        updateInventory();
        System.out.println("Order placed successfully for: " + product);
    }
    // Hidden core functionalities
    private void validateOrder(String product, int quantity) {
        if (product == null || product.isEmpty() || quantity <= 0) {
            throw new IllegalArgumentException("Invalid order details");
        }
        System.out.println("Order validated.");
    }

    private void processPayment() {
        System.out.println("Payment processed.");
    }
    private void updateInventory() {
        System.out.println("Inventory updated.");
    }
}
// Other classes use the order service
class Customer {
    public void purchaseProduct() {
        OrderService order = new OrderService() {};
        order.placeOrder("Laptop", 1);
    }
}


