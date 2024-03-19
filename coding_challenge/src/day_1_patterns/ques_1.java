package day_1_patterns;

import java.util.Scanner;

/*
Problem statement
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

Example:
Input: ‘N’ = 3

Output: 
* * *
* * *
* * *



 */
public class ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method \\
		for(int i=0;i<3;i++){
            for(int j =0 ;j<3;j++){
                System.out.print("* ");

            }
            System.out.println();							}
	}	
}

