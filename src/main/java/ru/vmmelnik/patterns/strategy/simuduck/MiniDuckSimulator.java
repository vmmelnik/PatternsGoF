package ru.vmmelnik.patterns.strategy.simuduck;

import ru.vmmelnik.patterns.strategy.simuduck.behaviors.FlyRocketPowered;
import ru.vmmelnik.patterns.strategy.simuduck.ducks.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vmmelnik
 * @version 0.3
 */
public class MiniDuckSimulator {

    public static void main( String[] args )
    {
        List<Duck> ducks = new ArrayList<>();
        Collections.addAll(ducks, new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck());
        Duck modelDuck = new ModelDuck();
        ducks.add(modelDuck);

        ducks.forEach((el) -> {
            el.doAll();
            System.out.println();
        });

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
