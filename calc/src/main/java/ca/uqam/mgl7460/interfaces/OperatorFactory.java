package ca.uqam.mgl7460.interfaces;

import ca.uqam.mgl7460.operators.*;

public class OperatorFactory {

    public static Operator getOperator(String type) {
        switch (type) {
            case "-m":
                return new Multiply();
            case "-d":
                return new Divide();
            case "-s":
                return new Substract();
            case "-a":
                return new Sum();
            default:
                return null;

        }
    }
}
