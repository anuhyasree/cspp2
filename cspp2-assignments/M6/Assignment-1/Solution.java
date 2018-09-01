import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    public static final int THREE = 3;
    /**.
     * { function_description }
     *
     * @param      n     { parameter_description }
     */
    static void oddComposites(final int n) {
        int count = 0;
        for(int i = THREE; i <= n; i++) {
            if (i % 2 != 0) {
                count = 0;
                for(int j = THREE; j < i; j++) {
                    if(i % j == 0) {
                        count++;
                    }
                } 
                if (count > 0) {
                    System.out.println(i);
                }
            }
        }   
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

