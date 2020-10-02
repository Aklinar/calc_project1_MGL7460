package ca.uqam.mgl7460.interfaces;

import ca.uqam.mgl7460.operators.Operator;

public class ArgsListener {

    private String[] params;

    public ArgsListener(String[] args) {
        setParams(args);
    }

    public String start() {
        Operator op = OperatorFactory.getOperator(getParams()[0]);
        if (op == null) {
            checkParams();
            return null;
        }
        return op.result(getParams()[1], getParams()[2]);
    }

    public void checkParams() {
        if (getParams()[0] == "-h") {
            help();
        } else {
            error();
        }
    }

    public void help() {
        System.out.println("Aide");
    }

    public void error() {
        System.out.println("Erreur");
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

}
