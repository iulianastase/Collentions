package com.endava.training;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by inastase on 10/31/2016.
 */
public class Graf {
    Coada<Integer> n[];
    private int noduri;
    private int muchii;

    public Graf() throws IOException {

        Scanner scanner = new Scanner(new File("in.txt"));
        this.noduri = scanner.nextInt();
        this.muchii = scanner.nextInt();
        System.out.println("Numar Noduri: " + this.noduri + " Numar Muchii: " + this.muchii);
        n = new Coada[this.noduri];
        for (int i = 0; i < this.muchii; i++) {
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();

            if (n[x-1] == null) {
                n[x-1] = new Coada<>();
            }
            n[x-1].add(y);
            if (n[y-1] == null) {
                n[y-1] = new Coada<>();
            }
            n[y-1].add(x);
        }
    }

    public void print() {
        int i=1;
        for(Coada ad : n){
            System.out.print(i + ": ");
            i++;
            System.out.println(ad.toString());
        }
    }
}
