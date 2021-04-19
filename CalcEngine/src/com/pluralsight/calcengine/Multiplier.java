package com.pluralsight.calcengine;

public class Multiplier extends CalculateBase implements MathProcessing {

    public Multiplier(){}

    public Multiplier(double leftVal, double rigthVal){
        super(leftVal, rigthVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "multiply";
    }

    @Override
    public double doCalculation(double leftVal, double rigthVal) {
        setLeftVal(leftVal);
        setRightVal(rigthVal);
        calculate();
        return getResult();
    }
}
