package studio1;

import java.util.Scanner;

public class LeapYearclass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year?");
		double year = in.nextDouble();
		double byFour = year%4;
		double byHundred = year%100;
		double byFourHundred = year%400;
		boolean leapYear = (byFour == 0) && ((byHundred != 0)|| (byFourHundred == 0));
		System.out.print(year+" is a leap year: " +leapYear);
	}

}
