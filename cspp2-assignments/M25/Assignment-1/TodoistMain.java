import java.util.Scanner;

/**.
  * write your code below this comment
  */
class Task {
    /**.
     * { var_description }
     */
    private String title;
    /**.
     * { var_description }
     */
    private String assignedTo;
    /**.
     * { var_description }
     */
    private int timeToComplete;
    /**.
     * { var_description }
     */
    private boolean important;
    /**.
     * { var_description }
     */
    private boolean urgent;
    /**.
     * { var_description }
     */
    private String status;


    /**.
     * Constructs the object.
     *
     * @param      title           The title
     * @param      assignedTo      The assigned to
     * @param      timeToComplete  The time to complete
     * @param      important       The important
     * @param      urgent          The urgent
     * @param      status          The status
     * @throws     Exception  if task inputs are invalid
     */
    Task(final String titles, final String assignedTos,
         final int timeToCompletes, final boolean importants,
         final boolean urgents, final String statuss) throws Exception {

        assignedTo = assignedTos;
        timeToComplete = timeToCompletes;
        important = importants;
        urgent = urgents;

        if (title.length() > 0) {
            title = titles;
        } else {
            throw new Exception("Title not provided");
        }
        if (timeToComplete < 0) {
            throw new Exception("Invalid timeToComplete " + timeToComplete);
        }
        if (statuss.equals("todo") || statuss.equals("done")) {
            status = statuss;
        } else {
            throw new Exception("Invalid status " + status);
        }
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String importantmsg = "";
        String urgentmsg = "";

        if (important) {
            importantmsg = "Important";
        } else {
            importantmsg = "Not Important";
        }

        if (urgent) {
            urgentmsg = "Urgent";
        } else {
            urgentmsg = "Not Urgent";
        }

        return title + ", " + assignedTo + ", " + timeToComplete + ", "
               + importantmsg + ", " + urgentmsg + ", " + status;

    }
}

/**.
 * Class for todoist main.
 */
public class TodoistMain {

    /**.
     * Constructs the object.
     */
    public TodoistMain() {
        /**.
         * { item_description }
         */
    }

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            case "add-task":
                testAddTask(todo, tokens);
                break;
            case "print-todoist":
                System.out.println(todo);
                break;
            // case "get-next":
            //  System.out.println(todo.getNextTask(tokens[1]));
            //  break;
            // case "get-next-n":
            //  int n = Integer.parseInt(tokens[2]);
            //  Task[] tasks = todo.getNextTask(tokens[1], n);
            //  System.out.println(Arrays.deepToString(tasks));
            //  break;
            // case "total-time":
            //  System.out.println(todo.totalTime4Completion());
            //  break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo,
                                   final String[] tokens) {
        try {
         todo.addTask(createTask(tokens));
        } catch (Exception e) {
         System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**.
     * { var_description }
     */
    public static final int three = 3;
    /**.
     * { var_description }
     */
    public static final int four = 4;
    /**.
     * { var_description }
     */
    public static final int five = 5;
    /**.
     * { var_description }
     */
    public static final int six = 6;

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[three]);
        boolean important = tokens[four].equals("y");
        boolean urgent = tokens[five].equals("y");
        String status = tokens[six];
        return new Task(
                   title, assignedTo, timeToComplete,
                   important, urgent, status);
    }
    /**.
     * Gets the next task.
     *
     * @param      name  The name
     *
     * @return     The next task.
     */
    public static Task getNextTask(final String name) {
        return null;
    }
    /**.
     * Gets the next task.
     *
     * @param      name   The name
     * @param      count  The count
     *
     * @return     The next task.
     */
    public static Task getNextTask(final String name, final int count) {
        return null;
    }
    /**.
     * { function_description }
     *
     * @param      totaltime  The totaltime
     *
     * @return     { description_of_the_return_value }
     */
    public static int  totalTime4Completion(final int totaltime) {
        return totaltime;
    }
    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}

