/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formingWords;

import java.util.Arrays;

/**
 *
 * @author Andrew
 */
public class operationFormingWords implements operation {

    public String[] arrayWords = {"flores", "cafecito", "rolo", "hola"};
    char[] arrayOfWord;
    public int temPosition;

    @Override
    public int positionRandom() {
        int random = ((int) (Math.random() * 4));
        return random;
    }

    @Override
    public char[] words() {
        temPosition = positionRandom();
        arrayOfWord = new char[arrayWords[temPosition].length()];
        for (int i = 0; i < arrayWords[temPosition].length(); i++) {
            arrayOfWord[i] = arrayWords[temPosition].charAt(i);
        }
        return arrayOfWord;

    }

    @Override
    public char[] words2(String currentWord) {
        arrayOfWord = new char[currentWord.length()];
        for (int i = 0; i < currentWord.length(); i++) {
            arrayOfWord[i] = currentWord.charAt(i);
        }
        return arrayOfWord;
    }

    @Override
    public String wordsOriginal(char[] arrayOfword) {
        String origalWord = "";
        for (int i = 0; i < arrayOfword.length; i++) {
            origalWord += arrayOfword[i];
        }
        return origalWord;
    }

    @Override
    public String disformArrayWord(char[] arrayWithCharter) {
        Arrays.sort(arrayWithCharter);
        String finalWord = "";
        for (char c : arrayWithCharter) {
            finalWord += c + "  ";
        }
        return finalWord;
    }

}
