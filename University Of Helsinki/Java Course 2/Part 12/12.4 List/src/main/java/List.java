
public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {

        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;

    }//end List

    public void add(Type value)  { //works with grow method

        if (this.firstFreeIndex == this.values.length) {

            grow();

        }//end if

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;

    }//end add
    
    public void remove(Type value) { //works with indexOfValue & move to the left
        //methods
        
        int indexOfValue = indexOfValue(value);
        
        if (indexOfValue < 0) {
            
            return;
            
        }//end if
        
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
        
    }//end remove
    
    public boolean contains(Type value) { //works with indexOfValue
        
        return indexOfValue(value) >= 0;
        
    }//end contains
    
    public Type value(int index) {//searching in an array. Uses indexOfValue 
        //method
        
        if (index < 0 || index >= this.firstFreeIndex) {
            
            throw new ArrayIndexOutOfBoundsException("Index " + index + 
                    " outside of [0, " + this.firstFreeIndex);
            
        }//end if
        
        return this.values[index];
        
    }//end value
    
    public int size() {//the size of the array
        
        return this.firstFreeIndex;
        
    }//end size

    public void grow() {

        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = ((Type[]) new Object[newSize]);

        for (int i = 0; i < this.values.length; i++) {

            newValues[i] = this.values[i];

        }//end for

        this.values = newValues;

    }//end grow

    public int indexOfValue(Type value) {

        for (int i = 0; i < this.firstFreeIndex; i++) {

            if (this.values[i].equals(value)) {

                return i;

            }//end if

        }//end for

        return -1;

    }//end indexOfValue
    
    public void moveToTheLeft(int fromIndex) {
        
        for (int i = fromIndex; i < this.firstFreeIndex; i++) {
            
            this.values[i] = this.values[i + 1];
            
        }//end for
        
    }//end moveToTheLeft

}//end class
