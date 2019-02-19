package com.javaTraining;

class MathLibraryExample {

    /** Constructor. */
    protected MathLibraryExample() {
    }

    /**
      * Sole entry point to the class and application.
      * @param args Array of String arguments.
      */

    public static void main(final String[] args) {

        MathExample obj = new MathExample();
        obj.prt();
        obj.printMathConstants();
        obj.doComparisonOperators();
        obj.doTrigonometricMethods();
        obj.doExponentialLogarithmicMethods();
        obj.doPower();
        obj.doSquareRoot();
        obj.doRandomNumbers();
    }

}

