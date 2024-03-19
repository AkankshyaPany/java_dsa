package day_1_patterns;

/*
 when loop starting from 1 
    *             (4,1,4) 5-1, 2*i-1=2*1-1, 5-1
   ***            (3,3,3)  
  *****           (2,5,2)
 ******* 
*********
 
 if loop start from 0   5-0+1(5-i+1), 2*0+1 (2*i+1)
 */
public class ques_5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
            for(int j = 1; j <= 5- i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Move to the next line after each row
            System.out.println();   
        }
		
	}
}

