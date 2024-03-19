package day_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_1_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter array");
		int array[]= {78,39,29,2,1,56};
		System.out.println("unsorted array  : " +Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("sorted array  : " +Arrays.toString(array));
	}
}
