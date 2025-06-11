package ss12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private List<Product> products= new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public boolean removeProduct(String id){
        Product product = findProduct(id);
        if(product != null){
            products.remove(product);
            return true;
        }
        return false;
    }
    public void printProducts(){
        for(Product product: products){
            System.out.println(product);
        }
    }
    public Product findProduct(String id){
        for(Product product: products){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
    public void sortProducts(){
        Collections.sort(products);
    }
    public boolean updateProduct(String id,String Name,int newPrice){
        Product product = findProduct(id);
        if(product != null) {
            product.setName(Name);
            product.setPrice(newPrice);
            return true;
        }
        return false;
    }
}
