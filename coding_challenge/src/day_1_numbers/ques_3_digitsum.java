package day_1_numbers;
import java.util.*;
public class ques_3_digitsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum=0;
        while (num!=0) {
        	int last = num%10;
        	sum=sum+last;
        	num= num/10;
        }
        	       	
        System.out.println("sum of no : " + sum);
	}

}
