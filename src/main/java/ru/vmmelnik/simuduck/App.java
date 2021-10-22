package ru.vmmelnik.simuduck;

import ru.vmmelnik.simuduck.ducks.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vmmelnik
 * @version 0.3
 */
public class App {

    public static void main( String[] args )
    {
        List<Duck> ducks = new ArrayList<>();
        Collections.addAll(ducks, new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck());
        ducks.forEach((el) -> {
            el.doAll();
            System.out.println();
        });
    }
}
