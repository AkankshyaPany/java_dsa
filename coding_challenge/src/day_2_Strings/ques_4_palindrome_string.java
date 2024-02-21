package day_2_Strings;

import java.util.Scanner;

public class ques_4_palindrome_string {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your string");
		String str1 = sc.nextLine();
		String str2 ="";
		
		for (int i= str1.length()-1;i>=0;i--) {
			str2= str2+str1.charAt(i);
		}
		System.out.println("reversed string is "+str2);
		
		if(str1.equals(str2)) {
			System.out.println("yes palindrome");
		}else {
			System.out.println("nooo soryy not palindrome");
		}
		

	}

}
