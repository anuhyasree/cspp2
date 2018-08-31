import java.util.*;

public class Average{
	public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
		int sr = n.nextInt();
		int[] arr = new int[sr];
		double sum = 0;
		for (int i=0;i<sr;i++) {
			int b = n.nextInt();
			arr[i]=b;
			sum = sum+b;
			// System.out.println(arr[i]);			
		}
		System.out.println("the average of n numbers is: "+sum/sr);
	}
}