/**.
 * { Program to find the a power b with the hep of recursion }
 */
import java.util.Scanner;
/**.
 * Class for solution.
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
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     { description_of_the_return_value }
     */
    public static long power(final int base, final int exponent) {
        /**.
         * {Recursive function to find the power }
         */
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        } else {
            return 1;
        }
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { Main Function}
         */
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**.
    Need to write the power function and print the output.
    */
}
