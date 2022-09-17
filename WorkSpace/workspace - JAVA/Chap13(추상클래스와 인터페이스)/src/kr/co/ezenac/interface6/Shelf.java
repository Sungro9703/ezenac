package kr.co.ezenac.interface6;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	public int getCount() {
		return shelf.size();
	}
}
