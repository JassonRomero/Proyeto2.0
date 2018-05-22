/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import User.User;
import User.UserImplement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew
 */
public class mainGUI extends javax.swing.JFrame {

    /**
     * Creates new form mainGUI
     */
    UserImplement UI = new UserImplement();

    public mainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        userTextField = new javax.swing.JTextField();
        enterGameButton = new javax.swing.JButton();
        chooseGamePanel = new javax.swing.JPanel();
        sumNumbers = new javax.swing.JButton();
        formingWords = new javax.swing.JButton();
        titleOfGameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userPanel.setBackground(new java.awt.Color(204, 204, 204));

        passwordLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        passwordLabel.setText("Password");

        userLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        userLabel.setText("User");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        enterGameButton.setBackground(new java.awt.Color(255, 255, 255));
        enterGameButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        enterGameButton.setText("Enter");
        enterGameButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enterGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(userLabel)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enterGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(enterGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addGap(37, 37, 37))))
        );

        chooseGamePanel.setBackground(new java.awt.Color(0, 0, 0));

        sumNumbers.setBackground(new java.awt.Color(255, 255, 255));
        sumNumbers.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        sumNumbers.setText("Adding Numbers");
        sumNumbers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sumNumbers.setEnabled(false);
        sumNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumNumbersActionPerformed(evt);
            }
        });

        formingWords.setBackground(new java.awt.Color(255, 255, 255));
        formingWords.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        formingWords.setText("Forming Words");
        formingWords.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        formingWords.setEnabled(false);
        formingWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formingWordsActionPerformed(evt);
            }
        });

        titleOfGameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleOfGameLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleOfGameLabel.setText("Click on the game you want to start");

        javax.swing.GroupLayout chooseGamePanelLayout = new javax.swing.GroupLayout(chooseGamePanel);
        chooseGamePanel.setLayout(chooseGamePanelLayout);
        chooseGamePanelLayout.setHorizontalGroup(
            chooseGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseGamePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sumNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formingWords, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(chooseGamePanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(titleOfGameLabel)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        chooseGamePanelLayout.setVerticalGroup(
            chooseGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseGamePanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(titleOfGameLabel)
                .addGap(18, 18, 18)
                .addGroup(chooseGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumNumbers)
                    .addComponent(formingWords))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chooseGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void enterGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterGameButtonActionPerformed
        // TODO add your handling code here:
        //valid if the field of the name and the user is empty

        String userName = userTextField.getText();
        String password = passwordTextField.getText();
        User user = new User(userName, password);
        UI.UserInsert(user);
        if (passwordTextField.getText().equals("") || userTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Insert the above data");
        } else {//If the fields are full then enable the buttons
            formingWords.setEnabled(true);//enable of the formindWord button goes to true
            sumNumbers.setEnabled(true);//enable of the sumNumber button goes to true
        }
        if (UI.validatePassword(password) == false) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect Password");
            formingWords.setEnabled(false);//enable of the formindWord button goes to true
            sumNumbers.setEnabled(false);
        } else {//If the fields are full then enable the buttons
            formingWords.setEnabled(true);//enable of the formindWord button goes to true
            sumNumbers.setEnabled(true);//enable of the sumNumber button goes to true
        }

    }//GEN-LAST:event_enterGameButtonActionPerformed

    private void sumNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumNumbersActionPerformed
        /*the link to the selected game is generated*/
        sumNumberGUI sumGUI = new sumNumberGUI();
        sumGUI.setVisible(true);
        sumGUI.setTitle("Adding Numbers");
        super.dispose();
        sumGUI.setLocationRelativeTo(null);


    }//GEN-LAST:event_sumNumbersActionPerformed

    private void formingWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formingWordsActionPerformed
        /*the link to the selected game is generated*/
        formingWordsGUI formingGUI = new formingWordsGUI();
        formingGUI.setVisible(true);
        formingGUI.setTitle("Forming Words");
        super.dispose();
        formingGUI.setLocationRelativeTo(null);
    }//GEN-LAST:event_formingWordsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chooseGamePanel;
    private javax.swing.JButton enterGameButton;
    private javax.swing.JButton formingWords;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton sumNumbers;
    private javax.swing.JLabel titleOfGameLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
