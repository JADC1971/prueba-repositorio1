package com.pluralsight.calcengine;

public class Divider extends CalculateBase implements MathProcessing {

    public Divider(){}

    public Divider(double leftVal, double rigthVal){
        super(leftVal, rigthVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public double doCalculation(double leftVal, double rigthVal) {
        setLeftVal(leftVal);
        setRightVal(rigthVal);
        calculate();
        return getResult();
    }
}
