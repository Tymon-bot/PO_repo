package com.company;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        // b
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n");
        Integer n = myObj.nextInt();

        System.out.println(n);

        int i = 1;
        int wynik = 1;

        while (i <= n) {

            wynik *= myObj.nextInt();
            i++;


        }
        System.out.println(wynik);
    }
}