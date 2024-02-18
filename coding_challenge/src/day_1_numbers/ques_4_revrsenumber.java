package day_1_numbers;

import java.util.Scanner;

public class ques_4_revrsenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
        System.out.println("enter a number");
        int num = sc.nextInt();
        int rev = 0;
        while(num!=0) {
        	int last_digit = num % 10;
        	rev = rev*10 + last_digit;
        	num=num/10;
        }
        System.out.println("after reversing : "+ rev);
	}
}
