import java.util.List;
import java.util.UUID;

public class Order {

    private String orderId;
//    private Product products;
    private List<Product> products;
    private double totalPrice;

    public Order( List<Product> products, double totalPrice) {
        this.orderId = UUID.randomUUID().toString();
        this.products = products;
        this.totalPrice = totalPrice;
    }


    public void printOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Items:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total: ₹" + totalPrice);
    }
}
