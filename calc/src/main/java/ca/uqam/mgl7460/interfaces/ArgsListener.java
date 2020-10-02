package ca.uqam.mgl7460.interfaces;

import ca.uqam.mgl7460.operators.Operator;

public class ArgsListener {

    private final String[] params;

    public ArgsListener(String[] args) {
        this.params = args;
    }

    public void start() {
        if (this.params.length == 0) {
            help();
            return;
        }
        Operator op = OperatorFactory.getOperator(this.params[0]);
        if (op == null) {
            error();
            help();
            return;
        }
        System.out.println(op.result(this.params[1], this.params[2]));
    }

    public void help() {
        System.out.println("Usage: java -jar calc.jar OPTION value1 value2\n\n" +
                "Options:\n" +
                "\t-a\tAdditionner value1 et value2\n" +
                "\t-s\tSoustraire value1 et value2\n" +
                "\t-d\tDiviser value1 et value2\n" +
                "\t-m\tMultiplier value1 et value2\n");
    }

    public void error() {
        System.out.println("Option \"" + this.params[0] + "\" inconnue\nVoir l'aide :\n");
    }

}
