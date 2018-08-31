import java.util.*;

public class FirstLast6{
	public static boolean six(int[] a, int n){
		if (a[0]==6 || a[n-1]==6) {
			return true;

		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int sr = n.nextInt();
		int[] arr = new int[sr];
		for (int i=0;i<sr;i++) {
			int b = n.nextInt();
			arr[i]=b;
			// System.out.println(arr[i]);			
		}
		System.out.println(six(arr,sr));
	}
}