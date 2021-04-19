package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();

        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);

        Adder adder = new Adder();
        doCalculation(adder, 25.0d, 92.0d);

        Multiplier multiplier = new Multiplier();
        doCalculation(multiplier, 3.0d, 20.0d);

        Subtracter subtracter = new Subtracter();
        doCalculation(subtracter, 50.0d, 30.0d);

        performMoreCalculations();

        executeInteractively();
    }

    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts){
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightval = Double.parseDouble(parts[2]);
        CalculateBase calculation = createCalculation(operation, leftVal, rightval);
        calculation.calculate();
        System.out.println("Resultado ejecucion interactiva: " + calculation.getResult());
    }

    private static CalculateBase createCalculation(MathOperation operation, double letfVal, double rightVal){
        CalculateBase calculation = null;
        switch (operation){
            case ADD:
                calculation = new Adder(letfVal, rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtracter(letfVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(letfVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(letfVal, rightVal);
                break;
        }
        return calculation;
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations = {
                new Divider(100, 50),
                new Adder(25,92),
                new Subtracter(225, 17),
                new Multiplier(11, 3)
        };

        for (CalculateBase calculation : calculations){
            calculation.calculate();
            System.out.println("Resultado array de calculo base: " + calculation.getResult());
        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result = " + calculation.getResult());

    }

    private static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s',225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations){
            equation.execute();
            System.out.println("result = " + equation.result);
        }
        System.out.println("La media de resultados es: " + MathEquation.mediaSumaResultados());
    }
}
