package com.richa;

public class MagicSquare {

    int dimension = 0;
    int[][] magicSquare = null;

    MagicSquare(int d) {

        dimension = d;
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

    public int isMagic() {
        int constant = -1;

        // compare all the rows
        for (int i = 0; i < dimension; i++) {
            int sumRow = 0;
            for (int j = 0; j < dimension; j++) {
                sumRow += magicSquare[i][j];
            }
            if (constant == -1) {
                constant = sumRow;
            } else {
                if (sumRow != constant){
                    return 0;
                }
            }
        }
        // compare all the columns
        for (int i = 0; i < dimension; i++) {
            int sumColumns = 0;
            for (int j = 0; j < dimension; j++) {
                sumColumns += magicSquare[j][i];
            }
            if (sumColumns != constant){
                return 0;
            }
        }
        // compare the diagonals
        int sumDiag1 = 0;
        for (int i = 0; i < dimension; i++) {
            sumDiag1 += magicSquare[i][i];
        }
        if (sumDiag1 != constant){
            return 0;
        }
        int sumDiag2 = 0;
        for (int i = 0; i < dimension; i++) {
            sumDiag2 += magicSquare[i][dimension - i - 1];
        }
        if (sumDiag2 != constant){
            return 0;
        }

        // all conditions for a magic square are met
        return constant;
    }

    // prints content of magic square
    public void printMagicSquare() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // if user wants square filled, solves magic square
    public void fillMagicSquare(int startNum) {

        int i = 0, j = (dimension - 1)/2;
        int current = startNum;
        magicSquare[i][j] = current;
        int counter = 1;
        while (counter < dimension*dimension){
            current++;
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = dimension - 1;
            }
            int j2 = j + 1;
            if (j2 > dimension - 1) {
                j2 = 0;
            }
            if (magicSquare[i2][j2] != 0) {
                i2 = i + 1;
                j2 = j;
            }
            magicSquare[i2][j2] = current;
            i = i2;
            j = j2;
            counter++;
        }

    }



}

