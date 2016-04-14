/*
*MergeSortClass.java
*Project 1
*Steven Murphy
*3 April 2016
*/


//package mainsort;
import java.lang.Math;
import java.lang.Comparable;
import java.lang.reflect.Array;
import static javafx.scene.input.KeyCode.T;
public class MergeSortClass {
/*******************************************************
*Declaration
*This block declares the basic variable parameters of the 
* program.
********************************************************/


    //variables
    private Comparable [] numberArray;
    private static Comparable[] copyNumberRight;
    private static Comparable[] copyNumberLeft;
    private static Comparable[] copyNumber;
    private static int arraySize;
    private static int mergeSortCounter;
    private static int iterativeSortCounter;
    private final int arrayPosition = 1;
    
 /*******************************************************
*Constructor
*This block builds the basic variable parameters of the 
* program.
********************************************************/

    //constructor
    MergeSortClass(int size){
        arraySize = size;
        numberArray = new Comparable[size];
    }
    //default constructor
    MergeSortClass(){
        numberArray[arrayPosition] = 1000;
    }

/*******************************************************
*SETTERS
*This block allows variables to be set from  
*Main
********************************************************/

    public void setIterativeSortCounter(int sc){
        iterativeSortCounter = sc;
    }
    public void setMergeSortCounter(int mc){
        mergeSortCounter = mc;
    }

/*******************************************************
*GETTERS
*This block allows variables to be retrieved and sent to  
*Main
********************************************************/

    public int getIterativeSortCounter(){
        return iterativeSortCounter;
    }
    public int getMergeSortCounter(){
       return mergeSortCounter;
    }

/*******************************************************
*Methods
*Variety of different methods to perform specific tasks
*
********************************************************/
    //public callable method to easily enter input for merge sort
    public static void mergeSort(Comparable[] numberArray){
        mergeSortCounter =0;        
        //create comparable copy, and run merge sort with std variables
        copyNumber = new Comparable[numberArray.length];
        privateMergeSort(numberArray, copyNumber, 0, numberArray.length-1);
        
    }//close public merge sort
    
    //Recursive merge sort algorithm
    private static void privateMergeSort(Comparable[] numberArray,Comparable[] copyNumber, int startNumber,int endNumber )throws StackOverflowError{
        //if larger number is on the left of smaler number
        mergeSortCounter++;
        if (startNumber < endNumber){
            mergeSortCounter++;
            //define middle of array as full array / 2
            int mid = (startNumber + endNumber)/2;
            //recursivly run merge sort on left side, then right side, then merge until all lefts are < the number to their right
            privateMergeSort(numberArray, copyNumber,    startNumber, mid);
            
            privateMergeSort(numberArray, copyNumber,  mid +1, endNumber);
            
            MergeSections(numberArray, copyNumber,startNumber,  mid+1, endNumber); 
            
     
   
        }//close if
        
     
    }//close private merge sort
        
    //re merge post sort
    private static void MergeSections(Comparable[] numberArray, Comparable[] copyNumber, int startNumber,int endNumber,int lastNumber){
       mergeSortCounter++;
       //make new variables for ends of array
       int w = startNumber;
       int firstNumber = endNumber -1;
       int place = lastNumber - startNumber +1;
       // manipulate positions until lists are merged
       while ( startNumber<= firstNumber && endNumber <= lastNumber){
            mergeSortCounter++;
            if (numberArray[startNumber].compareTo(numberArray[endNumber]) <=0){
               mergeSortCounter++;
               copyNumber[w++] = numberArray[startNumber++];
            }else{
                mergeSortCounter++;
                copyNumber[w++]= numberArray[endNumber++];
            }//close else
       }//close while startNumber<= firstNumber && endNumber <= lastNumber    
        while(endNumber <= lastNumber){
            mergeSortCounter++;
            copyNumber[w++] = numberArray[endNumber++];
        }//close while endNumber <= lastNumber
        while(startNumber <= firstNumber){
            mergeSortCounter++;
            copyNumber[w++] = numberArray[startNumber++];
        }//close while startNumber <= firstNumber
        for(int i =0; i<place; i ++, lastNumber--){
            mergeSortCounter++;
            numberArray[lastNumber]=copyNumber[lastNumber];
        }//close for         
   }//close merge sections
    
/**************************ITERATIVE*****************************************/    

//public callable method to easily enter input for merge sort
    public static void mergeSortIterative(Integer[] a) {
      int k=0;
      Integer[] from = a, to = new Integer[a.length];
      for (int blockSize=1; blockSize<a.length; blockSize*=2) {
          iterativeSortCounter++;
         for (int start=0; start<a.length; start+=2*blockSize)
            merge(from, to, start, start+blockSize, start+2*blockSize);iterativeSortCounter++;
        
          Integer[] temp = from;
          from = to;
          to = temp;
      }
        if (a != from)
            iterativeSortCounter++;
            // copy back
        for (k = 0; k < a.length; k++)
            a[k] = from[k];
        iterativeSortCounter=iterativeSortCounter+k;
            
   }

    private static void merge(Integer[] from, Integer[] to, int lo, int mid, int hi) {
       // DK: cannot just return if mid >= a.length, but must still copy remaining elements!
       // DK: add two tests to first verify "mid" and "hi" are in range
       if (mid > from.length) mid = from.length;
       iterativeSortCounter++;
       if (hi > from.length) hi = from.length;
       iterativeSortCounter++;
       int i = lo, j = mid;
       for (int k = lo; k < hi; k++) {
           iterativeSortCounter++;
          if      (i == mid){          to[k] = from[j++];
          iterativeSortCounter++;
       }else if (j == hi) {          to[k] = from[i++];
            iterativeSortCounter++;
       }else if(from[j] < from[i]){  to[k] = from[j++];
            iterativeSortCounter++;
        }else{                        
            to[k] = from[i++];
            iterativeSortCounter++;
       }
    }

    }
    

}//close class

