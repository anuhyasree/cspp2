import java.util.Scanner;
/**. Solution the class
*/
final class Solution {
    /**. Fill the main function to print resultant of addition of matrices*/
    private Solution() {
        /**.
        @constructor
        */
    }
    /**.
    @param args the arguments
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int nr1 = s.nextInt();
        int nc1 = s.nextInt();
        int[][] arr = new int[nr1][nc1];
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int nr2 = s.nextInt();
        int nc2 = s.nextInt();
        int[][] ar = new int[nr2][nc2];
        for (int i = 0; i < nr2; i++) {
            for (int j = 0; j < nc2; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        int[][] newarray = new int[nr1][nc1];
    if (nr1 == nr2 && nc1 == nc2) {
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                newarray[i][j] = arr[i][j] + ar[i][j];
            }
        }
        for (int i = 0; i < nr1; i++) {
            for (int j = 0; j < nc1; j++) {
                if (j == nc1 - 1) {
                    System.out.print(newarray[i][j]);
                } else {
                    System.out.print(newarray[i][j] + " ");
                }
            }
        System.out.println();
        }

} else {
        System.out.println("not possible");
    }
    }
}

