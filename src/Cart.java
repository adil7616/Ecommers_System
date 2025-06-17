import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    private List<Product> products= new ArrayList<>();

    public void addProducts(Product product)
    {
        products.add(product);
    }
    public void deleteProduct(String productId)
    {
        Iterator<Product>iterator= products.iterator();
        while (iterator.hasNext())
        {
            Product product=iterator.next();
            if(product.getProductId().equals(productId))
            {
                iterator.remove();
                break;
            }
        }

    }
    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice()
    {
        Iterator<Product>iterator=products.iterator();
        double totalAmount=0.0;
        while(iterator.hasNext())
        {
            Product product=iterator.next();
            totalAmount+=product.getPrice();
        }
        return totalAmount;
    }

}
