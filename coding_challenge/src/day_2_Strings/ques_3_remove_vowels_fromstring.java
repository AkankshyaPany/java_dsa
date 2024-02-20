package day_2_Strings;
import java.util.*;

public class ques_3_remove_vowels_fromstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence or word");
		String str = sc.nextLine();
		String str1=" ";
	    str1=str1+str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("new sentence is " +str1);
		// TODO Auto-generated method stub

	}

}
