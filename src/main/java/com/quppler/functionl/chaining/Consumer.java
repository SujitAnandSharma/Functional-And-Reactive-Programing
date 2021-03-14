package com.quppler.functionl.chaining;
import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    /**
    *Using Default method implementation in functional interface to achieve method chaining
    **/
    default Consumer<T> thenAccept(Consumer<T> next){

        Objects.requireNonNull(next);
        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}

