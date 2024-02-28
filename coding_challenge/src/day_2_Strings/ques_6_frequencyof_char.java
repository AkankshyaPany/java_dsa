package day_2_Strings;

import java.util.Scanner;

public class ques_6_frequencyof_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		for(char c='a';c<='z';c++) {
			int count =0;
			for(int i=0;i<str.length();i++) {
				if(c==str.charAt(i))
					count++;
			}if(count>0) {
			System.out.println( c +" there count is  " +count);
		}
}
	
		
	
		
	}
}
