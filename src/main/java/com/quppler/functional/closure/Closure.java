package com.quppler.functional.closure;

public class Closure {

    public static void main(String args[]){

        int val = 111;
        Job lambda = () -> {
            System.out.println("Closure Example");
            System.out.println(val);
        };

        printValueInClosureScope(lambda);
    }

    /**Closure saves the member variable value in its scope and on passing
     * lambda its also passes variable value
     * @param lambda
     */
    private static void printValueInClosureScope(Job lambda) {
        lambda.dotask();
    }
}
