package ru.vmmelnik.simuduck;

import ru.vmmelnik.simuduck.ducks.Duck;
import ru.vmmelnik.simuduck.ducks.RubberDuck;

/**
 * @author vmmelnik
 * @version 0.2
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck duck = new RubberDuck();
        duck.display();
        duck.fly();
    }
}
