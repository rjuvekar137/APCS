package com.richa;

public class LNDS {

    final int SEQ_SIZE = 25;    //defines maximum number of slots in sequence
    int[] sequence = null;      //array to store the sequence
    int seqCounter = 0;         //number of slots filled currently

    //default constructor
    LNDS() {
        //initialize the sequence
        sequence = new int[SEQ_SIZE];;
        seqCounter = 0;
    }

    //add a new number to the sequence
    public boolean addNumber(int userNumInput) {

        //if array is full then don't add more
        if ( seqCounter == SEQ_SIZE ) {
            return false;
        }

        //otherwise add the number to end of sequence
        sequence[seqCounter] = userNumInput;
        seqCounter++;

        return true;
    }

    //get the current sequence as a string
    public String getSequence() {

        String currentSequence = ""; //start with empty string

        // loop through the sequence
        for (int i = 0; i < seqCounter; i++) {
            if ( i > 0 ) {
                currentSequence += ", "; //add comma to separate except for first
            }
            currentSequence += sequence[i]; //add number into string
        }

        return currentSequence;
    }

    //clear out the current sequence
    public void clearSequence() {

        seqCounter = 0; //set the counter to zero
    }

    //get the longest non-decreasing sequence as a string to display
    public String getLongestNonDecreasingSequence() {

        //Create a table to collect sub sequences
        int[][] subSequences = new int[SEQ_SIZE][SEQ_SIZE];
        int subSequencesCounter = 0;
        for (int i = 0; i < SEQ_SIZE; i++) {
            for (int j = 0; j < SEQ_SIZE; j++) {
                subSequences[i][j] = -1;
            }
        }

        //find all the sub sequences and store in the table
        boolean sequenceStarted = false;
        int addedCounter = 0;
        for (int i = 0; i < seqCounter; i++) {
            if (sequenceStarted) {
                if (sequence[i] >= sequence[i-1]) {
                    subSequences[subSequencesCounter][addedCounter] = sequence[i];
                    addedCounter++;
                } else {
                    subSequencesCounter++;
                    addedCounter = 0;
                    subSequences[subSequencesCounter][addedCounter] = sequence[i];
                    addedCounter++;
                }
            } else {
                subSequences[subSequencesCounter][addedCounter] = sequence[i];
                sequenceStarted = true;
                addedCounter++;
            }
        }

        //find the longest length of the sub sequences
        int maxLength = 0;
        for (int i = 0; i < SEQ_SIZE; i++) {
            int length = 0;
            for (int j = 0; j < SEQ_SIZE; j++) {
                if (subSequences[i][j] >= 0) {
                    length++;
                }
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }

        //add all sub sequences matching maxLength to a string
        String lndsSequence = "";
        for (int i = 0; i < SEQ_SIZE; i++) {
            int length = 0;
            for (int j = 0; j < SEQ_SIZE; j++) {
                if (subSequences[i][j] >= 0) {
                    length++;
                }
            }
            if (length == maxLength) {
                if ( !lndsSequence.isEmpty() ) {
                    lndsSequence += " and ";
                }
                for (int j = 0; j < SEQ_SIZE; j++) {
                    if (subSequences[i][j] >= 0) {
                        if ( j > 0 ) {
                            lndsSequence += ", ";
                        }
                        lndsSequence += subSequences[i][j];
                    }
                }
            }
        }


        return lndsSequence; // return the string containing longest sequences
    }
}
