/*
find the Roots of a Quadratic Equation
D = b2-4*A*C
If D > 0:
        => The roots are real and unequal.
        => The roots are {-b + sq(b2 – 4ac)}/2a and {-b – sq(b2 – 4ac)}/2a.

If D = 0:
        => The roots are real and equal.
        => The roots are (-b/2a).

If D < 0:
        => The roots are imaginary and unequal.
        => The roots are {-b ± sq (-1*-D)} / 2a = {-b ± i sq(-D)} / 2a = {-b ± i sq-(b2 – 4ac)}/2a where i = ?-1.
*/
package day_0_basic;
import java.util.Scanner;

public class ques_7_roots_quadratic_equation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" **********QUADRATIC ROOTS************");
		System.out.println("enter value of a");
		double a = sc.nextInt();
		System.out.println("enter value of b");
		double b = sc.nextInt();
		System.out.println("enter value of c");
		double c = sc.nextInt();
		
		double d = (Math.pow(b,2)- 4*a*c);
		
		if(a==0) {
			System.out.println("Invalide output : as the denominator cant be zero");
		}else if (d<0) {
			System.out.println("ROOTS ARE "+ -b/(2*a)+"i"+ Math.sqrt(-d)/(2*a) + " and " + -b/(2*a)+ "-i"+ Math.sqrt(-d)/(2*a) );
			System.out.println("The roots are imaginary and unequal.");
		}else if(d>0) {
			System.out.println("ROOTS ARE " + (-b + Math.sqrt(d))/(2*a)  +" and  "+ (-b - Math.sqrt(d))/(2*a));
			System.out.println("The roots are real and unequal.");
			
		}else if(d==0) {
			System.out.println("ROOTS ARE "+ -b/(2*a));
			System.out.println("The roots are real and equal.");
		}
	}
}
