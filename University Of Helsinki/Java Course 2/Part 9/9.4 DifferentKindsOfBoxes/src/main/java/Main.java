
public class Main {

    public static void main(String[] args) {

//2
//        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
//        coffeeBox.add(new Item("Saludo", 5));
//        coffeeBox.add(new Item("Pirkka", 5));
//        coffeeBox.add(new Item("Kopi Luwak", 5));
//
//        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
//        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
//        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
//3 part 1
//        OneItemBox box = new OneItemBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));
//3 part 2
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

    }//end main

    /*
    Example of output
    2
    true
    true
    false
    
    3 part 1
    true
    false
    
    3 part 2
    
     */
}//end class
