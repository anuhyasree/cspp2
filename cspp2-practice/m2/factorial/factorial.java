import java.util.*;
import java.lang.Math.*;
/**
 * Class for factorial.
 */
class factorial{
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     */
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
    }

        }

            /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        
    }
}
