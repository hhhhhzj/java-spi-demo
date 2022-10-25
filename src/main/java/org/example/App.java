package org.example;

import java.util.ServiceLoader;
import spi.IShout;

public class App {
    public static void main( String[] args ) {
            ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
            for (IShout s : shouts) {
                s.shout();
            }
    }
}
