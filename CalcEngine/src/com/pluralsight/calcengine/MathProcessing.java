package com.pluralsight.calcengine;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord();
    double doCalculation(double leftVal, double rigthVal);
}
