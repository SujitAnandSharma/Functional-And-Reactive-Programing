package com.quppler.reactive.observerAndObservable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableCreate;

/**
 * Observable and Observer example in rx java
 * Creating Observable with  methods onNext->Provides data, onComplete->Complete signal, onError-> Error Signal
 * Creating Observer with provided implementation of Observable methods to process data on receiving.
 */
public class ObservableAndObserver {

    public static void main(String[] args) {
        Observable<Integer> source = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> observableEmitter) throws Exception {
                try {
                    observableEmitter.onNext(10);
                    observableEmitter.onNext(30);
                    observableEmitter.onComplete();
                } catch (Throwable t) {
                    observableEmitter.onError(t);
                }
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {
                System.out.println("Subscribed ");
            }

            @Override
            public void onNext(@NonNull Integer x) {
                System.out.println("On Next " + x);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed .");
            }
        };

        source.subscribe(observer);
    }

}
