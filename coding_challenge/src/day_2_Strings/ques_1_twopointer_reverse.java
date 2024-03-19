package day_2_Strings;

import java.util.Scanner;

public class ques_1_twopointer_reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str1 = sc.nextLine();
		char str2[]= str1.toCharArray();
		int start =0;
		int end= str2.length-1;
		while(start<=end) {
			char temp = str2[start];
			str2[start]=str2[end];
			str2[end]= temp;
			start++;
			end--;
		}
		System.out.println("reversed  string : " + String.valueOf(str2));
		
	}	

}
