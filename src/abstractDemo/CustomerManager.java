package abstractDemo;

public class CustomerManager {

    BaseDBManager baseDBManager;

 /*   public CustomerManager(BaseDBManager baseDBManager) {
        this.baseDBManager = baseDBManager;
    }

  */

    public void addCustomer(){
        baseDBManager.addData();
    }

}
