/*
*MergeSortAnalysis.java
*Project 1
*Steven Murphy
*3 April 2016
*/


//package mainsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class MergeSortAnalysis {
/*******************************************************
*Variable declaration for algorithm TEST
*This block assigns values that will be used in different 
*methods in this class there are a lot of variables/get/set 
* This gives a great deal of flexibility to the program
********************************************************/
    
    private int runTimes;
    //Merge Randome
    private int arraySize = 0;
    private long runningtimeAve = 0;
    private long runningtime = 0;
    private float runningONvalue = 0;
    private int counting =0;
    //Merge Ascending
    private int arraySize2 = 0;
    private long runningtimeAve2 = 0;
    private long runningtime2 = 0;
    private float runningONvalue2 = 0;
    private int counting2 =0;
    //Merge Descending
    private int arraySize3 = 0;
    private long runningtimeAve3 = 0;
    private long runningtime3 = 0;
    private float runningONvalue3 = 0;
    private int counting3 =0;

   //Selection Random
    private int arraySize4 = 0;
    private long runningtimeAve4 = 0;
    private long runningtime4 = 0;
    private float runningONvalue4 = 0;
    private int counting4 =0;
    //Selection Ascending
    private int arraySize5 = 0;
    private long runningtimeAve5 = 0;
    private long runningtime5 = 0;
    private float runningONvalue5 = 0;
    private int counting5 =0;
    //Selection Descending
    private int arraySize6 = 0;
    private long runningtimeAve6 = 0;
    private long runningtime6 = 0;
    private float runningONvalue6 = 0;
    private int counting6 =0;
    
    private final MergeSortClass three;
    private final MergeSortClass four;
    
    File randomFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array3Random.txt");
    File ascendingFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array1Ascending.txt");
    File descendingFile = new File("C:\\Users\\333\\Documents\\NetBeansProjects\\MainSort\\src\\mainsort\\array2Descending.txt");
/*******************************************************
*Constructor
*This block builds the basic variable parameters of the 
* program.
********************************************************/

    //constructor
    MergeSortAnalysis(int times){
        this.four = new MergeSortClass(1000);
        this.three = new MergeSortClass(1000);
        runTimes = times;

    }

    //default constructor
    MergeSortAnalysis(){
        this.four = new MergeSortClass(1000);
        this.three = new MergeSortClass(1000);
        runTimes = 100;

    }

    /*******************************************************
    *SETTERS
    *This block allows variables to be set from  
    *Main
    ********************************************************/
 
// Merge Random   
    public void setArraySize(int size){
        arraySize = size;
    }
    public void setRunningtimeAve(long rta){
        runningtimeAve = rta;
    }
    public void setRunningtime(long rt){
        runningtime = rt;
    }
    public void setRunningONvalue(float on){
        runningONvalue = on;
    }
    public void setCounting(int c){
        counting = c;
    }
//Merge Ascending
    public void setArraySize2(int size2){
        arraySize2 = size2;
    }
    public void setRunningtimeAve2(long rta2){
        runningtimeAve2 = rta2;
    }
    public void setRunningtime2(long rt2){
        runningtime2 = rt2;
    }
    public void setRunningONvalue2(float on2){
        runningONvalue2 = on2;
    }
    public void setCounting2(int c2){
        counting2 = c2;
    }
//Merge Descending
    public void setArraySize3(int size3){
        arraySize3 = size3;
    }
    public void setRunningtimeAve3(long rta3){
        runningtimeAve3 = rta3;
    }
    public void setRunningtime3(long rt3){
        runningtime3 = rt3;
    }
    public void setRunningONvalue3(float on3){
        runningONvalue3 = on3;
    }
    public void setCounting3(int c3){
        counting3 = c3;
    }
//Selection Random
    public void setArraySize4(int size4){
        arraySize4 = size4;
    }
    public void setRunningtimeAve4(long rta4){
        runningtimeAve4 = rta4;
    }
    public void setRunningtime4(long rt4){
        runningtime4 = rt4;
    }
    public void setRunningONvalue4(float on4){
        runningONvalue4 = on4;
    }
    public void setCounting4(int c4){
        counting4 = c4;
    }
//Selection Ascending
    public void setArraySize5(int size5){
        arraySize5 = size5;
    }
    public void setRunningtimeAve5(long rta5){
        runningtimeAve5 = rta5;
    }
    public void setRunningtime5(long rt5){
        runningtime5 = rt5;
    }
    public void setRunningONvalue5(float on5){
        runningONvalue5 = on5;
    }
    public void setCounting5(int c5){
        counting5 = c5;
    }
   //Selection Descending

    public void setArraySize6(int size6){
        arraySize6 = size6;
    }
    public void setRunningtimeAve6(long rta6){
        runningtimeAve6 = rta6;
    }
    public void setRunningtime6(long rt6){
        runningtime6 = rt6;
    }
    public void setRunningONvalue6(float on6){
        runningONvalue6 = on6;
    }
    public void setCounting6(int c6){
        counting6 = c6;
    }
  

    /*******************************************************
    *GETTERS
    *This block allows variables to be retrieved and sent to  
    *Main
    ********************************************************/
    //Merge Random

    public int getArraySize(){
        return arraySize;
    }
    public long getRunningtimeAve(){
       return runningtimeAve;
    }
    public long getRunningtime(){
        return runningtime;
    }
    public float getRunningONvalue(){
        return runningONvalue;
    }
    public int getCounting(){
        return counting ;
    }
    //Merge Ascending

    public int getArraySize2(){
        return arraySize2;
    }
    public long getRunningtimeAve2(){
       return runningtimeAve2;
    }
    public long getRunningtime2(){
        return runningtime2;
    }
    public float getRunningONvalue2(){
        return runningONvalue2;
    }
    public int getCounting2(){
        return counting2 ;
    }
    //Merge Descending

    public int getArraySize3(){
        return arraySize3;
    }
    public long getRunningtimeAve3(){
       return runningtimeAve3;
    }
    public long getRunningtime3(){
        return runningtime3;
    }
    public float getRunningONvalue3(){
        return runningONvalue3;
    }
    public int getCounting3(){
        return counting3 ;
    }
    
    //Selection Random

    public int getArraySize4(){
        return arraySize4;
    }
    public long getRunningtimeAve4(){
       return runningtimeAve4;
    }
    public long getRunningtime4(){
        return runningtime4;
    }
    public float getRunningONvalue4(){
        return runningONvalue4;
    }
    public int getCounting4(){
        return counting4 ;
    }
    //Selection Ascending

    public int getArraySize5(){
        return arraySize5;
    }
    public long getRunningtimeAve5(){
       return runningtimeAve5;
    }
    public long getRunningtime5(){
        return runningtime5;
    }
    public float getRunningONvalue5(){
        return runningONvalue5;
    }
    public int getCounting5(){
        return counting5;
    }
    //Selection Descending

    public int getArraySize6(){
        return arraySize6;
    }
    public long getRunningtimeAve6(){
       return runningtimeAve6;
    }
    public long getRunningtime6(){
        return runningtime6;
    }
    public float getRunningONvalue6(){
        return runningONvalue6;
    }
    public int getCounting6(){
        return counting6 ;
    }



    
/*******************************************************
*Sort ALGORITHM TEST Methods
*This block determines the runtime and O(N) of the 
* program.
     * @throws java.io.FileNotFoundException
********************************************************/
    //merge Random
    public void runAlgTestMergeRandom(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(randomFile).useDelimiter("\\s")) {

            while(input.hasNext()){
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSort(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting += three.getMergeSortCounter();
   
            runningtime += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve = runningtime/integers.length;
            runningONvalue = counting/integers.length;
    }
    //Merge Sort Acending
    public void runAlgTestMergeAscending(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(ascendingFile).useDelimiter("\\s")) {

            while(input.hasNext())
            {
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSort(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting2 += three.getMergeSortCounter();
   
            runningtime2 += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve2 = runningtime2/integers.length;
            runningONvalue2 = counting2/integers.length;
    }
    //Merge Sort Descend
    public void runAlgTestMergeDescending(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(descendingFile).useDelimiter("\\s")) {

            while(input.hasNext())
            {
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSort(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting3 += three.getMergeSortCounter();
   
            runningtime3 += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve3 = runningtime3/integers.length;
            runningONvalue3 = counting3/integers.length;
    }
 //iterative merge Random
    public void runAlgTestIterativeMergeRandom(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(randomFile).useDelimiter("\\s")) {

            while(input.hasNext())
            {
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSortIterative(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting4 += three.getIterativeSortCounter();
   
            runningtime4 += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve4 = runningtime4/integers.length;
            runningONvalue4 = counting4/integers.length;
    }
    //Iterative Merge Sort Acending
    public void runAlgTestIterativeMergeAscending(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(ascendingFile).useDelimiter("\\s")) {

            while(input.hasNext())
            {
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSortIterative(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting5 += three.getIterativeSortCounter();
   
            runningtime5 += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve5 = runningtime5/integers.length;
            runningONvalue5 = counting5/integers.length;
    }
    //Iterative Merge Sort Descend
    public void runAlgTestIterativeMergeDescending(int times) throws FileNotFoundException{
        Integer [] integers = new Integer [1000];
        int z =0;
        try (Scanner input = new Scanner(descendingFile).useDelimiter("\\s")) {

            while(input.hasNext())
            {
                integers[z] = input.nextInt();
                z++;
            }
        }
        for(int i = 0; i < times; i++){
            
            long beginTime = System.nanoTime();
            //from 0 to i push items to stack while taking count and time
            three.mergeSortIterative(integers);
            
            long endTime = System.nanoTime();
            //eval time
            long loopelapsedtime = endTime - beginTime; 
            //set values
            counting6 += three.getIterativeSortCounter();
   
            runningtime6 += loopelapsedtime;
            }//close for
            //calc averages
           
            runningtimeAve6 = runningtime6/integers.length;
            runningONvalue6 = counting6/integers.length;
    }

    public void printStats(int times){
        
        //Display message
        System.out.print("\n\n\n\n");
        for(int n = 0; n < 65; n++)System.out.print("=");
        System.out.print("*\n");
        System.out.print("*Algorithmic Assessment  \n");
        System.out.print("*Tests the O(N) of SortClass.java\n");
        System.out.print("*|MergeSort Random|MergeSortAscending|MergeSort Descending|"
                                     + "\n*|SelectionSort Random|SelectionSort Ascending|SelectionSort Descending||\n");
        System.out.print("*\n");
        for(int n = 0; n < 65; n++)System.out.print("=");
        System.out.print("\n\n\n\n");

        //print insert head
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Merge Sort Random");
        for(int n = 0; n < 50; n++)System.out.print("*");
        
        System.out.println("\nTotal Count " + counting);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");
                
        //print 2 pop
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Merge Sort Ascending");
        for(int n = 0; n < 50; n++)System.out.print("*");
       
        System.out.println("\nTotal Count " + counting2);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue2+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve2);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");

        //print 3 peek
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Merge Sort Descending");
        for(int n = 0; n < 50; n++)System.out.print("*");
        
        System.out.println("\nTotal Count " + counting3);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue3+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve3);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");

        //print 4 PUT
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Iterative Merge Sort Random");
        for(int n = 0; n < 50; n++)System.out.print("*");
        
        System.out.println("\nTotal Count " + counting4);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue4+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve4);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");

        //Print 5 GET
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Iterative Merge Sort Ascending");
        for(int n = 0; n < 50; n++)System.out.print("*");
        
        System.out.println("\nTotal Count " + counting5);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue5+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve5);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");

        //print 6 peek Queue
        for(int n = 0; n < 50; n++)System.out.print("-");
        System.out.println("\n               Iterative Merge Sort Descending");
        for(int n = 0; n < 50; n++)System.out.print("*");
       
        System.out.println("\nTotal Count " + counting6);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG Count  O( "+runningONvalue6+")");
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("\nAVG running time "+runningtimeAve6);
        for(int n = 0; n < 50; n++)System.out.print("*");
        System.out.println("");
        for(int n = 0; n < 50; n++)System.out.print("_");
        System.out.println("");

    }
}
