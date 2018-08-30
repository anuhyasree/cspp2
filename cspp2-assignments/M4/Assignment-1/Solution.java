
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		int i,max;
		for (i = 0; i < n; i++) {
			int b = sc.nextInt();
			a[i] = b; 
		}
		max = a[0];
		for (i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];

			}
			
			
		}
		System.out.println(max);

	}
}
