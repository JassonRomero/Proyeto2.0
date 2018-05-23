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
public class OperationSumNumbers implements Operation {

    int[] arraysNumberRandom = new int[3];
    int sumNumber = 0;

    @Override
    public int[] numRandom() {
        /*Numbers are randomly generated between 1 and 9,
            both numbers are added together and both numbers and their sum are returned in a arrays*/
        try {
            int numberRandom1 = (int) (Math.random() * 9) + 1;
            int numberRandom2 = (int) (Math.random() * 9) + 1;
            sumNumber = numberRandom1 + numberRandom2;
            arraysNumberRandom[0] = numberRandom1;
            arraysNumberRandom[1] = numberRandom2;
            arraysNumberRandom[2] = sumNumber;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }
        return arraysNumberRandom;
    }

    @Override
    public void helpMe() {
        /*Generates some help options for the user*/
        try {
            JOptionPane.showMessageDialog(null, "1. To play Adding Numbers you must perform each operation that is presented on the screen"
                    + "\n"
                    + "2. The sums of numbers will be between 1 and 9"
                    + "\n"
                    + "3. If you are not sure of the result of any sum and want other numbers press the button change numbers"
                    + "\n"
                    + "4. When you complete a total of 15 sums correctly the game will end"
                    + " or if you want to finish press the \"end game\" button");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }

    }

    @Override
    public boolean addingNumbers(int[] arraysNumbers, int numberUser, int attempts) {
        int result = 0;
        /*compares the number entered by the user with the number that is hidden to validate if they are equal*/
        try {

            if (attempts % 2 == 0) {
                if (arraysNumbers[1] == numberUser) {
                    result = 1;
                } else {
                    result = 0;
                }
            } else {
                if (arraysNumbers[0] == numberUser) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error has occured!");
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

    /*attempts, correct attempts and failed attempts are initialized*/
    @Override
    public int attempts() {
        int attempts = 0;
        return attempts;
    }

    @Override
    public int correctAttempts() {
        int correctAttempts = 0;
        return correctAttempts;
    }

    @Override
    public int failedatttempts() {
        int failedAttempts = 0;
        return failedAttempts;
    }

}
