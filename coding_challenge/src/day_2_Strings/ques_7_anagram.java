package day_2_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ques_7_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter string 1");
		String str1 = sc.nextLine();
		
		System.out.println("enter string 2 ");
		String str2 = sc.nextLine();

		char ch[]= str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch, ch2)) {
			System.err.println("yes anagaram...........");
		}else {
			System.err.println("nooo/.........");
		}
		
		
		

	}

}
