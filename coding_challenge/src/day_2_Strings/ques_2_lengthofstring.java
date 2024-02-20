package day_2_Strings;

import java.util.Scanner;

public class ques_2_lengthofstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your word or sentence");
		String str = sc.nextLine();
		
	    //using length function
		System.out.println("lenght of word or sentence "+  (str.length()));
		
		//without function
		int count =0;
		for(int i = 0;i<=str.length()-1;i++) {
			count++;
		}
		System.out.println("lenght of word or sentence is " + (count));
		
        //another way
		int count1=0;
		char ch[] = str.toCharArray();
		for(char c : ch ) {
			count1++;
		}
		System.out.println("lenght of word or sentence is " +(count1));
	}

}
