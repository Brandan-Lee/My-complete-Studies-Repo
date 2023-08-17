
public class HealthStation {

    private int totalWeighings;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        totalWeighings++;
        return person.getWeight();
    }//end weigh

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }//end feed
    
    public int weighings(){
       return totalWeighings; 
    }//end weighings
}//end class   
