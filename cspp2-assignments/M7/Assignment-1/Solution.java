import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    private String str;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    public static final int SIX = 6;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    protected InputValidator(final String input) {
        /**.
         * { item_description }
         */
        this.str = input;
    }
    /**.
     * { function_description }
     *
     * @param      input  The input
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean validateData(final String input) {
        /**.
         * { item_description }
         */
        return input.length() >= SIX;
    }
}
/**.
 * Class for solution.
 */
public final class Solution {    
    /**.
     * { item_description }
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData(input));

    }

}
