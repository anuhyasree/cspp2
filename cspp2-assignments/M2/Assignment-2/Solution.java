
/**
 * { item_description }
 */

import java.util.Scanner;

/**
 * Class for solution.
 */

final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
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
    public static void rootQuad(final int a, final int b, final int  c) {
        /**
         * { item_description }
         */
        double root1, root2;
        int y = b * b - 2 * 2 * a * c;
             root1 = (-b + java.lang.Math.sqrt(y)) / (2 * a);
             root2 = (-b - java.lang.Math.sqrt(y)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
        /**.
         * { function_description }
         *
         * @param      args  The arguments
         */
    public static void main(final String[] args) {
        /**
         * { var_description }
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootQuad(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}


