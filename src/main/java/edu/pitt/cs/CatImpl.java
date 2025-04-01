package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int id;
	String name;
	boolean rent = false;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.id = id;
		this.name = name;
	}
	
	public void rentCat() {
		// TODO: Fill in
		rent = true;
	}

	public void returnCat() {
		// TODO: Fill in
		rent = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return name;
	}

	public int getId() {
		// TODO: Fill in
		return id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return rent;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + id + ". " + name;
	}
	
}