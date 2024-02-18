package day_1_basic;
import java.util.*;
public class quea_1_Vowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("yes..vowel");
		}else {
			System.out.println("no .. nt a vowel");
		}
	}

}
