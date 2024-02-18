package day_1_basic;

import java.util.Scanner;

public class ques_5_quadrant_coordinates {

	public static void main(String[] args) {
		// input : 5,4 : first quadrant
		// input : -5,4 : second quadrant
		// input : -5,-4 : third quadrant
		// input : 5,-4 : fourth quadrant
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x and y : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>0 && y>0) {
			System.out.println("are in first quadrant");
		}else if(x<0 && y>0) {
			System.out.println("are in second quadrant");
	    }else if(x<0 && y<0) {
			System.out.println("are in third quadrant");
	    }else if (x>0 && y<0) {
		System.out.println("are in fourth quadrant");
	    }
	}

}
