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
public class operationFormingWords {
    public String []arrayWords={"flores","cafecito","rolo","hola"};
    char disformWord[];
    public int temPosition;
    public int positionRandom(){
        int random=((int)(Math.random()*3));
        
        return random;
    }
    public char [] words(){
            temPosition=positionRandom();
            disformWord= new char[arrayWords[temPosition].length()];
            for (int i = 0; i < arrayWords[temPosition].length(); i++) {
                disformWord[i]=arrayWords[temPosition].charAt (i);
            }
            return disformWord;
            
    }
    
    public char [] words2(String currentWord){
            disformWord= new char[currentWord.length()];
            for (int i = 0; i < currentWord.length(); i++) {
                disformWord[i]=currentWord.charAt (i);
            }
            return disformWord;
            
    }
    public String wordsOriginal(char[]arrayOfword){
        String origalWord="";
        for (int i = 0; i < arrayOfword.length; i++) {
            origalWord+=arrayOfword[i];
        }
        return origalWord;
    }
    public String disformArrayWord(char[] arrayWithCharter){
        
        int randomTemp=((int)(Math.random()*arrayWithCharter.length-1));
        for (int i = 0; i < arrayWithCharter.length; i++) {
            char temp=arrayWithCharter[i];
            arrayWithCharter[i]=arrayWithCharter[randomTemp];
            arrayWithCharter[randomTemp]=temp;
        }
        String finalWord="";
        for (char c : arrayWithCharter) {
            finalWord+=c+"  ";
        }
        return finalWord;
    }
     
    
}
