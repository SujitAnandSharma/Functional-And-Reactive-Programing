package com.quppler.functionl.chaining;

public class Chaining {

    public static void main(String[] args){

        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

        c1.accept("Quppler Programing");
        c2.accept("Quppler Programing");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
        //Without chaining operation
        c3.accept("Quppler Programing");

        //Calling c1 and c2 through Functional Chaining
        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("Quppler Programing by method chaining");
    }
}

