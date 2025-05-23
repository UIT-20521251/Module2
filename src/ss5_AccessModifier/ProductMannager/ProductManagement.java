package ss5_AccessModifier.ProductMannager;

public class ProductManager {
    private Product[] products = new Product[100];
    private int size;

    public ProductManager() {}
    public ProductManager(Product[] product) {
        this.products = product;
    }
    public void add(Product product) {
        for (int i = 0; i <products.length ; i++) {
            if (products[i]==null){
                products[i] =product;
                break;
            }
        }
    }
    public void delete(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equalsIgnoreCase(id)) {
                // Dời phần tử sau về trước
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[--size] = null; // Giảm size và xoá phần tử cuối
            }
        }
    }
    public void ListProducts() {
        if (size == 0) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(products[i].toString());
        }
    }
}
