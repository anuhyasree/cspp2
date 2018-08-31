
// Given an String, Write a java method that returns the decimal
// value for the given binary string.
import java.util.Scanner;
/**.
 *
 *
 * Class for solution.
 */
final class Solution {
   /*
	Do not modify the main function
	*/
	/**.
	 * { item_description }
	 */
	private Solution(){

	}
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = reverseString(s);
		System.out.println(reverse);
		
	}
	public static String reverseString(String s){
		String reverse = " ";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		 } 
		 return reverse;
	}
}
