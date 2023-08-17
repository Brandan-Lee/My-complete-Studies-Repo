
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }//end SimpleDate

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }//end toString

    public boolean earlier(SimpleDate other) {
        
        if (this.year < other.year) {
            return true;
        }//end if

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }//end if

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }//end if

        return false;
    }//end earlier

    public int differenceInYears(SimpleDate other) {
        
        if (earlier(other)) {
            return other.differenceInYears(this);
        }//end if

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }//end else if if

        return this.year - other.year - yearRemoved;
    }//end differenceInYears
    
    public boolean equals(Object object) {
        
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        }//end else if
        
        if (getClass() != object.getClass()) {
            return false;
        }//end if
        
        final SimpleDate other = (SimpleDate) object;
        
        if (this.day != other.day) {
            return false;
        } else if (this.month != other.month) {
            return false;
        } else if (this.year != other.year) {
            return false;
        }//end else ifs if
        
        return true;
        
    }//end equals
    
}//end class
