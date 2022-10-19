package firstPractice;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Unal");
        Employee employee = new Employee(2,"Fulya");

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();


        employeeManager.save();
        customerManager.richCustomer();
        employeeManager.bestEmployee(employee);



    }
}
