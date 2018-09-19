import java.util.ArrayList;
import java.util.Arrays;
class Network {

	private List<User> users;

	public Network() {
		users = new List<User>();
	}

	public void addConnection(String uname, String friend) {
		int index = users.indexOf(new User(uname));
		if (index == -1) {
			System.out.println("Not a user in Network");
			return;
		} else {
			if (users.get(index).getConnection().contains(friend) == false) {
				users.get(index).getConnection().add(friend);
			}
		}
	}

	public void addNewUser(String uname, List<String> connections) {
		if (users.size() == 0) {
			users.add(new User(uname, connections));
		} else {
			for (int i = 0; i < users.size(); i++) {
				if (users.get(i).getUsername().equals(uname)) {
					System.out.println("User already exists");
					return;
				}
			}
			users.add(new User(uname, connections));
		}
	}
	public List<String> getConnection(String uname) {
		int index = users.indexOf(new User(uname));
		if (index != -1) {
			return users.get(index).getConnection();
		}
		return null;
	}
	public List<String> getCommonConnection(String uname, String uname1) {
		List<String> common = new List<String>();
		List<String> frndsListA = getConnection(uname);
		List<String> frndsListB = getConnection(uname1);
		for (int i = 0; i < frndsListA.size(); i++) {
			if (frndsListB.contains(frndsListA.get(i))) {
				common.add(frndsListA.get(i));
			}
		}
		return common;
	}
	public String toString() {
		StringBuffer s = new StringBuffer();
		ArrayList list = new ArrayList();
		for (int i = 0; i < users.size(); i++) {
			list.add(users.get(i).getUsername());
		}
		java.util.Collections.sort(list);
		for (int i = 0; i < users.size(); i++) {
			int index = users.indexOf(new User((String)list.get(i)));
			s.append(users.get(index));
		}
		String string = s.toString();
		return string.substring(0, string.length() - 2);
	}
}