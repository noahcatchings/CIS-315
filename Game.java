package edu.una.esports;


public class Game {
	private String title;
	private String developer;
	private double cost;
	private boolean singlePlayer;
	
	// Constructor with title and developer only
	public Game(String title, String developer) {
		this.title = title;
		this.developer = developer;
		this.cost = 0.0;
		this.singlePlayer = false;
		
	}
	// Constructor with all fields
	public Game(String title, String developers, double cost, boolean singlePlayer) {
        this.title = title;
        this.developer = developers;
        this.cost = cost;
        this.singlePlayer = singlePlayer;
    }
	
	// Getters
	public String getTitle() {
		return title;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public double getCost() {
		return cost;
	}
	
	public boolean getSinglePlayer() {
		return singlePlayer;
	}
	
	
	// Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setSinglePlayer(boolean singlePlayer) {
        this.singlePlayer = singlePlayer;
    }
	
	
	// Entry level check
	public boolean isEntryLevel() {
	    if (cost < 30 && singlePlayer) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	// toString method
	@Override
	public String toString() {
		String singlePlayerMode;
		String entryLevelStatus;
		
		if (singlePlayer) {
			singlePlayerMode = "Yes";
		}
		else {
			singlePlayerMode = "No";
		}
		
		if (isEntryLevel()) {
			entryLevelStatus = "Yes";
		}
		else {
			entryLevelStatus = "No";
		}
		
		
        return  title + " | Developer: " + developer + " | Cost: $" + cost + " | Single Player: " + singlePlayerMode + " | Entry Level: " + entryLevelStatus;
	}
	
}
