package day_0_basic;

import java.util.Scanner;

public class ques_4_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num %2==0) {
			System.out.println(num + " is even num");
		}else 
			System.err.println(num + "is odd num" );
		}
	}
