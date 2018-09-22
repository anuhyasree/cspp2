import java.util.Arrays;

class Todoist {

	private Task[] tasks;
	private int size;

	Todoist() {
		tasks = new Task[100];
		size = 0;
	}
	public void addTask(final Task tsk) {
		tasks[size] = tsk;
		size += 1;
	}

	public String toString() {
		String out = "";
		for (Task entry : tasks) {
			out += entry.toString() + "/n";
			out += "\n";
		}
		return out;
	}

}