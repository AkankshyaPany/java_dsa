package day_2_Strings;

import java.util.Scanner;

public class ques_9_count_wordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter string 1");
		String str1 = sc.nextLine();
		String str2=str1.trim();
		int count=0;
		for(int i=0;i<=str2.length()-1;i++) {
			
			//ek space ho and space ek age wala char blank na ho
			if(str2.charAt(i)==' ' && str2.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("words : " +(count+1));


	}

}
