package day_2_Strings;

import java.util.Scanner;

public class ques_4_palindrome_twopointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str1 = sc.nextLine();
		
		int start =0;
		int end=str1.length()-1;
		for(int i=0;i<end/2;i++) {
			if(str1.charAt(start)!=str1.charAt(end)) {
				System.out.println("not palindrome");
				break;
			}
			start++;
			end--;
			System.out.println("yes palindrome");
		}

	}

}
