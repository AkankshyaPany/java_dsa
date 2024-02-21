package day_2_Strings;

import java.util.Scanner;

public class ques_5_capitalise_first_last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your string");
		String str = sc.nextLine();
		String str2 = "";
		//if it is a sentence rather than word then need to convert to array
		
		
		String str3[]=str.split("\\s");    //in regular expression
		for (String s:str3) {
			int len =s.length();
			String first=s.substring(0,1);
			String middle = s.substring(1, len-1);
			String last= Character.toString(s.charAt(len-1));
			
			str2= str2+first.toUpperCase()+middle.toLowerCase()+last.toUpperCase();
		}
		System.out.println(str2);

	}

}
