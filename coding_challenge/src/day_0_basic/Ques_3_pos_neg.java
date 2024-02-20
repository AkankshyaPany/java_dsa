package day_0_basic;

import java.util.Scanner;

public class Ques_3_pos_neg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
	    double num = sc.nextDouble();
		if(num<0.0) {
			System.err.println(num + " is negetive no");
		}else if (num>0.0){
			System.err.println(num + " is a positive no");
		}else {
			System.out.println(" is zero");
		}
	}

}
