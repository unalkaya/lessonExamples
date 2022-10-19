package staticDemo;

public class ProductManager {

    public void addProduct(Product product) {

        if (ProductValidator.isValid(product))
            System.out.println("Product Addet Successfully " + product.getName());
        else
            System.out.println("Given product is not valid to add system " + product.getName());

    }

}
