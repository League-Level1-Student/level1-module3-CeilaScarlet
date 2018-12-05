import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		
		World world = new World();
		
		Location locationb1 = new Location(3, 1);
		
		Bug bug0 = new Bug();
		bug0.getColor();
		bug0.turn();
		bug0.setColor(Color.BLUE);
		
		Location locationb2 = new Location(6, 8);
		
		Bug bug1 = new Bug();
		bug1.getColor();
		bug1.turn();
		bug1.setColor(Color.blue);
		
		Location locationf0 = new Location(6, 9);
		
		Flower flower0 = new Flower();
		flower0.getColor();
		flower0.setColor(Color.BLUE);
		
		Location locationf1 = new Location(6, 7);
	
		Flower flower1 = new Flower();
		flower1.getColor();
		flower1.setColor(Color.BLUE);
	
		world.show();
		world.add(locationb1, bug0);
		world.add(locationb2, bug1);
		world.add(locationf0, flower0);
		world.add(locationf1, flower1);
		
		for (int i = 0; i < 100; i++) {
			world.add(world.getRandomEmptyLocation(), flower1);
		}
		
	
	}

}