import java.util.Arrays;
import java.lang.*;

class Todoist {

	private Task[] tasks;
	private int size;

	Todoist() {
		tasks = new Task[100];
		size = 0;
	}
	public void addTask(final Task tsk) {
		tasks[size++] = tsk;
	}

	public String toString() {
		String out = "";
		for (Task entry : tasks) {
			out += entry.toString();
			out += "\n";
		}
		return out;
	}

}