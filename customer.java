import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class customer {
   public static void main(String[] args) {
      int choice;
      Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Welcome Cashier!");
                   
      f.setSize(300, 600);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelFour = new JLabel("1) Add a new purchase ");
      labelFour.setBounds(50, 200, 200, 30);
      
      JLabel labelFive = new JLabel("2)  View my purchase history ");
      labelFive.setBounds(50, 250, 200, 30);
      
      JLabel labelSix = new JLabel("3)  Search for product ");
      labelSix.setBounds(50, 300, 200, 30);
      
      JLabel labelTen = new JLabel("                     Pick an option: ");
      labelTen.setBounds(50, 350, 200, 30);
      
      JLabel labelEleven = new JLabel("                Pick between 1 to 3 ");
      labelEleven.setBounds(50, 400, 200, 30);
      
      JTextField textOne = new JTextField();
      textOne.setBounds(50, 450, 200, 30);
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
                  JFrame n = new JFrame("Add Product!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Config-=-=-=-=-=-=-=-=-=-=-=-=-
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Name of Product: "); //Name of the product
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
                     
                  JLabel nlabelTwo = new JLabel("Number of product: "); //Cost of Product
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
                     
                  JLabel nlabelThree = new JLabel("Color: "); //Stock of Product
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
               
               
               //IF INPUT = 2
               
               if (inp == 2) {
                  JFrame n = new JFrame("View Purchase History!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Adding User-=-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Enter date of purchase: "); //Name of the User
                  nlabelOne.setBounds(50, 50, 200, 30);  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 100, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                        }
                     });
                     
                  JLabel nlabelTwo = new JLabel("List: "); //User contact info
                                 
                   
                  n.setSize(300, 500);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(ntextOne);
                  n.add(nlabelTwo);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
               
               if (inp == 3) {
                  JFrame n = new JFrame("Search Product!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Adding User-=-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Name of purchase: "); //Name of the User
                  nlabelOne.setBounds(50, 50, 200, 30);  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 100, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                        }
                     });
                     
                  JLabel nlabelTwo = new JLabel("Cost of product: "); //User contact info
                  nlabelTwo.setBounds(50, 150, 200, 30);  
                  JTextField ntextTwo = new JTextField();
                  ntextTwo.setBounds(50, 200, 200, 30);
                  ntextTwo.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextTwo.getText();
                        }
                     });
                     
                  JLabel nlabelThree = new JLabel("Color of product: "); //User Address
                  nlabelThree.setBounds(50, 250, 200, 30);  
                  JTextField ntextThree = new JTextField();
                  ntextThree.setBounds(50, 300, 200, 30);
                  ntextThree.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextThree.getText();
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
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }

            
            }
         });
   
       
      
   //   f.add(labelOne);
   //   f.add(labelTwo);
   //   f.add(labelThree);
      f.add(labelFour);
      f.add(labelFive);
      f.add(labelSix);
    //  f.add(labelTen);
    //  f.add(labelEleven);
      
      //--------------------------
      
      f.add(textOne);
      
      f.setLayout(null);
      f.setVisible(true);
   }
   
}