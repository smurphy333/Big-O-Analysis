# Big-O-Analysis
This Project Aims to create a program which can measure the efficiency of any algorithm. The base program must remain modular so minimal variation between objective are required. 
Approach: My approach going into this project was to 
•	Evaluate the methods, making a preliminary evaluation of the efficiency. Evaluation will consist of a O(N) analysis, and time complexity evaluation. This data will also be used to create my hypothesis.
•	Write a java program applying all knowledge gained from past courses, to evaluate each method. Program will be modular and make use of efficient structures. 
•	Run a full scale test plan program which will evaluate each method individually. Document all test cases creating a scientific record of the program development. Documentation will be converted into bullet points within this document. 
•	Compare and contrast my findings with my hypothesis, and determine if the hypothesis was confirmed, if not I will evaluate the data adjust my hypothesis and source code as required and repeat the test plan. 



Objectives: 

•	Research both Iterative and Recursive Algorithms
•	Form a valid Hypothesis
•	Use my modular platform to program this task
•	Evaluate real time complexity of the algorithms
•	Create a test plan
•	Create a valid conclusion as to the efficiency of the given methods

Big-O Analysis: 



 
(Time complexity of Merge Sort Graphed)


Big-O Analysis (continued): 

•	In all cases the iterative version of merge sort proved to be less efficient with an average time complexity of O(1.7), compared to the recursive method which had an average of O(1.5)
•	The data above shows 1000 runs testing the counting matrix, and time matrix. This showed that over high iterations of use the program showed overall expected efficiency, over time both algorithms appeared to become more efficient, this would suggest both were some type of LOG n but greater than O(n). 
•	The O(n) values were derived using a LOG (X, Y) function comparing the value of runs to the complexity counts. The highest numbers seen were averaged at O(n(log n).

Hypothesis: If a program has nested functionality then it will be less efficient of an algorithmic structure.


Test Plan: Step-by-step instructions, limitations, and expectation of results for user
(Note: This is an overview of the program, detailed test cases below)

•	Initiate:     To run this program the user must copy the source files to a desired directory. Next the user will open a command prompt window and navigate to the directory where the source files were saved. 


•	Compile: First compile source file MergeMergeSortClass.java by typing “javac MergeMergeSortClass.java” followed by MergeMergeSortAnalysis.java by typing “javac MergeMergeSortAnalysis.java”, then there will simply be a new command shell. Next type “javac MainSort.java” to compile the main, again there will simply be a new command shell. 

•	 Run: Next type “java MainSort”, the output from algorithm one for all methods will appear almost instantaneously (system dependent). Eventually when all function tests and data statistics have printed the program will be complete and it will automatically exit. Scroll to the top to find the first function test. Each section has a header with an order of operations.

•	Limitations: Due to requirements of this project there is only one output allowed from this program, and there is no way to change the program without altering the source code. If the text is not wrapped the user will not see all 1000 elements of the array.

•	Expectation: The user can expect that the program will print results as listed below under “Output” for each method showing the sorted and filled array. When finished in a new instance performance statistic will be taken, all output will be sent to null until all algorithms are complete, and at that time the statistics will print stream.

Critical Operations: The critical operations I used to measure the performance of class one and two were the method System.nanoTime() to measure time and an integer variable with a ++ modifier to count times of iteration.

  
•	System.nanoTime() uses an arbitrary point to measure elapsed time that the System.nanoTime() method is better for precise measurements of time elapsed. It is recommended by Oracle that whenever measuring the duration of an algorithm to use nano time.

•	Because of the chained nature of merge sort, I created one counter that was designed to function throughout by strategically placing them throughout the methods.

•	Sum++: I used sum counters at each conditional statement and embedded in each loop, and accounted for every requirement to monitor Big-O time complexity. There were a lot of loops involved it this project and identifying correct placement and ensuring all basis were covered was the challenge.

•	I missed a counter in my early assessments which completely sawed my results. I show in chart one just how much one counter can change the outcome of assessment.

