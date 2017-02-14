class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        HighArray arr;                // declare a variable of type HighArray
        arr = new HighArray(maxSize); // create the new HighArray object and assign it to arr

        arr.insert(77);               // insert 10 items
        arr.insert(35);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();          	// display items

        int searchKey = 35;         // value to search for
        if( arr.find(searchKey) )	//search for item
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);               // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();                // display items again

        System.out.println(""+arr.getMax());
        System.out.println(""+arr.removeMax());
        arr.display();
    }  // end main()
}  // end class HighArrayTest