import java.util.Scanner;

class User {
	private String username;
	private List<String> connections;

	public User(String username) {
		this.username = username;
		connections = null;
	}
	public User(String username, List<String> connections) {
		this.username = username;
		this.connections = connections;

	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getConnection() {
		return connections;
	}
	public void setConnection(List<String> connections) {
		this.connections = connections;
	}
	// public void addConnection(String friend) {
	// 	connections.add(friend);

	// }
	public boolean equals(Object o) {
		User u = (User) o;
		return u.getUsername().equals(this.getUsername());
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getUsername() + ": [");
		for (int i = 0; i < connections.size() - 1; i++) {
			sb.append(connections.get(i) + ", ");
		}
		sb.append(connections.get(connections.size() - 1) + "], ");
		return sb.toString();
	}
}
