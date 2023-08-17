
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter c = new Counter(5);
        c.increase(2);
        System.out.println(c.value());

        Counter a = new Counter(900);
        c.decrease(7);
        System.out.println(a.value());
    }//end main
}//end class
