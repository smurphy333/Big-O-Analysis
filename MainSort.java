/*
*MainSort.java
*Project 1
*Steven Murphy
*
*/


//package mainsort;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;


public class MainSort {
    public static void main(String[] args) {
         try{
            try{
                try{

       
/*******************************************************
 *LIST FUNCTIONALITY TEST
 *This block determines the methods of the 
 * program MergeSortClass.java.
 ********************************************************/
                    

                    //print LIST header for clarity of output
                    for(int n = 0; n < 65; n++)System.out.print("=");
                    System.out.print("\n");
                    System.out.print("*Tests the methods of MergeMergeSortClass.java\n");
                    System.out.print("*Order Of Operations:\n");
                    System.out.print("*|MergeSort Random|MergeSortAscending|MergeSort Descending|"
                                     + "\n*|MergSortIterative Random|SelectionSort Ascending|SelectionSort Descending||\n");
                    for(int n = 0; n < 65; n++)System.out.print("=");
                    System.out.print("\n\n\n");

      
                    try{
                        MergeSortClass one = new MergeSortClass (250);
                        MergeSortClass two = new MergeSortClass (250);

                        File randomFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array3Random.txt");
                        File ascendingFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array1Ascending.txt");
                        File descendingFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array2Descending.txt");

                        //random       
                        Integer [] integers = new Integer [1000];
                        int i =0;
                        try (Scanner input = new Scanner(randomFile).useDelimiter("\\s")) {
                
                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                       // MergeSortClass.mergeSort(integers);
                        MergeSortClass.mergeSortIterative(integers);
                        System.out.println("Recursive Merge Sort Random List");
                        System.out.println(Arrays.toString( integers));
                        MergeSortClass.mergeSort(integers);
       
                        //ascend file
                        integers = new Integer [1000];
                        i =0;
                        try (Scanner input = new Scanner(ascendingFile).useDelimiter("\\s")) {

                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                        MergeSortClass.mergeSort(integers);
                        System.out.println("\nRecursive Merge Sort Ascending List");
                        System.out.println(Arrays.toString( integers));
                        

       
                        //descend file
                        integers = new Integer [1000];
                        i =0;
                        try (Scanner input = new Scanner(descendingFile).useDelimiter("\\s")) {

                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                        MergeSortClass.mergeSort(integers);
                        System.out.println("\nRecursive Merge Sort Descending List");
                        System.out.println(Arrays.toString( integers)+"\n\n\n");
                        
                        
                        //random       
                        integers = new Integer [1000];
                        i =0;
                        try (Scanner input = new Scanner(randomFile).useDelimiter("\\s")) {
                
                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                       // MergeSortClass.mergeSort(integers);
                        MergeSortClass.mergeSortIterative(integers);
                        System.out.println("Iterative Merge Sort Random List");
                        System.out.println(Arrays.toString( integers));
                        MergeSortClass.mergeSort(integers);
       
                        //ascend file
                        integers = new Integer [1000];
                        i =0;
                        try (Scanner input = new Scanner(ascendingFile).useDelimiter("\\s")) {

                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                        MergeSortClass.mergeSortIterative(integers);
                        System.out.println("\nIterative Merge Sort Ascending List");
                        System.out.println(Arrays.toString( integers));
                        

       
                        //descend file
                        integers = new Integer [1000];
                        i =0;
                        try (Scanner input = new Scanner(descendingFile).useDelimiter("\\s")) {

                            while(input.hasNext()){
                                integers[i] = input.nextInt();
                                i++;
                            }
                        }
                        MergeSortClass.mergeSortIterative(integers);
                        System.out.println("\nIterative Merge Sort Descending List");
                        System.out.println(Arrays.toString( integers));
                         
                    }catch(NullPointerException e){
                    e.printStackTrace();
                    }

                
                    /*******************************************************
                    *Sort  TEST
                    *This block O(N)/run-times for all methods 
                    * program TreeBinAnalysis.java.
                    ********************************************************/
                    //set print stream to null in order to simplify output for testing
                    PrintStream original = System.out;
                    System.setOut(new PrintStream(new OutputStream() {
                    @Override
                    public void write(int b) {
                        //DO NOTHING send all output to null essentially 
                    }
                    }));

                    //run each method analyzer
                    MergeSortAnalysis runTest = new MergeSortAnalysis();

                    long testTimeOne = System.nanoTime();
                    
                    runTest.runAlgTestMergeRandom(1);
                    runTest.runAlgTestMergeAscending(1);
                    runTest.runAlgTestMergeDescending(1);
                    
                    runTest.runAlgTestIterativeMergeRandom(1);
                    runTest.runAlgTestIterativeMergeAscending(1);
                    runTest.runAlgTestIterativeMergeDescending(1);
                    
                    
                    long testTimeTwo = System.nanoTime();

                    long AlgTest = testTimeTwo - testTimeOne;

                    //reset original print stream to standard
                    System.setOut(original);

                    //print method for all data run
                    runTest.printStats(0);

                    //print overall algorithm test time
                    System.out.println("\nYour system took "+AlgTest+" nano-seconds to test all \nSort algorithms 10 times");

                //catch all exceptions  
                }catch(NullPointerException e){
                    System.out.println("Invalid input");
                }//null pointer
            }catch(IndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("out of bounds Exception Found");
            }//index out of bounds
        }catch(Exception e){
            System.out.println("Exception found");

        }//exception
    }
    
}
