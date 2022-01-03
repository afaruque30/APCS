// MumbleCore - Abdullah Faruque, Neil Lin, Russell Goychayev
// HW51: Dat Bubbly Tho
// HW48- Halving the Halves
// 2022-1-3
// time spent: 0.5 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO: starting from the right, we swap through the array up until index passing, the number of times we passed through the entire array. we do this continously until
 * sorted is true. sorted is false when a swap occurs, so basically we keep running this until no swap occurs. 
 * 
 * DISCO - had to use array list functions to do the swaps
 *
 * QCC - none right now
 * q0: If a pass requires no swaps, what do you know?
 * a0: its sorted
 * q1: After pass p, what do you know?
 * a1: the arraylsit is sorted for the first p things. 
 * q2: How many passes are necessary to completely sort?
 * a2: should be the length minus 1 in the worse case scenario.
 * 
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int passes = 0; passes < data.size()-2; passes++) {
      boolean sorted = true;
      for(int index = data.size()-1; index > passes; index--) {
        if(data.get(index).compareTo(data.get(index-1)) < 0) {
          Comparable temp = data.get(index);
          data.set(index, data.get(index-1));
          data.set(index-1, temp);
          sorted = false; // basically determines whether or not a swap happens
        }
      }
      if(sorted) {
        break;
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> output = new ArrayList(input);
    bubbleSortV(output);
    return output;
  }


  public static void main( String [] args )
  {

    
      /*
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      */
   
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
     

  }//end main

}//end class BubbleSort