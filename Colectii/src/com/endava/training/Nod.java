package com.endava.training;

/**
 * Created by inastase on 10/31/2016.
 */

public class Nod<T> {
    private T element;
    public Nod<T> next;


    public Nod() {
    }

    public Nod(T element, Nod<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

}
