
public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }//end while

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }//end main
}//end class
