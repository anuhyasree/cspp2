
 /**.
 *{ To get the number of 7's present until n value }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */

public final class Solution {
    /**.
     * Constructs the object.
     */
    public static final int N_O = 10;
    /**
     * Constructs the object.
     */
    public static final int N_U_M = 7;
    /**
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
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int numberof7s(final int n) {
        /**.
         * { Function to return the number of 7's present in one number}
         */
    int x = n;
    int count = 0;
    while (x > 0) {
        /**.
         * { item_description }
         */
        if (x % N_O == N_U_M) {
        count++;
        }
        x = x / N_O;
    }
    /**.
     * { Returns the value if the 7 is present or not and how many are present}
     */
    return count;
}
    // Counts the number of '7'
    // digits between 0 and n
    /**.
     * { function_description }
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int numberinrange(final int n) {
        /**.
         * { Function to retuen the Number of 7's present until n value }
         */
        // Initialize result
        int count = 0;
        // Count 7's in every number
        // from 7 to n
        for (int i = N_U_M; i <= n; i++) {
        count += numberof7s(i);
    }
        return count;
}
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { Main function}
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(numberinrange(n));
    }
}