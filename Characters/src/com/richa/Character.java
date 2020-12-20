package com.richa;

/**
 * @author : rjuvekar
 * @created : 12/14/20, Monday
 **/
public class Character {

    int numChar;
    int numWords;
    String[] words = new String [100];
    int wordCounter = 0;
    int[] wordCount = new int[100];
    int startCounter = 0;
    int endCounter = 0;

    Character() {
        for (int i = 0; i < words.length; i++) {
            words[i] = null;
        }
        for (int i = 0; i < wordCount.length; i++) {
            wordCount[i] = 0;
        }
    }

    void getWord(String userInput) throws Exception {

        // skip starting spaces and punctuations
        for (int i = startCounter; i < userInput.length(); i++) {
            if (!java.lang.Character.isAlphabetic(userInput.charAt(i)) &&
                    !java.lang.Character.isDigit(userInput.charAt(i)) &&
                    userInput.charAt(i) != '-') {
                startCounter++;
                endCounter++;
            } else {
                break;
            }
        }

        // moves endCounter to end of the word
        for (int i = endCounter; i < userInput.length(); i++) {
            if (java.lang.Character.isAlphabetic(userInput.charAt(i)) ||
                    java.lang.Character.isDigit(userInput.charAt(i)) ||
                    userInput.charAt(i) == '-') {
                endCounter++;
            } else {
                break;
            }
        }

        // extract the word
        String word = userInput.substring(startCounter, endCounter);
        startCounter = endCounter;

        // see if the word is already there
        boolean wordFound = false;
        for (int i = 0; i < wordCounter; i++) {
            if (word.equalsIgnoreCase(words[i])) {
                wordCount[i]++;
                wordFound = true;
                break;
            }
        }

        if (!wordFound) {
            words[wordCounter] = word;
            wordCount[wordCounter]++;
            wordCounter++;
        }
    }

    void parse (String userInput) throws Exception{
        do {
            getWord(userInput);
        } while(endCounter < userInput.length());

    }
}
