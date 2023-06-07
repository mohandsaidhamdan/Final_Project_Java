/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalproject;

/**
 *
 * @author mohand
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.SwingUtilities;

public class FinalProject extends JPanel{



    public static void main(String[] args) {
      
        
        /*     SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameAddMember loginScreen = new JFrameAddMember();
                loginScreen.setVisible(true);
            }
        });*/
        
        Scanner kb = new Scanner(System.in);      
      

         int check = 0;
                 Member m = new Member();  
        while(check != 8){
              System.out.println("1.Add Member");
         System.out.println("2. search Member");
          System.out.println("3.update Member");
           System.out.println("4.delete Member");
            System.out.println("5.Add product");
            System.out.println("6.buy product");
             System.out.println("7.View the purchased products");
                  System.out.println("8.Exit");
               check = kb.nextInt();
           
             switch(check){
                 case 1 -> {
                     System.out.println("Enter Name : ");
                     String name = kb.next();
                     System.out.println("Enter Number : ");
                     String number = kb.next();
                     System.out.println("Enter type : ");
                     String type = kb.next();
                     m.addMember(name, number, type);
                }
                      case 2 -> {
                          System.out.println("Enter Numbers : ");
                          kb.nextLine();
                          String numbers = kb.next();
                       
                          m.searchMember( numbers);
                }
                      case 3 -> {
                          System.out.println("Enter Numbers : ");
                      
                          String numbers = kb.next();
                           System.out.println("Enter Name : ");
                     String name = kb.next();
                          m.updateDataMember(numbers, name);
                }
                      
                      case 4 -> {
                             System.out.println("Enter Numbers : ");                      
                          String numbers = kb.next();
                          m.deleteDataMember(numbers);
                }
                       case 5 -> {
                     System.out.println("Enter id : ");
                     String id = kb.next();
                     System.out.println("Enter Name : ");
                     String name = kb.next();
                     System.out.println("Enter price : ");
                     int price = kb.nextInt();
                     System.out.println("Enter description : ");
                     String description = kb.next();
                     m.addProduct(id, name, price, description);
                }
                       case 6 ->{
                           m.listProduct();
                              System.out.println("Enter id product : ");
                     String id = kb.next();
                       System.out.println("Enter number Phone : ");
                     String number = kb.next();
                     m.BuyProduct(id , number);
                     
                       }
                         case 7 ->{
                     System.out.println("Enter number Phone : ");
                     String number = kb.next();
                          m.listProducts(number);
                           
                           //      System.out.println(p.ArrayListBroduct.size());
                             //    System.out.println(p.arrayList.size());
                       }
                     
             }
        }
       
        
     
    }
}
