/**
  OrderedList_inArraySlots, holding Integers

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  ArrayList<Integer>
 */

public class OrderedList_inArraySlots
    implements OrderedList {

    private java.util.ArrayList<Integer> list_iAS;


    /**
      @return the index of the first occurrence of 
              \findMe in this list, or -1 if
              \findMe is absent from this list.
     */
    public int BinarySearchR(ArrayList<Integer> arr[], int l, int r, int x) { 
        if (r >= l) { 
        int mid = l + (r - l) / 2; 
        if (arr[mid] == x){return mid;}
        if (arr[mid] > x){return BinarySearchR(arr, l, mid - 1, x);}
        return BinarySearchR(arr, mid + 1, r, x); 
      }
      return -1; 
    }

    public int binarySearchI(ArrayList<Integer> arr[], int x) { 
      int l = 0, r = arr.length - 1; 
      while (l <= r) { 
        int m = l + (r - l) / 2; 
        // Check if x is present at mid 
        if (arr[m] == x){return m;}
        // If x greater, ignore left half 
        if (arr[m] < x){l = m + 1;}
        // If x is smaller, ignore right half 
        else{r = m - 1;}
      } 
      return -1; 
    } 

    public static int indexOf(int findMe) {
      binarySearchI(this, findMe);
    }
    

    // ------ code from previous assignments below here ----

    public OrderedList_inArraySlots() {
        list_iAS = new java.util.ArrayList<Integer>();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( Integer value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
              ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public Integer get( int index ) {
        return list_iAS.get( index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public Integer remove( int index) {
        return list_iAS.remove( index);
    }
}
