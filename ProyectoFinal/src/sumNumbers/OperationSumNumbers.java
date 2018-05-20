/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumNumbers;

import javax.swing.JOptionPane;
/**
 *
 * @author Jasson
 */
public class OperationSumNumbers implements Operation{
    int[]arraysNumberRandom=new int[3];
    int sumNumber=0;
    @Override
    public int[] numRandom() {
        int numberRandom1 = (int)(Math.random()*9)+1;
        int numberRandom2 = (int)(Math.random()*9)+1;
        sumNumber=numberRandom1+numberRandom2;
        
        arraysNumberRandom[0]=numberRandom1;
        arraysNumberRandom[1]=numberRandom2;
        arraysNumberRandom[2]=sumNumber;
        
        
        return arraysNumberRandom;
    }

    @Override
    public void helpMe() {
        JOptionPane.showMessageDialog(null,"Para jugar a Sumando Numeros debe realizar cada operacion que se le presenta en pantalla"
                                            +"\n"
                                            +"Se le presentaran sumas de numeros aleatoriamente entre 1 y 9"
                                            +"\n"
                                            +"Cuando complete un total de 15 sumas de forma correcta el juego terminara "
                                            + "o si desea terminar presione el boton terminar juego");
    }

    @Override
    public boolean addingNumbers(int[]arraysNumbers,int numberUser,int attempts) {

           if(attempts%2==0)
           {
                if(arraysNumbers[1]==numberUser)
                {
                    return true;
                }
                else
                {
                    return false;
                }
           }
           else
           {


                if(arraysNumbers[0]==numberUser)
                {
                    return true;
                }
                else
                {
                    return false;
                } 

            }    
    }
    
    @Override
    public int attempts() {
       int attempts=0;
       return attempts;
    }
    
    @Override
    public int correctAttempts() {
        int correctAttempts=0;
        return correctAttempts;
    }
    
    @Override
    public int failedatttempts() {
       int failedAttempts=0;
       return failedAttempts;
    }
  
}
