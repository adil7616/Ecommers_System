import java.util.ArrayList;
import java.util.List;

public class ECommersSystem {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Admin admin= new Admin(1,"Adil","adilmansuri7616@gmail.com");


        // product added by admin

        admin.addProducts(products,new Product("P001","Laptop",58000.56));
        admin.addProducts(products,new Product("p002","KeyBoard",1500.15));
        admin.addProducts(products,new Product("p003","Mouse",5800.46));

        // create user for shopping
        User user = new User(1,"Adil Mansuri","adilmansuri1401322@gmail.com");

        Cart c1= new Cart();
        c1.addProducts(products.get(0));
        c1.addProducts(products.get(2));
        c1.addProducts(products.get(1));

        c1.getProducts();
        double total_Price= c1.getTotalPrice();

        Order order= new Order(c1.getProducts(),total_Price);
        order.printOrderDetails();

        // Payment details

        Payment payment= new UpiPayment();
        payment.pay(total_Price);

        //  Notification

        Notification notification= new SmsNotification(user.getEmail());
        notification.send("Your order has been placed successfully. Total: ₹" + total_Price);
    }
}