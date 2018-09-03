import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    private String input;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    public InputValidator(final String input) {
        /**.
         * { item_description }
         */
        this.input = input;
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
        return input.length()>= 6;
    }
}
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * { item_description }
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData(input));

    }

}
