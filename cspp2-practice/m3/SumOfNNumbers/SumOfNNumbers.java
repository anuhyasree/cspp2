import java.util.*;

class SumOfNNumbers
{
    public static void main(String[] args) {
    	System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int sum = 0;
        for (int i=0;i<=r;i++ ) {
        	sum =  sum+i;        	
        }
        System.out.println("the sum is: "+sum);
    }
}
