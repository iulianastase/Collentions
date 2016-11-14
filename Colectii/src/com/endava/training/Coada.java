package com.endava.training;

import org.w3c.dom.NodeList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by inastase on 10/31/2016.
 */
public class Coada<T>{
    //adaugare, eliminare, interogarea el curent(peek), toString, queue si dequeue, accesarea elementului de pe pozitia i
    private Nod head;

    public Coada() {
    }

    public Coada(Nod head) {
        this.head = head;
    }

    public void add(T nou) {
        if(head == null){
            head = new Nod<T>(nou, head);
        }
        else{
            Nod<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Nod<T>(nou, null);
        }
    }

    public void remove() {
        this.head = this.head.next;
    }

    public T peek() {
        if(head == null)throw new RuntimeException("Can't peek");
        if(head.getElement() == null){
            return null;
        }
        return (T) head.getElement();
    }

    public T get(int i){
        int nr = 0;
        Nod<T> temp = head;

        while (temp != null){
            if(nr == i){
                return temp.getElement();
            }
            nr ++;
            temp = temp.next;
        }
        return null;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Nod<T> temp = head;
        while(temp != null){
            sb.append(temp.getElement().toString() + " ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
