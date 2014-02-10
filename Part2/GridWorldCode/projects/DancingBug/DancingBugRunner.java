
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
	int[] directions = {45,225,180,0,315,90,180,225,270,45,90};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(directions);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
