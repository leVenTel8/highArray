public class HighArray {

    private long[] a;        // private instance variable for array a
    private int nElems;      // private instance variable for number of data items

    /**
     * Construct a new array of longs along with
     * an integer variable to track the number of elements in use
     * @param max
     *		specifies the size of the array
     */
    public HighArray(int max) {  // constructor
        a = new long[max];        	// create the array
        nElems = 0;               	// no items yet
    }

    /**
     * Finds the given value in the array
     * @param searchKey
     * 		the value to be searched for
     * @return
     *		true if searchKey is found, false otherwise
     */
    public boolean find(long searchKey) {
        int j;
        for(j=0; j<nElems; j++) {           // for each element,
            if(a[j] == searchKey)           	// found item?
                return true;                       // exit loop before end
        }
        // gone to end of for loop
        return false;                   // yes, can't find it
    }  // end find()

    /**
     * Inserts a new value into array a
     * @param value
     *		the value to be inserted
     */
    public void insert(long value){   // put element into array
        a[nElems] = value;             // add element to the end of the array
        nElems++;                      // increment size
    }

    /**
     * Deletes the specified value
     * @param value
     * 		The value to be deleted
     * @return
     * 		true if search and deletion was successful, false otherwise
     */
    public boolean delete(long value) {
        int j;
        for(j=0; j<nElems; j++) {       // look for it
            if( value == a[j] ) {
                for(int k=j; k<nElems; k++) { // move higher ones down
                    a[k] = a[k+1];
                }
                nElems--;                   // decrement size
                return true;				//exit entire function
            } //end if
        } //end for j
        return false; // can't find it if we made it this far
    } //end delete()

    /**
     * Displays array contents
     */
    public void display()
    {
        for(int j=0; j<nElems; j++) {      // for each element,
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }

    public long getMax()
    {
        int j;
        long biggest = -1;
        if(nElems == 0) return biggest;
        else
        {
            for(j=0; j<nElems; j++)
            {
                if(a[j] > biggest) biggest = a[j];
            }

            return biggest;

        }

    }
    public long removeMax()
    {
        int j;
        long biggest1 = -1;
        if(nElems == 0) return biggest1;
        else
        {
            for(j=0; j<nElems; j++)
            {
                if(a[j] > biggest1) biggest1 = a[j];
            }
            delete(biggest1);
            return biggest1;

        }

    }

}  // end class HighArray