/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class UserImplement {

    private String fileName;
    private String path = "users.txt";
    private File file = new File(path);

    public void UserInsert(User user) {//method to enter the user and compare it to see if it already exists
        String ruta = "users.txt";
        File file = new File(ruta);
        boolean usearSearch = true;
        FileWriter flWriter = null;
        try {

            if (file.exists()) {
                System.out.println("The file already exists and it will be overwritten on it");
            } else {
                file.createNewFile();
                System.out.println("The file does not exist");
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter brWriter = new BufferedWriter(flWriter);
            boolean existe = searchUser(user.getUserName());
            if (existe == false) {//use a variable exists from the searchUser method
                brWriter.write(user.getUserName() + ";" + user.getPassword());//introduce a new  user with you password

                brWriter.newLine();
                

            } else {
                JOptionPane.showMessageDialog(null, "The user already exists");
                
            }
            brWriter.close();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (flWriter != null) {
                try {
                    flWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        // return usearSearch;
    }

    public User[] getUsers() {
        return null;
    }

    public boolean searchUser(String userName) {
        boolean exists = false;

        String ruta = "users.txt";
        File file = new File(ruta);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(";") != -1) {
                    if (cadena.split(";")[0].equalsIgnoreCase(userName)) {//search the user int the txt and compare
                        System.out.println("Exists");
                        exists = true;
                    }
                }
            }
        } catch (IOException e) {
        }
        return exists;
    }

    public boolean validatePassword(String password) {
        boolean existPassword = false;

        String ruta = "users.txt";
        File file = new File(ruta);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            String cadena = "";
            FileReader fileR = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileR);
            while ((cadena = buffReader.readLine()) != null) {
                if (cadena.indexOf(";") != -1) {
                    if (cadena.split(";")[1].equalsIgnoreCase(password)) {//compares the password entered as a parameter with the ones already entered in the txt
                        System.out.println("Correct");
                        existPassword = true;
                    }
                }
            }
        } catch (IOException e) {
        }
        return existPassword;

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
