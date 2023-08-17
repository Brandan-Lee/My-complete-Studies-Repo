
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hm;

    public VehicleRegistry() {
        this.hm = new HashMap<>();
    }//end VehicleRegistry

    public boolean add(LicensePlate licensePlate, String owner) {

        for (LicensePlate e : hm.keySet()) {

            if (e.equals(licensePlate)) {
                return false;
            }//end if

        }//end for

        hm.put(licensePlate, owner);
        return true;
    }//end add

    public String get(LicensePlate licensePlate) {

        return hm.getOrDefault(licensePlate, null);

    }//end get

    public boolean remove(LicensePlate licensePlate) {

        if (!hm.containsKey(licensePlate)) {
            return false;
        } else {
            hm.remove(licensePlate);
            return true;
        }//end else if

    }//end remove

    public void printLicensePlates() {

        for (LicensePlate e : hm.keySet()) {
            System.out.println(e);
        }//end for

    }//end printLicensePlates

    public void printOwners() {

        ArrayList<String> owners = new ArrayList<>();

        for (String e : hm.values()) {

            if (!owners.contains(e)) {
                owners.add(e);
            }//end if

        }//end for
        
        for (String e : owners) {
            System.out.println(e);
        }//end for
        
    }//end printOwners
}//end class
