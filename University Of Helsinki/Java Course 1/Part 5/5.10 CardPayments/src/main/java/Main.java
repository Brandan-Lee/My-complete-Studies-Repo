
/*
1. "Dumb" payment card
In a previous part we created a class called PaymentCard. The card had
methods for eating affordably and heartily, and also for adding money
to the card.

However, there was a problem with the PaymentCard class that is
implemented in this fashion. The card knew the prices of the different
lunches, and therefore was able to decrease the balance by the proper
amount. What about if the prices are raised? Or new items are added to
the list of offered products? A change in the pricing would mean that
all the existing cards would have to be replaced with new cards that are
aware of the new prices.

An improved solution is to make the cards "dumb"; unaware of the prices
and products that are sold, and only keeping track of their balance. All
the intelligence is better placed in separate objects, payment terminals.

Let's first implement the "dumb" version of the PaymentCard. The card only
has methods for asking for the balance, adding money, and taking money.
Complete the method public boolean takeMoney(double amount) 

2. Payment terminal and cash
When visiting a student cafeteria, the customer pays either with cash or
with a payment card. The cashier uses a payment terminal to charge the
card or to process the cash payment. First, let's create a terminal that's
suitable for cash payments.

3. Card payments
Let's extend our payment terminal to also support card payments. We are
going to create new methods for the terminal. It receives a payment card
as a parameter, and decreases its balance by the price of the meal that
was purchased.
NB: card payments don't increase the amount of cash in the register

4. Let's create a method for the terminal that can be used to add money
to a payment card. Recall that the payment that is received when adding
money to the card is stored in the register.
*/
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

//        PaymentCard petesCard = new PaymentCard(10);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccessful = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccessful = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//
//        PaymentCard annesCard = new PaymentCard(7);
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println(unicafeExactum);
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }//end main

    /*
    The output should be like below
    money 10.0
    successfully withdrew: true
    money 2.0
    successfully withdrew: false
    money 2.0
    
    output
    remaining change: 7.5
    remaining change: 2.5
    remaining change: 0.0
    money: 1009.3, number of sold afforable meals: 2, number of sold hearty
    meals: 1
    
    output
    remaining change: 7.5
    there was enough money: true
    there was enough money: false
    there was enough money: true
    money: 1002.5, number of sold afforable meals: 2, number of sold hearty
    meals: 1
    */
    
    /*
    output
    money: 1000.0, number of sold afforable meals: 0, number of sold hearty
    meals: 0
    amount of money on the card is 2.0 euros
    there was enough money: false
    there was enough money: true
    amount of money on the card is 97.7 euros
    money: 1100.0, number of sold afforable meals: 0, number of sold hearty
    meals: 1
    */
    
}//end class
