/**.
 * { Program to find the Qudratci roots of the equation}
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void rootsOQD(final int a, final int b, final int c) {
        /**.
         * { Function definition }
         */
        double sq = java.lang.Math.sqrt((b * b) - (2 * 2 * a * c));
        double quad1 = ((-b + sq) / (2 * a));
        double quad2 = ((-b - sq) / (2 * a));
        System.out.println(quad1 + " " + quad2);

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { main function }
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOQD(a, b, c);
    }
    /**.
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}