
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account brandansAccount = new Account("", 100.00);
        brandansAccount.deposit(20.00);
        System.out.println(brandansAccount.toString());
    }
}
