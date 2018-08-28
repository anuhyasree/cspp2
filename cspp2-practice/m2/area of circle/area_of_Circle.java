import java.util.*;
import java.lang.Math.*;

class area_of_Circle
{
    public static double pi(){
        return 3.14;
    }
    public static double area(double r){

        return pi()*r*r;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(area(r));
        
    }
}
