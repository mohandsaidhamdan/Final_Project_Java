/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author mohand
 */

    
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameAddMember extends JFrame {
    private JTextField EdtName;
    private JTextField EdtNumber;
    private JComboBox<String> roleComboBox;
    private JButton loginButton;

    public JFrameAddMember() {
        setTitle("Login Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel usernameLabel = new JLabel("name:");
        mainPanel.add(usernameLabel);

        EdtName = new JTextField();
        mainPanel.add(EdtName);

        JLabel passwordLabel = new JLabel("number:");
        mainPanel.add(passwordLabel);

        EdtNumber = new JPasswordField();
        mainPanel.add(EdtNumber);

        JLabel roleLabel = new JLabel("type Acount:");
        mainPanel.add(roleLabel);

        String[] roles = {"SILVER", "GOLDEN", "BRONZE", "MASSEY"};
        roleComboBox = new JComboBox<>(roles);
        mainPanel.add(roleComboBox);

        loginButton = new JButton("add");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = EdtName.getText();
                String number = EdtNumber.getText();
                String type = (String) roleComboBox.getSelectedItem();
        
                
                Member m = new Member();
                m.addMember(name, number, type);
  

    
            }
        });
        mainPanel.add(loginButton);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

                }
}


