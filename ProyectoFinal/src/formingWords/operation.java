/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formingWords;

/**
 *
 * @author Andrew
 */
public interface operation {

    public int positionRandom();

    public char[] words();

    public char[] words2(String currentWord);

    public String wordsOriginal(char[] arrayOfword);

    public String disformArrayWord(char[] arrayWithCharter);

}
