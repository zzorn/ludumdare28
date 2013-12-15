package org.ludumdare28.things.berry;

import org.ludumdare28.things.aspects.EdibleAspect;

/**
 * Author: Shiera
 */
public class PoisonBerry extends BaseBerry {

    /**
     poisonberry:
     hunger    = 0
     damage    = 1
     tiredness = 0
     */
    public PoisonBerry() {
        super(0,1,0);

    }
}
