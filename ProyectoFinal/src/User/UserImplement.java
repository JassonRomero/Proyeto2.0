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

    public /*boolean*/ void UserInsert(User user) {
        String ruta = "users.txt";
        File file = new File(ruta);
        boolean usearSearch = true;
        FileWriter flWriter = null;
        try {

            if (file.exists()) {
                System.out.println("Ya existe el archivo y se sobreescribira sobre el mismo");
            } else {
                file.createNewFile();
                System.out.println("no existe el archivo");
            }

            flWriter = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter brWriter = new BufferedWriter(flWriter);
            boolean existe = searchUser(user.getUserName());
            if (existe == false) {
                brWriter.write(user.getUserName() + ";" + user.getPassword());

                brWriter.newLine();
                // usearSearch= true;

            } else {
                JOptionPane.showMessageDialog(null, "the user already exists");
                // usearSearch=false;
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
        boolean existe = false;

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
                    if (cadena.split(";")[0].equalsIgnoreCase(userName)) {
                        System.out.println("Exists");
                        existe = true;
                    }
                }
            }
        } catch (IOException e) {
        }
        return existe;
    }

    public boolean validatePassword( String password) {
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
                    if (cadena.split(";")[1].equalsIgnoreCase(password)) {
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
