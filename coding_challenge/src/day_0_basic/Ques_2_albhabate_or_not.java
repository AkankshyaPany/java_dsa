package day_0_basic;

import java.util.Scanner;

public class Ques_2_albhabate_or_not {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter any character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&& ch<='Z')) {
			System.out.println(ch + " is a aphabate");
		}else {
			System.err.println("not a alphabate");
		}
}
}


