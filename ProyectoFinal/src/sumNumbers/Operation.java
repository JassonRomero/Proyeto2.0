/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumNumbers;

/**
 *
 * @author Jasson
 */
public interface Operation {

    public int[] numRandom();

    public void helpMe();

    public boolean addingNumbers(int[] arraysNumbers, int numberUser, int attempts);

    public int attempts();

    public int correctAttempts();

    public int failedatttempts();
}
