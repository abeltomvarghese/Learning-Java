package com.company;

import com.sun.tools.jconsole.JConsoleContext;

public class Main {

    public static void main(String[] args) {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(100.0d, 50.0d, 'a');
        equations[2] = new MathEquation(100.0d, 50.0d, 's');
        equations[3] = new MathEquation(100.0d, 50.0d, 'm');
        System.out.println("**************************************** USING ENUMS ******************************");
        String[] statements = {"divide 100.0 50.0", "add 25.0 92.0", "subtract 225.0 12.0", "multiply 12.0 11.0", "dividex 100.0 50.0", "divide 100.0 2.0 50.0", "divide test 50.0" };

        CalcHelper calcHelper = new CalcHelper();
        for (String statement: statements) {
            try {
                calcHelper.process(statement);
                System.out.println(calcHelper);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {

                }
            }
        }

        System.out.println("**************************************** END ******************************");

        for (MathEquation eachEquation: equations) {
            eachEquation.execute();
            System.out.println("result = " + eachEquation.getResult());
        }

        double leftDouble = 9.0d;
        double rightDouble = 40d;

        int leftInt = 9;
        int rightInt = 4;
        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);

        equationOverload.execute(leftInt, rightInt);
        equationOverload.execute((double)leftInt, rightInt);


        System.out.println("Using Inheritance");

        CalcBase[] calculators = {
                new Adder(100.0d, 50.0d),
                new Divider(100.0d, 50.0d),
                new Subtracter(100.0d, 50.0d),
                new Multiplier(100.0d, 50.0d)
        };

        for (CalcBase calc:calculators) {
            calc.calculate();
            System.out.println("Result: " + calc.getResult());
        }
    }


}
