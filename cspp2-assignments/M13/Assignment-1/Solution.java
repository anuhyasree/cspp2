import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :
 */
class Set {
    private int[] set;
    private int size;

    public Set() {
        final int a = 10;
        set = new int[a];
        size = 0;

    }
    public void add(final int item) {
        if (size == set.length) {
            resize();
        }
        set[size++] = item;
    }
    public int size() {
        return size;
    }
    private void resize() {
        set = Arrays.copyOf(set, (set.length * 2));
    }

    public boolean contains(final int item) {
        /**.
         * { item_description }
         */
        for (int element : set) {
            if (element == item) {
                return true;
            }
        }
        return false;
    }
    public void add(final int[] items) {
        // write the logic
        int len = items.length + size;
        int temp = 0;
        for (int i = size; i < len; i++) {
            set[i] = items[temp];
            temp++;
        }
        size = len;
    }
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String str = "[";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + set[i] + ",";
        }
        str = str + set[i] + "]";
        return str;
    }
    public Set intersection(Set set) {
        return set;

    }
    public int[] retainAll(int[] a) {
        return a;

    }
    // public int[][] cartesianProduct(int[][] arr) {
    //     return arr;
    // }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            // case "cartesianProduct":
            //     s = new Set();
            //     t = new Set();
            //     intArray = intArray(tokens[1]);
            //     s.add(intArray);
            //     intArray = intArray(tokens[2]);
            //     t.add(intArray);
            //     System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
            //     break;
            // default:
            //     break;
            }
        }
    }
}
