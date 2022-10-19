package abstractDemo;


import abstractDemo.CustomerManager;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDBManager= new OracleDBManager();
        customerManager.addCustomer();
    }
}
