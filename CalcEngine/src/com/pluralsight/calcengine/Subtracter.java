package com.pluralsight.calcengine;

public class Subtracter extends CalculateBase implements MathProcessing {

    public Subtracter(){}

    public Subtracter(double leftVal, double rigthVal){
        super(leftVal, rigthVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "subtract";
    }

    @Override
    public double doCalculation(double leftVal, double rigthVal) {
        setLeftVal(leftVal);
        setRightVal(rigthVal);
        calculate();
        return getResult();
    }
}
