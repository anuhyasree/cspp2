import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static float areaOfTriangle(int base,int height) {
		
		return 0.5f*base*height;
		// System.out.println(area);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		System.out.println(areaOfTriangle(base, height));
	}
	/*
	Need to fill the areaOfTriangle function and print the output
	of fahrenheit.
	*/
}