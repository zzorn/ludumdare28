package org.ludumdare28.world;

import org.ludumdare28.things.player.Player;
import org.ludumdare28.Updating;
import org.ludumdare28.ground.Ground;
import org.ludumdare28.things.Thing;

import java.util.List;

/**
 * Keeps track of all things.
 */
public interface World extends Updating {

    Ground getGround();

    Player getPlayer();

    void deleteThing(Thing thing);

    void addThing(Thing thing);

    void addThing(Thing thing, double x, double y);


    List<Thing> getThings();
}
