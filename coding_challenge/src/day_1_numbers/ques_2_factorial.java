package day_1_numbers;

import java.util.Scanner;

public class ques_2_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.println("i: " + i + ", fact: " + fact);
        }
        
        System.out.println("Factorial of the number " + num + " is " + fact);
    }
}
