package edu.una.esports;
/**
 * @author Noah Catchings
 * This class will use the hardcoded values given and use getters and 
 * setters as well as booleans found in the Game.java file and display all fields
 * 
 */
public class GameTestHarness {
    public static void main(String[] args) {
    	
    	// Hard Coded titles, developers, costs, and singleplayer booleans
    	String[] titles = {"Fallout 4", "Elden Ring", "Rust", "Black Myth: Wukong", "Satisfactory"};
    	String[] developers = {"Bethesda", "FromSoftware Inc.", "Facepunch Studios", "Game Science", "Coffee Stain Studios"};
    	double[] costs = {29.99, 59.99, 29.99, 49.99, 29.99};
        boolean[] singlePlayerModes = {true, true, false, true, true};
        
    	// Array for video games
    	Game[] games = new Game[5];
    	
    	for (int i = 0; i < games.length; i++) {
            games[i] = new Game(titles[i], developers[i], costs[i], singlePlayerModes[i]);
        }
    	
    	System.out.println("Original Game List:");
        
    	for (int i = 0; i < games.length; i++) {
    	    System.out.println(games[i].toString());
    	}
    	
    	// Testing setters to modify original games (Testing rust in this case)
    	System.out.println();
    	System.out.println("Updating Rust: ");
    	games[2].setCost(15.99);
    	games[2].setSinglePlayer(true);
    	games[2].setDeveloper("Bethesda");
    	games[2].setTitle("Rust Remastered");
    	
    	
    	// Displaying updated game list
    	System.out.println();
    	System.out.println("Updated Game List:");
    	System.out.println();
    	
    	
    	for (int i = 0; i < games.length; i++) {
    	    System.out.println(games[i].toString());
    	}
    	
    }
}
