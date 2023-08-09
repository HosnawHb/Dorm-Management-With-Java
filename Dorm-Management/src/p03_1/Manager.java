package p03_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	private String name;
	private String username;
	private String password;
	ArrayList<Student> students;// = new ArrayList<Student>();
	ArrayList<Room> rooms = new ArrayList<Room>();
	private final ArrayList<Manager> managers = new ArrayList<Manager>();

	public Manager() {

	}

	public Manager(String name, String username, String password) {
		super();
		this.name = name;
		this.setUsername(username);
		this.setPassword(password);
	}

	public Manager(String name) {
		super();
		this.name = name;

	}

	public ArrayList<Manager> Login() {
		Scanner s = null;
		Manager m = null;
		try {
			s = new Scanner(new File("Manager.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		while (s.hasNextLine()) {
			String[] split = s.nextLine().split(",");
			m = new Manager(split[0], split[1], split[2]);
			managers.add(m);
		}
		return managers;
	}

	/*
	 * adding a new manager
	 */
	public void newManager(String name, String username, String password) {
		Manager m = new Manager(name, username, password);
		managers.add(m);
		System.out.println(managers);
	}

	/*
	 * finding a manager based on name
	 */
	public Manager getmanager(String name) {
		Manager m = null;
		for (int i = 0; i < managers.size(); i++) {
			if (managers.get(i).name.equals(name)) {
				m = managers.get(i);
				break;
			}
		}
		return m;
	}

	/*
	 * adding a new student to student list
	 */
	public void AddStudent(String name, String id, String major, String entry_year, String debt) {

		Student.newStudent(name, id, major, entry_year, debt);

	}

	/*
	 * delete a student from student list
	 */
	public void DelStudent(String id) {
		// Student s = new Student(id);
		Student.Del(id);

	}

	/*
	 * show members of a room
	 */
	public void ShowRoomMembers(String room_number) {
		rooms = Room.roomlist();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getRoom_number().equals(room_number)) {
				for (int j = 0; j < rooms.get(i).students.size(); j++) {
					System.out.println(rooms.get(i).students.get(j));
				}
			}
		}

	}

	/*
	 * adding a student to a room
	 */
	public void SelectRoom(String room_number, String id) {
		Student.selectroom(room_number, id);
	}

	public void show() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}

	/*
	 * edit a student
	 */
	public void EditStudent(String id, String newname, String newid, String newmajor, String newentry, String newdebt) {
		Student s = new Student(id);
		s = s.Edit(id, newname, newid, newmajor, newentry, newdebt);
	}

	/*
	 * showing members of the same room as the student
	 */
	public void showmembers(String id, String room_number) {
		rooms = Room.roomlist();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getRoom_number().equals(room_number)) {
				for(int j=0; j<rooms.get(i).students.size();j++) {
					if(rooms.get(i).students.get(j).getId().equals(id)) {
						System.out.println();
			   }
					else {
						System.out.println(rooms.get(i).students.get(j) );
					}
			}
		}
	}
}
	/*
	 * searching for a student
	 */
	public void search(String id) {
		Student student = new Student(id);
		student = Student.search(id);
		System.out.println(student);
	}

	/*
	 * deleting all the students in a room
	 */
	public void deleteall(String room_number) {
		rooms = Room.roomlist();
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getRoom_number().equals(room_number)) {
				rooms.get(i).students.clear();
				System.out.println(rooms.get(i));
			}

		}
	}

	/*
	 * showing empty rooms
	 */

	public void showemptyroom() {
		rooms = Room.roomlist();
		int rcc;
		for (int i = 0; i < rooms.size(); i++) {
			int rss = (rooms.get(i).students.size());
			String rc = (rooms.get(i).getRoom_capacity());
			rcc = Integer.parseInt(rc);
			if (rss < rcc) {
				System.out.println(rooms.get(i));
			}

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Manager: name=" + name + ", username=" + username + ", password=" + password + "";
	}
}