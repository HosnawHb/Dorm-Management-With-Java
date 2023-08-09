package p03_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Block  {
private String block_number;
private String floor;
static ArrayList<Room> rooms = new ArrayList<Room>();
static ArrayList<Block>blocks = new ArrayList<Block>();
static ArrayList<Dorm> dorms = new ArrayList<Dorm>();
private Dorm dorm;
public String getDormName() {
	String name = dorm.getName();
	return name;
}
@Override
public String toString() {
	return "Block: block_number=" + block_number + ", floor=" + floor + "";
}
public String getBlock_number() {
	return block_number;
}
public void setBlock_number(String block_number) {
	this.block_number = block_number;
}
public String getFloor() {
	return floor;
}
public void setFloor(String floor) {
	this.floor = floor;
}
public ArrayList<Room> getRooms() {
	return rooms;
}
public void setRooms(ArrayList<Room> rooms) {
	this.rooms = rooms;
}
public Dorm getDorm() {
	return dorm;
}
public void setDorm(Dorm dorm) {
	this.dorm = dorm;
}
 static public void AddtoBlock(Room room) {
	rooms.add(room);
}
 /*
  * making a new block and adding it to the dorm
  */
 public static void newBlock(String block_number, String floor_number) {
		Block block = new Block(block_number,floor_number);
		blocks.add(block);
		System.out.println(blocks);
		Dorm.AddtoDorm(block);
	}
public Block(String block_number, String floor) {
	super();
	this.block_number = block_number;
	this.floor = floor;
}
}
