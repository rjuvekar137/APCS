package com.richa;

public class Symbols {

    final char SYMBOL = '&';

    public void printSymbol(int n, int i) {

        for (int j = 0; j < i; j++) {

            System.out.print(SYMBOL);

        }

        System.out.println();

        if (n == i) {

            return;

        }

        printSymbol(n, i+1);

    }

}
