/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Spider
 */
public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }//end Debt
    
    public void printBalance(){
        System.out.println(this.balance);
    }//end printBalance
    
    public void waitOneYear(){
        balance = balance * interestRate;
    }
}//end class
