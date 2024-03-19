package day_1_patterns;
/*
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.
For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.

Example:
Input:  ‘N’ = 3
Output: 
* 
* *
* * *

 */
public class ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                 System.out.print("* ");
            }
             System.out.println();
        }


	}

}
