package p03_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Room {
private String room_number;
private String room_capacity;
static  ArrayList<Student> students = new ArrayList<Student>();
private String rental_cost;
private String floor;
ArrayList<Block> blocks = new ArrayList<Block>();
private String masul;
static ArrayList<Room> rooms = new ArrayList<Room>();
public Room(String room_number) {
	super();
	this.room_number = room_number;
	
}

public Room() {
	
}
public Room(String room_number, String room_capacity, String rental_cost, String floor,String masul) {
	super();
	this.room_number = room_number;
	this.room_capacity = room_capacity;
	this.rental_cost = rental_cost;
	this.floor = floor;
	this.masul = masul;
}
/*
 * making a new room
 */
public static void newRoom(String room_number, String room_capacity, String rental_cost, String floor,String ra) throws FileNotFoundException {
	Room room = new Room(room_number,room_capacity, rental_cost,floor,ra);	 
	rooms.add(room);
	System.out.println(rooms);
	Block.AddtoBlock(room);
}
/*
 * a method to return the rooms arraylist
 */
public static ArrayList<Room> roomlist() {
	return rooms;
}

@Override
public String toString() {
	return "Room : room_number=" + room_number + ", room_capacity=" + room_capacity + ", students=" + students
			+ ", rental_cost=" + rental_cost + ", floor=" + floor + ", masul=" + masul + "";
}


public String getRoom_number() {
	return room_number;
}
public void setRoom_number(String room_number) {
	this.room_number = room_number;
}
public String getRoom_capacity() {
	return room_capacity;
}
public void setRoom_capacity(String room_capacity) {
	this.room_capacity = room_capacity;
}
public ArrayList<Student> getStudents() {
	return students;
}
public void setStudents(ArrayList<Student> students) {
	this.students = students;
}
public String getRental_cost() {
	return rental_cost;
}
public void setRental_cost(String rental_cost) {
	this.rental_cost = rental_cost;
}
public String getFloor() {
	return floor;
}
public void setFloor(String floor) {
	this.floor = floor;
}
public Block getBlock() {
	return getBlock();
}
public void setBlock(Block block) {
	this.blocks = blocks;
}
public String getMasul() {
	return masul;
}
public void setMasul(String masul) {
	this.masul = masul;
}

}