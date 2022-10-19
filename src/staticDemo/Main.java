package staticDemo;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Iphone",-27000.5);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);


    }
}
