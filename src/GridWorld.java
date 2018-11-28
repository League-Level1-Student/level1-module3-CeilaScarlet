import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		
		Bug bug = new Bug();
		bug.getColor();
		bug.turn();
		bug.setColor(Color.magenta);
		
		Flower flower = new Flower();
		flower.getColor();
		flower.setColor(Color.BLUE);
	
		Location location = new Location(3, 10);
		
		world.show();
		world.add(location, flower);
	}

}