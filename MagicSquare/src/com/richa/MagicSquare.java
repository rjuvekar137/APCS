package com.richa;

public class MagicSquare {

    int dimensions = 0;
    int[][] magicSquare = null;

    MagicSquare(int d) {

        dimensions = d;
        magicSquare = new int[d][d];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                magicSquare[i][j] = 0;
            }
        }

    }

    public void addNumber(int i, int j, int number) {
        magicSquare[i][j] = number;
    }

    public boolean isMagic

}

