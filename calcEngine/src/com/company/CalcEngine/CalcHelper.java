package com.company.CalcEngine;

import org.jetbrains.annotations.NotNull;

public class CalcHelper {
    private final static char ADD_SYMBOL = '+';
    private final static char SUBTRACT_SYMBOL = '-';
    private final static char DIVIDE_SYMBOL = '/';
    private final static char MULTIPLY_SYMBOL = '*';
    MathCommands command = null;
    double rightVal;
    double leftVal;
    double result;
    public void process(@NotNull String statement) throws InvalidStatementException {
        command = null;
        String[] mathEquation = statement.split(" ");

        if (mathEquation.length != 3) {
            throw new InvalidStatementException("Too many arguments in String", statement);
        }

        String operator = mathEquation[0];
        try {
            leftVal = Double.parseDouble(mathEquation[1]);
            rightVal = Double.parseDouble(mathEquation[2]);
        } catch (NumberFormatException e) {
            throw new InvalidStatementException("Inputs are not numbers", String.join(" ", Double.toString(leftVal),Double.toString(rightVal)),e);
        }
        setCommandString(operator);

        if (command == null) {
            throw new InvalidStatementException("Incorrect operation",statement);
        }



        CalcBase calcBase = null;

        switch (command) {
            case Add:
                calcBase = new Adder(leftVal, rightVal);
                break;
            case Divide:
                calcBase = new Divider(leftVal, rightVal);
                break;
            case Multiply:
                calcBase = new Multiplier(leftVal, rightVal);
                break;
            case Subtract:
                calcBase = new Subtracter(leftVal, rightVal);
                break;
        }
        calcBase.calculate();
        result = calcBase.getResult();
    }

    private void setCommandString(String commandString) {
        if (commandString.equalsIgnoreCase(MathCommands.Add.toString())) {
            command = MathCommands.Add;
        } else if (commandString.equalsIgnoreCase(MathCommands.Subtract.toString())) {
            command = MathCommands.Subtract;
        } else if (commandString.equalsIgnoreCase(MathCommands.Divide.toString())) {
            command = MathCommands.Divide;
        } else if (commandString.equalsIgnoreCase(MathCommands.Multiply.toString())) {
            command = MathCommands.Multiply;
        }

    }

    @Override
    public String toString() {
        char operater = '\0';
        switch (command) {
            case Subtract:
                operater = SUBTRACT_SYMBOL;
                break;
            case Add:
                operater = ADD_SYMBOL;
                break;
            case Multiply:
                operater = MULTIPLY_SYMBOL;
                break;
            case Divide:
                operater = DIVIDE_SYMBOL;
                break;
        }
        return String.join(" ",Double.toString(leftVal),Character.toString(operater),Double.toString(rightVal),"=",Double.toString(result));
        /*
        ALTERNATIVE METHOD
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(Double.toString(leftVal));
        stringBuilder.append(" ");
        stringBuilder.append(Character.toString(operater));
        stringBuilder.append(" ");
        stringBuilder.append(Double.toString(rightVal));
        stringBuilder.append(" ");
        stringBuilder.append(Double.toString(result));
         */
    }
}
