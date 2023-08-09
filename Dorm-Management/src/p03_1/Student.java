package p03_1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Student {
	private String name;
	private String id;
	private String major;
	private String entry_year;
	private String debt;
	 static ArrayList<Room> rooms = new ArrayList<Room>();
	static ArrayList<Student> students = new ArrayList<Student>();

	public Student(String id) {
		super();
		this.id = id;
		this.setId(id);

	}

	public Student(String name, String id, String major, String entry_year, String debt) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
		this.entry_year = entry_year;
		this.debt = debt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEntry_year() {
		return entry_year;
	}

	public void setEntry_year(String entry_year) {
		this.entry_year = entry_year;
	}

	public String getDebt() {
		return debt;
	}

	public void setDebt(String debt) {
		this.debt = debt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static ArrayList<Student> stdlist() {
		return students;
	}
/*
 * editing a student 
 */
	public Student Edit(String id, String newname, String newid, String newmajor, String newentry, String newdebt) {
		Student s = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				s = students.get(i);
				s.setName(newname);
				s.name = s.getName();
				s.setId(newid);
				s.id = s.getId();
				s.setMajor(newmajor);
				s.major = s.getMajor();
				s.setEntry_year(newentry);
				s.entry_year = s.getEntry_year();
				s.setDebt(newdebt);
				s.debt = s.getDebt();

			}
		}
		return s;
	}
/*
 * searching a student with student id 
 */
	public static Student search(String id) {
		Student s = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				s = students.get(i);
			}
		}
		return s;

	}
/*
 *  deleting a student
 */
	public static ArrayList<Student> Del(String id) {
		int i = 0;
		Student s = null;
		for (i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.remove(i);
				System.out.println(students);
			}
		}
		return students;
	}
/*
 * adding a new student to the list of students
 */
	public static void newStudent(String name, String id, String major, String entry_year, String debt) {
		Student student = new Student(name, id, major, entry_year, debt);
		students.add(student);
		System.out.println(students);
	}
/* 
 * adding a student to a room 
 */
	public static void selectroom(String room_number, String id) {
		rooms = Room.roomlist(); //sending the roomlist to this method
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
                 System.out.println(students.get(i));
				for (int j = 0; j < rooms.size(); j++) {
					if (rooms.get(j).getRoom_number().equals(room_number)) {
						rooms.get(j).students.add(students.get(i));
						System.out.println(rooms.get(j));
					}
				}
			}
		}
		

	}

	@Override
	public String toString() {
		return "Student: name=" + name + ", id=" + id + ", major=" + major + ", entry_year=" + entry_year + ", debt="
				+ debt + "";
	}

}
