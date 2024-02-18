package day_1_numbers;

import java.util.Scanner;

//145 = 1!+4!+5! =145
public class ques_5_Strong_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
        System.out.println("enter a number");
        int originalNum=sc.nextInt();
        long temp=0;
        int num=originalNum;
 
        while(num!=0) {
        	int digit = num%10;
        	long fact=1;
        	for(int i=1 ;i<=digit;i++) {
        		fact=fact * i;
        		
        	}
        	temp = temp + fact;
        	num=num/10;
        	
        }
        System.out.println("result of cal " +temp);
        if (temp == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }
       
	}

}
