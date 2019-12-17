package com.company;

public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(100.0d, 50.0d, 'a');
        equations[2] = new MathEquation(100.0d, 50.0d, 's');
        equations[3] = new MathEquation(100.0d, 50.0d, 'm');

        for (MathEquation eachEquation: equations) {
            eachEquation.execute();
            System.out.println("result = " + eachEquation.getResults());
        }

        double leftDouble = 9.0d;
        double rightDouble = 40d;

        int leftInt = 9;
        int rightInt = 4;
        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        
        equationOverload.execute(leftInt, rightInt);
        equationOverload.execute((double)leftInt, rightInt);
    }


}
