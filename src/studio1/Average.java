package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged:");
		double n1 = in.nextInt();
		System.out.println("The next integer?:");
		double n2 = in.nextInt();
		double avg = (n1+n2)/2;
		System.out.println("The average is: "+avg);

	}

}