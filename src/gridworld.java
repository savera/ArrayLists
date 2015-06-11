import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class gridworld {
	static Location flower3Location;
	public static void main(String[] args) {
		
		World bestWorldEver= new World();
		bestWorldEver.show();
		
		System.out.println("BEST WORLD EVER!");

		Bug bestBugEver = new Bug();
		
		Location bugLocation = new Location(3,7);
		
		bestWorldEver.add(bugLocation, bestBugEver);
		
		Bug awesomeBug = new Bug ();
		int rows = new Random().nextInt(9);
		int columns = new Random().nextInt(9);
		
		Location awesomeBugLocation = new Location(rows,columns);
		
		bestWorldEver.add(awesomeBugLocation, awesomeBug);
		
		awesomeBug.setColor(Color.blue);
		awesomeBug.turn();
		awesomeBug.turn();
		
		//Flower coolFlower = new Flower();
		
		
		Location flower1Location = new Location(rows, columns+1);
		Location flower2Location = new Location(rows, columns-1);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("go");
			
			Flower coolFlower = new Flower();
		 flower3Location = new Location(i, i);
		 bestWorldEver.add(flower3Location, coolFlower);
		 
		
		}
		
		//bestWorldEver.add(flower1Location, coolFlower);
		//bestWorldEver.add(flower2Location, coolFlower);
		
	}
}
