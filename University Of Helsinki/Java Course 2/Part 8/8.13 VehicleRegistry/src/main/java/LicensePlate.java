
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }//end licensePlate

    @Override
    public String toString() {
        return country + " " + liNumber;
    }//end toString
    
    @Override
    public boolean equals(Object object) {
        
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        }//end else if
        
        if (getClass() != object.getClass()) {
            return false;
        }//end if
        
        final LicensePlate other = (LicensePlate) object;
        
        if (this.liNumber != other.liNumber) {
            return false;
        } else if (this.country != other.country) {
            return false;
        }//end if else
        
        return true;
        
    }//end equals
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.liNumber);
        hash = 19 * hash + Objects.hashCode(this.country);
        return hash;
    }//end hashCode
    
}//end class
