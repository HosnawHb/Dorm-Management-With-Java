package p03_1;

import java.util.ArrayList;


public class Dorm {
private String name;
private String type;
private String block_number;
int members;
static ArrayList<Block> blocks = new ArrayList<Block>();
Manager manager;
/*
 * adding the new block to the dorm
 */
static public void AddtoDorm(Block block) {
	blocks.add(block);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBlock_number() {
	return block_number;
}
public void setBlock_number(String block_number) {
	this.block_number = block_number;
}
public int getMembers() {
	return members;
}
public void setMembers(int members) {
	this.members = members;
}
public ArrayList<Block> getBlocks() {
	return blocks;
}
public void setBlocks(ArrayList<Block> blocks) {
	this.blocks = blocks;
}
public Manager getManager() {
	return manager;
}
public void setManager(Manager manager) {
	this.manager = manager;
}

}
