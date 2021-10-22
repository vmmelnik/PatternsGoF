package ru.vmmelnik.simuduck;

import ru.vmmelnik.simuduck.ducks.Duck;
import ru.vmmelnik.simuduck.ducks.RedheadDuck;

/**
 * @author vmmelnik
 * @version 0.1
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck duck = new RedheadDuck();
        duck.display();
    }
}
