
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account matthew = new Account("Matthews account", 1000.00);
        Account my = new Account("My account", 0.00);
        matthew.withdrawal(100.00);
        my.deposit(100.00);
        System.out.println(matthew.toString());
        System.out.println(my.toString());
    }//end main
    
}//end class
