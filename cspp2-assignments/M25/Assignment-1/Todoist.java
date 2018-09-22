import java.util.Arrays;

class Todoist {

	private Task[] tasks;
	private int size;

	Todoist() {
		final int max = 100;
		tasks = new Task[max];
		size = 0;
	}
	public void addTask(final Task tsk) {
		tasks[size] = tsk;
		size += 1;
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