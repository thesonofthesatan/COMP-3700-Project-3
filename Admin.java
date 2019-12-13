import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Admin {
   public static void main(String[] args) {
      int choice;
      Scanner sid = new Scanner(System.in);
      JFrame f = new JFrame("Welcome Admin!");
                   
      f.setSize(300, 600);
      f.setLocation(600, 200);
                   
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   
      f.setDefaultLookAndFeelDecorated(true);
      
      JLabel labelOne = new JLabel("1) Add Product "); // Add, delete or edit products
      labelOne.setBounds(50, 50, 200, 30);
      
      JLabel labelTwo = new JLabel("2) Add new User ");
      labelTwo.setBounds(50, 100, 200, 30);
      
      JLabel labelThree = new JLabel("3) Delete Users");
      labelThree.setBounds(50, 150, 200, 30); 
      
      JLabel labelFour = new JLabel("4) Update Product ");
      labelFour.setBounds(50, 200, 200, 30);
      
      JLabel labelFive = new JLabel("5) Update User ");
      labelFive.setBounds(50, 250, 200, 30);
      
      JLabel labelSix = new JLabel("6) Update Purchase ");
      labelSix.setBounds(50, 300, 200, 30);
      
      JLabel labelTen = new JLabel("                     Pick an option: ");
      labelTen.setBounds(50, 350, 200, 30);
      
      JLabel labelEleven = new JLabel("                Pick between 1 to 6 ");
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
                  JFrame n = new JFrame("Add System Configurations!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Config-=-=-=-=-=-=-=-=-=-=-=-=-
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Add Name of Product: "); //Name of the product
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
                     
                  JLabel nlabelTwo = new JLabel("Add Product cost: "); //Cost of Product
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
                     
                  JLabel nlabelThree = new JLabel("Add Product Stock: "); //Stock of Product
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
                  JFrame n = new JFrame("Add System Configurations!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Adding User-=-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Add Name of User: "); //Name of the User
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
                     
                  JLabel nlabelTwo = new JLabel("Add User contact number: "); //User contact info
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
                     
                  JLabel nlabelThree = new JLabel("Add User Address: "); //User Address
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
               
               
               //IF INPUT = 3 
               if (inp == 3) {
                  JFrame n = new JFrame("Add System Configurations!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Deleting User-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("Add Name of User: "); //Name of the User
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
                   
                  n.setSize(300, 500);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(ntextOne);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
               
               if (inp > 6) {
               
                  labelFour.setText("Pick an option: Wrong Input"); 
                  System.out.println("Wrong Option");
               
               }
               
               if (inp == 4) {
                  JFrame n = new JFrame("Update System Configurations!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Edit Product-=-=-=-=-=-=-=-=-=-
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("1) Change Product Name: "); 
                  nlabelOne.setBounds(50, 50, 200, 30);  
                                      
                  JLabel nlabelTwo = new JLabel("2) Change Product Price "); //User contact info
                  nlabelTwo.setBounds(50, 100, 200, 30);  
                                      
                  JLabel nlabelThree = new JLabel("3) Change Product Stock "); //User Address
                  nlabelThree.setBounds(50, 150, 200, 30);  
                                       
                  JLabel nlabelFour = new JLabel("4) Delete Product "); //User Address
                  nlabelFour.setBounds(50, 200, 200, 30);  
                  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 250, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                           int inp = Integer.parseInt(input);
                           
                           if (inp == 1) {
                              JFrame t = new JFrame("Change Name!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Old Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Product Name: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 2) {
                              JFrame t = new JFrame("Change Price!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("Product New Price: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 3) {
                              JFrame t = new JFrame("Change Stock!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Product Stock: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 4) {
                              JFrame t = new JFrame("Delete Product!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });  
                              
                              t.add(tlabelOne); 
                              
                              t.add(ttextOne);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp > 4) {
                              System.out.println("No Good");
                           }
                        }
                     });
               
                                     
                  n.setSize(300, 600);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(nlabelTwo);
                  n.add(nlabelThree);
                  n.add(nlabelFour);
                  n.add(ntextOne);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
               
               if (inp == 5) {
                  JFrame n = new JFrame("Update Customer!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Edit Customer-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("1) Change Name: "); 
                  nlabelOne.setBounds(50, 50, 200, 30);  
                                      
                  JLabel nlabelTwo = new JLabel("2) Change Phone "); //User contact info
                  nlabelTwo.setBounds(50, 100, 200, 30);  
                                      
                  JLabel nlabelThree = new JLabel("3) Change Address "); //User Address
                  nlabelThree.setBounds(50, 150, 200, 30);  
                                       
                  JLabel nlabelFour = new JLabel("4) Change Card "); //User Address
                  nlabelFour.setBounds(50, 200, 200, 30);  
                  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 250, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                           int inp = Integer.parseInt(input);
                           
                           if (inp == 1) {
                              JFrame t = new JFrame("Change Name!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Old Customer Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Customer Name: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 2) {
                              JFrame t = new JFrame("Change Phone!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Customer Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("Customer New Price: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 3) {
                              JFrame t = new JFrame("Change Address!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Customer Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Customer Phone Number: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 4) {
                              JFrame t = new JFrame("Delete Customer!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Customer Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });  
                              
                              t.add(tlabelOne); 
                              
                              t.add(ttextOne);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp > 4) {
                              System.out.println("No Good");
                           }
                        }
                     });
               
                                     
                  n.setSize(300, 600);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(nlabelTwo);
                  n.add(nlabelThree);
                  n.add(nlabelFour);
                  n.add(ntextOne);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
               
               if (inp == 6) {
                  JFrame n = new JFrame("Edit Purchase!"); //n = new
                  
                  n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  n.setDefaultLookAndFeelDecorated(true);
                  
                  //-------------------------------------------------------
                  //=======================================================
                  //=-=-=-=-=-=-=-=-=-=-=-=-Edit Purchase-=-=-=-=-=-=-=-=-=
                  //=======================================================
                  //-------------------------------------------------------
                  
                  JLabel nlabelOne = new JLabel("1) Change Customer Name "); 
                  nlabelOne.setBounds(50, 50, 200, 30);  
                                      
                  JLabel nlabelTwo = new JLabel("2) Change Product Cost "); //User contact info
                  nlabelTwo.setBounds(50, 100, 200, 30);  
                                      
                  JLabel nlabelThree = new JLabel("3) Change Product Info "); //User Address
                  nlabelThree.setBounds(50, 150, 200, 30);  
                                       
                  JLabel nlabelFour = new JLabel("4) Change Sold Stock "); //User Address
                  nlabelFour.setBounds(50, 200, 200, 30);  
                  
                  JTextField ntextOne = new JTextField();
                  ntextOne.setBounds(50, 250, 200, 30);
                  ntextOne.addActionListener(
                     new ActionListener()
                     {
                        public void actionPerformed(ActionEvent e)
                        {
                           String input = ntextOne.getText();
                           int inp = Integer.parseInt(input);
                           
                           if (inp == 1) {
                              JFrame t = new JFrame("Change Customer Name!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Old Customer Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Customer Name: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 2) {
                              JFrame t = new JFrame("Change Product Cost!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Old Product Cost: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Prodct Price: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 3) {
                              JFrame t = new JFrame("Change Product Info!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("What to change: "); 
                              tlabelTwo.setBounds(50, 150, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 200, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp == 4) {
                              JFrame t = new JFrame("Change Stock!"); //t = thired
                              
                              JLabel tlabelOne = new JLabel("Product Name: "); 
                              tlabelOne.setBounds(50, 50, 200, 30); 
                              JTextField ttextOne = new JTextField();
                              ttextOne.setBounds(50, 100, 200, 30);
                              ttextOne.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextOne.getText();
                                    }
                                 });
                                 
                              JLabel tlabelTwo = new JLabel("New Stock: "); 
                              tlabelTwo.setBounds(50, 200, 200, 30); 
                              JTextField ttextTwo = new JTextField();
                              ttextTwo.setBounds(50, 250, 200, 30);
                              ttextTwo.addActionListener(
                                 new ActionListener()
                                 {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                       String input = ttextTwo.getText();
                                    }
                                 });   
                              
                              t.add(tlabelOne); 
                              t.add(tlabelTwo);
                              
                              t.add(ttextOne);
                              t.add(ttextTwo);
                              
                              t.setSize(300, 600);
                              t.setLocation(600, 200);
                           
                              t.setLayout(null);
                              t.setVisible(true);
                           }
                           
                           if (inp > 4) {
                              System.out.println("No Good");
                           }
                        }
                     });
               
                                     
                  n.setSize(300, 600);
                  n.setLocation(600, 200);
               
               //---------------------------------------
               
                  n.add(nlabelOne);
                  n.add(nlabelTwo);
                  n.add(nlabelThree);
                  n.add(nlabelFour);
                  n.add(ntextOne);
               
               //---------------------------------------
               
                  n.setLayout(null);
                  n.setVisible(true);
               }
            
            
            }
         });
   
       
      
      f.add(labelOne);
      f.add(labelTwo);
      f.add(labelThree);
      f.add(labelFour);
      f.add(labelFive);
      f.add(labelSix);
      f.add(labelTen);
      f.add(labelEleven);
      
      //--------------------------
      
      f.add(textOne);
      
      f.setLayout(null);
      f.setVisible(true);
   }
   
}