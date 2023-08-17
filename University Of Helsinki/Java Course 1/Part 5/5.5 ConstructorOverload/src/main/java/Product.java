
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }//end 1st product

    public Product (String name){
        this(name, "shelf", 1);
    }//end 2nd product
    
    public Product(String name, String location){
        this(name, location, 1);
    }//end 3rd product
    
    public Product (String name, int weight){
        this(name, "shelf", weight);
    }//end 4th product
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
