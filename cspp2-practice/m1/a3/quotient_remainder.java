import java.util.*;
class quotient_remainder
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
        b = in.nextInt();
		int quotient = a/b;
		int remiander = a%b;
		System.out.println(quotient+","+remiander);

	}
}