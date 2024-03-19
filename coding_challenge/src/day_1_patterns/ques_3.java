package day_1_patterns;
/*
 Sam is making a Triangular painting for a maths project.
An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.

Example:
Input: ‘N’ = 3

Output: 
1
1 2 
1 2 3
 */
public class ques_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                 System.out.print(j+" ");
            }
             System.out.println();
        }


	}

}
