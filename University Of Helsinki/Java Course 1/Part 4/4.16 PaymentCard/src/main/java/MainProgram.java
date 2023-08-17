
/*
1. The class template
First, create the PaymentCard object's constructor, which is passed
the opening balance of the card, and which then stores that balance
in the object's internal variable. Then, write the toString method,
which will return the card's balance in the form "The card has a
balance of X euros".

2. Making transactions
The method eatAffordably should reduce the card's balance by € 2.60,
and the method eatHeartily should reduce the card's balance by € 4.60.

3. Non-negative balance
What happens if the card runs out of money? It doesn't make sense in
this case for the balance to turn negative. Change the methods
eatAffordably and eatHeartily so that they don't reduce the balance
should it turn negative.

4. Topping up the card
The purpose of the method is to increase the card's balance by the
amount of money given as a parameter. However, the card's balance
may not exceed 150 euros. As such, if the amount to be topped up
exceeds this limit, the balance should, in any case, become exactly
150 euros.
 */
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard.toString());
        System.out.println("Matt: " + mattsCard.toString());
        
    }//end main
}//end class
