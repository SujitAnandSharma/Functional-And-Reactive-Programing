package com.quppler.functional.composition;

public class FunctionalComposition {

    public static void main(String[] args){

        Function<Square,Integer> fun1 = s -> s.getArea();
        Function<Integer,Double> fun2 = area -> Math.sqrt(area);

        Function<Square,Double> getSide = fun2.compose(fun1);

        Square sq = new Square();
        sq.setArea(100);

        Double side = getSide.apply(sq);
        System.out.println(side);
    }
}
