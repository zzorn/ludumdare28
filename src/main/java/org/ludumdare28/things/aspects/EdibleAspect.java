package org.ludumdare28.things.aspects;

import org.ludumdare28.things.Player;
import org.ludumdare28.things.Thing;

/**
 * Data about the nutrition value of some thing.
 */
public class EdibleAspect {
    private double hungerChange;
    private double poisonChange;
    private double tirednessChange;

    /** Changes "heal" when negative*/
    public EdibleAspect(double hungerChange, double poisonChange, double tirednessChange) {
        this.hungerChange = hungerChange;
        this.poisonChange = poisonChange;
        this.tirednessChange = tirednessChange;
    }

    /**
     * Called when the thing is eaten
     * @param player creature that ate the thing, can be modified with any effects from eating it.
     */
    public void eat(Player player, Thing thisThing) {
        player.changeDamage(poisonChange);
        player.changeHunger(hungerChange);
        player.changeTiredness(tirednessChange);
        thisThing.delete();
    }

}
