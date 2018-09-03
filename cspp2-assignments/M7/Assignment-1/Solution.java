import java.util.*;
class InputValidator
{
	String input;
	public InputValidator(String input) {
		this.input = input;
	}
	public static boolean validateData(final String input) {
		return input.length()>=6;
	}
}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData(input));

    }

}
