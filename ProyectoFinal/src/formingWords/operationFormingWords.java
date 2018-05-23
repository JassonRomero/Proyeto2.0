/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formingWords;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew
 */
public class operationFormingWords implements operation {

    public String[] arrayWords = {"cath","while","computer","keyword","program","java","compiler",
        "netbeans","eclipse","mouse","bugs","projects","github"};//arrays with Strings
    char[] arrayOfWord;//define global arrays of char  
    public int temPosition;//a position global use for the positionRandom()

    @Override
    public int positionRandom() {
        int random = ((int) (Math.random() * arrayWords.length-1)+1);//define a random number with lengt more one for not getout the number zero
        return random;
    }

    @Override
    public char[] words() {
        try {
            temPosition = positionRandom();//tempPosition call the method positionRandom 
            arrayOfWord = new char[arrayWords[temPosition].length()];//define a arrayOfword with the length of the word located inta rrayWords[temPosition
            for (int i = 0; i < arrayWords[temPosition].length(); i++) {
                arrayOfWord[i] = arrayWords[temPosition].charAt(i);//in each space of the array,it defines with the char of arrayWords[temPosition] with charAt
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }

        return arrayOfWord;

    }

    @Override
    public char[] words2(String currentWord) {
        try {
            arrayOfWord = new char[currentWord.length()];//define a arrayOfword with the length of the String passed by paremeters
            for (int i = 0; i < currentWord.length(); i++) {
                arrayOfWord[i] = currentWord.charAt(i);//in each space of the array,it defines with the char of arrayWords[temPosition] with charAt
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }

        return arrayOfWord;
    }

    @Override
    public String wordsOriginal(char[] arrayOfword) {//recived as parameter the arrays with char of the word
        String origalWord = "";//define a String for save the word orignal
        try {
            for (int i = 0; i < arrayOfword.length; i++) {
                origalWord += arrayOfword[i];//each charater put in the string origalWord
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }
        return origalWord;
    }

    @Override
    public String disformArrayWord(char[] arrayWithCharter) {
        String finalWord = "";//this String contein the word disformed
        try {
            Arrays.sort(arrayWithCharter);//with the method .sort order the String for the order in the alphabet
            for (char c : arrayWithCharter) {//using the cycle for each to convert the array of charter to a String
                finalWord += c + "  ";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }

        return finalWord;
    }

}
