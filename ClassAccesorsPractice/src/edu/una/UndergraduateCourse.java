package edu.una;

import com.ellucian.college.Course;

public class UndergraduateCourse extends Course {
	private int creditHours;
	
	// Mutator? Yes, changes the state of the object
	public void setCreditHours(int hours) {
	 
		this.creditHours = hours;
	}
}
