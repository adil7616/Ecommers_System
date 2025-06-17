import java.util.List;

public class Admin extends User{


    public Admin(int userId, String userName, String email) {
        super(userId, userName, email);
    }

    public void addProducts(List<Product> products,Product product)
    {
        products.add(product);
        System.out.println("Added "+product.getProductName());
    }
    public void removeProducts(List<Product>products,String productId)
    {
        products.removeIf(p->p.getProductId().equals(productId));
        System.out.println("product with productId "+productId+"Successfully removed");
    }
}
