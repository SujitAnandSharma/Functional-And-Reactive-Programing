package com.quppler.functional.currying;

import java.util.function.Function;
/**
 * Curring restructure the multi parameter function into multiple function having
 * single parameter each.
 */
public class Currying {

    public static  void main(String[] args){

//        Function<Integer, Function<Integer,Integer>> cur = u-> {
//            return v -> v+u;
//        };

        Function<Integer, Function<Integer,Integer>> cur = u-> v-> v+u;

        Function<Integer,Integer> func2 = cur.apply(10);

        Integer sum = func2.apply(20);

        //Integer sum = cur.apply(10).apply(20);

        System.out.println("Sum of passed parameters " +sum);


    }
}
