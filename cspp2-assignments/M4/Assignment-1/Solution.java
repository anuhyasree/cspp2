
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * { item_description }
     */
    private Solution() {

    }
   /*
    Fill this main function to print maximum of given array
    */
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        int i, max;
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
