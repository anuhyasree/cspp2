import java.util.Scanner;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    String input;
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
    public static boolean validateData(final String input) {
        /**.
         * { item_description }
         */
        return input.length()>=6;
    }
}
public class Solution {
    /**.
     * { item_description }
     */
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String input=s.next();
        InputValidator i=new InputValidator(input);     
        System.out.println(i.validateData(input));

    }

}
