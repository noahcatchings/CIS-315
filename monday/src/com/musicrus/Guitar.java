package com.musicrus;

import java.util.*;

public abstract class Guitar implements Playable {
	private int year;
	private String make;
	private List<GuitarString> strings;
	
	public Guitar(int year, String make) {
		this.year = year;
		this.make = make;
		this.strings = new LinkedList<GuitarString>();
		for (int i = 0; i < 6; i++) {
			strings.add(new GuitarString());
		}
	}
	
	public int getNumberOfStrings() {
		return strings.size();
	}
	
	public String toString() {
		return "a guitar with " + getNumberOfStrings();
	}
}
