package day_1_basic;

import java.util.Scanner;

/*
Program To Find Number Of Days In a given Month of given  Year

Enter a year  : 2023
Enter a month : 2
Output : Number of days in February, 2023 : 28

Logic:
check if given month is feb
if true:  check year is leap or not
         if leap : 29 days
         not leap year : 28 days 
if false: check month
print no of days assigned to specific month

leap year : year%400(jo 400 se divisible ho) or year !=100 and year%4(jo 4 se divisible ho but 100 se na ho)

31 days :month 1,3,5,7,8,10,12


*/
public class ques_6_days_in_month_of_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the year");
		int year = sc.nextInt();	
		System.out.println("enter the month");
		int month = sc.nextInt();
		
		if((month == 2)&&(year%400==0)||(year%100!=0)&&(year%4==0)) {
			System.out.println("number of days 29");
		}else if(month == 2) {
			System.out.println("number of days 28");
		}else if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12) {
			System.out.println("number of days is 31");
			
		}else {
			System.out.println("number of days 30");
		}
		
	}

}