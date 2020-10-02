package ca.uqam.mgl7460;

import ca.uqam.mgl7460.interfaces.ArgsListener;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArgsListener argsListener = new ArgsListener(args);
        System.out.println(argsListener.start());
    }
}
