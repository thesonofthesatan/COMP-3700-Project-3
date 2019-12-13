import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class user {
   public static void main(String[] args) {
      int choice;
      Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Welcome User!");
                   
      f.setSize(300, 600);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelFour = new JLabel("1) Edit Password ");
      labelFour.setBounds(50, 200, 200, 30);
      
      JLabel labelTen = new JLabel("                     Pick an option: ");
      labelTen.setBounds(50, 250, 200, 30);
      
      JLabel labelEleven = new JLabel("                You have to chose 1 ");
      labelEleven.setBounds(50, 300, 200, 30);
      
      JTextField textOne = new JTextField();
      textOne.setBounds(50, 350, 200, 30);
      textOne.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String input = textOne.getText();
               labelFour.setText("Pick an option: " + input); 
               
               int inp = Integer.parseInt(input);
               
               //AFTER CHOSING INPUT OPTION
               
               if (inp == 1) {
                  JFrame n = new JFrame("Edit Password!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Config-=-=-=-=-=-=-=-=-=-=-=-=-
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("User Name: "); //Name of the product
                  nlabelOne.setBounds(50, 50, 200, 30);  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 100, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                           System.out.println("Name = " + input);
                        }
                     });
                     
                  JLabel nlabelTwo = new JLabel("Old Password: "); //Cost of Product
                  nlabelTwo.setBounds(50, 150, 200, 30);  
                  JTextField ntextTwo = new JTextField();
                  ntextTwo.setBounds(50, 200, 200, 30);
                  ntextTwo.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextTwo.getText();
                           System.out.println("Cost = " + input);
                        }
                     });
                     
                  JLabel nlabelThree = new JLabel("New Password: "); //Stock of Product
                  nlabelThree.setBounds(50, 250, 200, 30);  
                  JTextField ntextThree = new JTextField();
                  ntextThree.setBounds(50, 300, 200, 30);
                  ntextThree.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextThree.getText();
                           System.out.println("Stock = " + input);
                        }
                     });
               
                   
                  n.setSize(300, 500);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(ntextOne);
                  n.add(nlabelTwo);
                  n.add(ntextTwo);
                  n.add(nlabelThree);
                  n.add(ntextThree);
                  //n.add(nlabelFour);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
                              
            }
         });
   

      f.add(labelFour);

      //--------------------------
      
      f.add(textOne);
      
      f.setLayout(null);
      f.setVisible(true);
   }
   
}