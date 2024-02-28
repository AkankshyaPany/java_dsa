package day_2_Strings;

import java.util.Scanner;

public class ques_8_sum_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter string 1");
		String str1 = sc.nextLine();
		
		System.out.println("enter string 2");
		String str2 = sc.nextLine();
		
		int sum = Integer.parseInt(str1)+Integer.parseInt(str2);
		System.out.println("sum of string " +sum);
	}

}
