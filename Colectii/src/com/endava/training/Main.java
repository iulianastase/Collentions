package com.endava.training;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Coada c = new Coada();
        c.add(1);
        c.add(3);
        c.add(6);
        c.add(10);

        System.out.println(c.toString());
        System.out.println(c.get(2));
        c.remove();
        System.out.println(c.toString());

        Graf graf = new Graf();
        graf.print();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Key:");
        String myKey = keyboard.nextLine();

        criptXOR(myKey);
    }

    public static void criptXOR(String key){
        BufferedReader strb = null;
        int bufferSize = 8 * 1024;

        ArrayList xorString = new ArrayList<Integer>();
        try {
            strb = new BufferedReader(new FileReader("date.txt"),bufferSize);
            String linie = strb.readLine();
            while(strb.readLine() != null){
                for( int i = 0; i < linie.length(); i++){
                    char chrXor = (char) (linie.charAt(i) ^ key.charAt(i % key.length()));
                    xorString.add(chrXor);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(xorString);

    }
}
