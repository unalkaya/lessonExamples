package staticDemo;

import java.sql.SQLOutput;

public class ProductValidator {

    static{
        System.out.println("Static Constructor Executed");
    }

    public ProductValidator() {
        System.out.println("Constructor Executed");
    }

    public static boolean isValid(Product product){
        return product.getPrice() > 0 && !product.getName().isEmpty();
    }
}
