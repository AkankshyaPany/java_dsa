package day_2_Strings;

import java.util.Scanner;

public class ques_1_reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str1 = sc.nextLine();
		String str2 = " ";
		
		for(int i = str1.length()-1;i>=0;i-- ) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("revrsed string is : " + str2);
	}

}
