package day_1_numbers;

import java.util.Scanner;
//counting the number of digits in number
public class ques_1_count_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num==0) {
			System.out.println(1);
		}
		while(num!=0) {
			num = num/10;
			count++;
			
		}
		System.out.println(count);

	}
}
