import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

 class Menu2 extends JFrame implements ActionListener
 {

     JLabel l1 = new JLabel("SCHOOL SUPPLIES:");
     JLabel l2 = new JLabel("BOOKS:");
     JLabel l3 = new JLabel("NONFICTION BOOKS:");
     JLabel l4 = new JLabel("ART MATERIALS:");

     JCheckBox cb1 = new JCheckBox("PENS(ANY COLOR) - Php 10");
     JCheckBox cb2 = new JCheckBox("PENCILS - Php 10");
     JCheckBox cb3 = new JCheckBox("ERASERS - Php 19");
     JCheckBox cb4 = new JCheckBox("FILING AND STORAGE - Php 20");
     JCheckBox cb5 = new JCheckBox("PAPERS - Php 25/SET");
     JCheckBox cb6 = new JCheckBox("FICTION BOOKS (ANY) - Php 500");
     JCheckBox cb7 = new JCheckBox("NON-FICTION BOOKS (ANY) - Php 500");
     JCheckBox cb15 = new JCheckBox("CANVAS- Php 200");
     JCheckBox cb8 = new JCheckBox("SKETCH PAD - Php 180");
     JCheckBox cb9 = new JCheckBox("PAINT/COLOR MATERIALS - Php 100/SET");


     JLabel l5 = new JLabel("Product ID: SS001");
     JLabel l6 = new JLabel("Product ID: SS002");
     JLabel l7 = new JLabel("Product ID: SS003");
     JLabel l8 = new JLabel("Product ID: SS004");
     JLabel l9 = new JLabel("Product ID: SS005");
     JLabel l10 = new JLabel("Product ID: BK001");
     JLabel l11 = new JLabel("Product ID: BK002");
     JLabel l12 = new JLabel("Product ID: AM001");
     JLabel l13 = new JLabel("Product ID: AM002");
     JLabel l14 = new JLabel("Product ID: AM003");


     JButton b = new JButton("Order");
     JButton p1 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\pens.png"));
     JButton p2 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\pencils.png"));
     JButton p3 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\erasers.png"));
     JButton p4 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\filing and storage.png"));
     JButton p5 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\PAPER.png"));
     JButton p6 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\fiction (2).png"));
     JButton p7 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\nonfiction.png"));
     JButton p8 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\canvas.png"));
     JButton p9 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\sketchpad.png"));
     JButton p10 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\paintmaterial.png"));
     String color[]={"red", "blue", "green", "black"};
     String type[]={"graphite", "charcoal"};
     String type1[]={"vinyl", "rubber", "gum eraser", "sand eraser"};
     String type2[]={"long folder", "short folder", "long envelope", "short envelope", "mini bookshelf", "plastic envelope"};
     String type3[]={"short bond paper", "colored paper", "oslo paper", "long bond paper", "yellow pad", "intermediate pad", "notebook"};
     String type4[]={"Fable", "Fairy Tale",
             "Fantasy",
             "Folklore",
             "Horror",
             "Humor",
             "Legend",
             "Mystery",
             "Mythology",
             "Science Fiction",
             "Short Story",
             "Tall Tale"};
     String type5[]={"Biography",
             "Elementary Education",
             "JHS Education",
             "SHS Education",
             "Tertiary Education",
             "Autobiography",
             "Novel",
             "World History",
             "Phillipine History"};
     String type6[]= {"Universal-10x8","Universal-20x16","Oil-10x8","Oil-20x16"};
     String type7[]= {"7x10","9x12","11x14","18x24","24x36"};
     String type8[]= {"Paint-Red","Paint-Yellow","Paint-Blue","Paint-Black","Paint-White","Paint-Assorted", "Color Pencil-Assorted",
             "Color Pencil-Red","Color Pencil-Yellow","Color Pencil-Blue","Color Pencil-Black","Color Pencil-White"};

     JTextField tf1=new JTextField();
     JTextField tf2=new JTextField();
     JTextField tf3=new JTextField();
     JTextField tf4=new JTextField();
     JTextField tf5=new JTextField();
     JTextField tf6=new JTextField();
     JTextField tf7=new JTextField();
     JTextField tf8=new JTextField();
     JTextField tf9=new JTextField();
     JTextField tf10=new JTextField();
     JLabel t1 = new JLabel("Color: ");
     JLabel t2 = new JLabel("Type: ");
     JLabel t3 = new JLabel("Type: ");
     JLabel t4 = new JLabel("Type: ");
     JLabel t5 = new JLabel("Type: ");
     JLabel t6 = new JLabel("Type: ");
     JLabel t7 = new JLabel("Type: ");
     JLabel t8 = new JLabel("Type/Size: ");
     JLabel t9 = new JLabel("Size: ");
     JLabel t10 = new JLabel("Type/Color: ");
     JLabel q1 = new JLabel("Quantity: ");
     JLabel q2 = new JLabel("Quantity: ");
     JLabel q3 = new JLabel("Quantity: ");
     JLabel q4 = new JLabel("Quantity: ");
     JLabel q5 = new JLabel("Quantity: ");
     JLabel q6 = new JLabel("Quantity: ");
     JLabel q7 = new JLabel("Quantity: ");
     JLabel q8 = new JLabel("Quantity: ");
     JLabel q9 = new JLabel("Quantity: ");
     JLabel q10 = new JLabel("Quantity: ");

     final JComboBox combobox1 = new JComboBox(color);
     final JComboBox combobox2 = new JComboBox(type);
     final JComboBox combobox3 = new JComboBox(type1);
     final JComboBox combobox4 = new JComboBox(type2);
     final JComboBox combobox5 = new JComboBox(type3);
     final JComboBox combobox6 = new JComboBox(type4);
     final JComboBox combobox7 = new JComboBox(type5);
     final JComboBox combobox8 = new JComboBox(type6);
     final JComboBox combobox9 = new JComboBox(type7);
     final JComboBox combobox10 = new JComboBox(type8);


     public Menu2()
     {
         setLayout();
         setLocationAndSize();
         setColorAndFonts();
         components();
         addActionEvent();
     }

     public void setLayout()
     {
         setLayout(null);
         setVisible(true);
     }

     public void setLocationAndSize()
     {
         l1.setBounds(550,0,700,60);

         cb1.setBounds(30,45,190,20);
         p1.setBounds(55, 70, 150, 150);
         combobox1.setBounds(90, 230, 90, 20);
         t1.setBounds(30, 230, 90, 20);
         tf1.setBounds(90,260,150,20);
         q1.setBounds(30, 260, 150, 20);
         l5.setBounds(30, 290, 150, 20);

         cb2.setBounds(290,45,150,20);
         p2.setBounds(315,70,150,150);
         combobox2.setBounds(350,230, 90, 20);
         t2.setBounds(290, 230, 90, 20);
         tf2.setBounds(350,260,150,20);
         q2.setBounds(290, 260, 150, 20);
         l6.setBounds(290, 290, 150, 20);

         cb3.setBounds(550,45,150,20);
         p3.setBounds(575,70,150,150);
         combobox3.setBounds(610,230, 120, 20);
         t3.setBounds(550, 230, 90, 20);
         tf3.setBounds(610,260,150,20);
         q3.setBounds(550, 260, 150, 20);
         l7.setBounds(550, 290, 150, 20);

         cb4.setBounds(810,45,210,20);
         p4.setBounds(835,70,150,150);
         combobox4.setBounds(870,230, 120, 20);
         t4.setBounds(810, 230, 90, 20);
         tf4.setBounds(870,260,150,20);
         q4.setBounds(810, 260, 150, 20);
         l8.setBounds(810, 290, 150, 20);

         cb5.setBounds(1070,45,150,20);
         p5.setBounds(1095,70,150,150);
         combobox5.setBounds(1130,230, 140, 20);
         t5.setBounds(1070, 230, 90, 20);
         tf5.setBounds(1130,260,150,20);
         q5.setBounds(1070, 260, 150, 20);
         l9.setBounds(1070, 290, 150, 20);

         l2.setBounds(10,310,700,60);

         cb6.setBounds(30,355,250,20);
         p6.setBounds(55,380,150,150);
         combobox6.setBounds(90,540, 120, 20);
         t6.setBounds(30, 540, 90, 20);
         tf6.setBounds(90,570,150,20);
         q6.setBounds(30, 570, 150, 20);
         l10.setBounds(30, 600, 150, 20);

         cb7.setBounds(290,355,250,20);
         p7.setBounds(315,380,150,150);
         combobox7.setBounds(350,540, 148, 20);
         t7.setBounds(290, 540, 90, 20);
         tf7.setBounds(350,570,150,20);
         q7.setBounds(290, 570, 150, 20);
         l11.setBounds(290, 600, 150, 20);

         l4.setBounds(550,310,700,60);
         p8.setBounds(575,380 ,150 ,150);
         cb15.setBounds(550,355,180,20);
         combobox8.setBounds(610,540, 120, 20);
         t8.setBounds(530, 540, 90, 20);
         tf8.setBounds(610, 570,150,20);
         q8.setBounds(530, 570, 150, 20);
         l12.setBounds(530, 600, 150, 20);

         cb8.setBounds(810,355,180,20);
         p9.setBounds(835,380,150,150);
         combobox9.setBounds(870,540, 120, 20);
         t9.setBounds(810, 540, 90, 20);
         tf9.setBounds(870, 570,150,20);
         q9.setBounds(810, 570, 150, 20);
         l13.setBounds(810, 600, 150, 20);

         cb9.setBounds(1050,355,285,20);
         p10.setBounds(1095,380,150,150);
         combobox10.setBounds(1140,540, 150, 20);
         t10.setBounds(1070, 540, 90, 20);
         tf10.setBounds(1140, 570,150,20);
         q10.setBounds(1070, 570, 150, 20);
         l14.setBounds(1070, 600, 150, 20);

         b.setBounds(600,680,80,30);
     }

     public void setColorAndFonts()
     {
         Color c1 = new Color(241, 161, 97);
         l1.setFont(new Font("Arial", Font.BOLD, 25));
         l1.setForeground(c1);
         l2.setFont(new Font("Arial", Font.BOLD, 25));
         l2.setForeground(c1);
         l4.setFont(new Font("Arial", Font.BOLD, 25));
         l4.setForeground(c1);

         b.setBackground(c1);
         b.setForeground(Color.white);
         b.setFont(new Font("Arial", Font.BOLD, 15));
     }

     public void components()
     {
         add(l1);
         add(l2);
         add(l4);
         add(cb1);
         add(cb2);
         add(cb3);
         add(cb4);
         add(cb5);

         add(cb6);
         add(cb7);
         add(cb15);
         add(cb8);
         add(cb9);

         add(b);
         add(p1);
         add(p2);
         add(p3);
         add(p4);
         add(p5);
         add(p6);
         add(p7);
         add(p8);
         add(p9);
         add(p10);
         add(combobox1);
         add(combobox2);
         add(combobox3);
         add(combobox4);
         add(combobox5);
         add(combobox6);
         add(combobox7);
         add(combobox8);
         add(combobox9);
         add(combobox10);
         add(tf1);
         add(tf2);
         add(tf3);
         add(tf4);
         add(tf5);
         add(tf6);
         add(tf7);
         add(tf8);
         add(tf9);
         add(tf10);
         add(q1);
         add(q2);
         add(q3);
         add(q4);
         add(q5);
         add(q6);
         add(q7);
         add(q8);
         add(q9);
         add(q10);

         add(t1);
         add(t2);
         add(t3);
         add(t4);
         add(t5);
         add(t6);
         add(t7);
         add(t8);
         add(t9);
         add(t10);

         add(l5);
         add(l6);
         add(l7);
         add(l8);
         add(l9);
         add(l10);
         add(l11);
         add(l12);
         add(l13);
         add(l14);
     }

     public void addActionEvent()
     {
         b.addActionListener(this);
     }

     @Override
     public void actionPerformed(ActionEvent e)
     {
         float amount = 0;
         String msg = "                                                                                                     MARAHUYO BOOKSTORE\n"
                 +"Item Code/Reference          Quantity                         Item Description"
                 + "                                   Item Color/Type                  Price                Amount"+"         \n";

         if(cb1.isSelected())
         {
             String s1=tf1.getText();
             int a =Integer.parseInt(s1);
             amount+=10*a;
             double am1 = 10*a;
             msg+="SS001                                           " + a + "                                "+ "     PENS                                                    "
                     +  combobox1.getItemAt(combobox1.getSelectedIndex()) + "                                   10.00                   "+am1+"\n";

         }
         if(cb2.isSelected())
         {
             String s2=tf2.getText();
             int b=Integer.parseInt(s2);
             amount+=10*b;
             double am2 = 10*b;
             msg+="SS002                                           " + b + "                               "+ "      PENCILS                                              "
                     +  combobox2.getItemAt(combobox2.getSelectedIndex()) + "                           10.00                   "+am2+"\n";

         }
         if(cb3.isSelected())
         {
             String s3=tf3.getText();
             int c=Integer.parseInt(s3);
             amount+=19*c;
             double am3 = 19*c;
             msg+="SS003                                           " + c + "                              "+ "       ERASERS                                            "
                     +  combobox3.getItemAt(combobox3.getSelectedIndex()) + "                                 19.00                  "+am3+"\n";
         }
         if(cb4.isSelected())
         {
             String s4=tf4.getText();
             int d=Integer.parseInt(s4);
             amount+=20*d;
             double am4 = 20*d;
             msg+="SS004                                           " + d + "                            "+ "         FILING AND STORAGE                      "
                     +  combobox4.getItemAt(combobox4.getSelectedIndex()) + "                      20.00                  "+am4+"\n";
         }
         if(cb5.isSelected())
         {
             String s5=tf5.getText();
             int f=Integer.parseInt(s5);
             amount+=25*f;
             double am5 = 25*f;
             msg+="SS005                                           " + f + "                            "+ "         PAPERS                                               "
                     +  combobox5.getItemAt(combobox5.getSelectedIndex()) + "              25.00                  "+am5+"\n";
         }

         if(cb6.isSelected())
         {
             String s6=tf6.getText();
             int g=Integer.parseInt(s6);
             amount+=500*g;
             double am6 = 500*g;
             msg+="BK001                                           " + g + "                         "+ "            FICTION BOOKS                                "
                     +  combobox6.getItemAt(combobox6.getSelectedIndex()) + "                              500.00                 "+am6+"\n";
         }


         if(cb7.isSelected())
         {
             String s7=tf7.getText();
             int h=Integer.parseInt(s7);
             amount+=500*h;
             double am7 = 500*h;
             msg+="BK002                                           " + h + "                         "+ "            NON-FICTION BOOKS                       "
                     +  combobox7.getItemAt(combobox7.getSelectedIndex()) + "                      500.00                   "+am7+"\n";
         }

         if(cb15.isSelected())
         {
             String s8=tf8.getText();
             int i=Integer.parseInt(s8);
             amount+=200*i;
             double am8 = 200*i;
             msg+="AM001                                           " + i + "                         "+ "            CANVAS                                                "
                     +  combobox8.getItemAt(combobox8.getSelectedIndex()) + "                 200.00                   "+am8+"\n";
         }
         if(cb8.isSelected())
         {
             String s9=tf9.getText();
             int j=Integer.parseInt(s9);
             amount+=180*j;
             double am9 = 180*j;
             msg+="AM002                                           " + j + "                         "+ "            SKETCHPAD                                           "
                     +  combobox9.getItemAt(combobox9.getSelectedIndex()) + "                             180.00                   "+am9+"\n";
         }
         if(cb9.isSelected())
         {
             String s10=tf10.getText();
             int k=Integer.parseInt(s10);
             amount+=100*k;
             double am10 = 100*k;
             msg+="AM003                                           " + k + "                         "+ "            PAINT/COLOR MATERIALS                 "
                     +  combobox10.getItemAt(combobox10.getSelectedIndex()) + "                    100.00                   "+am10+"\n";
         }

         DecimalFormat df = new DecimalFormat("#.##");


         msg+= "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
         double vat = 0.12*amount;
         double total_amount = amount + vat;
         JOptionPane.showMessageDialog(this, msg+"Total Amount: " + amount +"\nVAT: " +df.format(vat)+ "\nGrand Total Amount: " +df.format(total_amount));

         String paid_amount = JOptionPane.showInputDialog(this, "Enter Amount Paid: ");
         double p = Double.parseDouble(paid_amount);

         double pay = 0.00;




         if (p>total_amount)
         {
             pay = p-total_amount;
             JOptionPane.showMessageDialog(this, "Your change is: " + df.format(pay));
         }

         else if (p==total_amount)
         {
                     pay = p-total_amount;
             JOptionPane.showMessageDialog(this, "Your change is: " + df.format(pay));
         }

         if (p<total_amount)
         {
             pay = p-total_amount;
             JOptionPane.showMessageDialog(this, "Please pay a right amount. ");
             System.exit(0);
         }



         msg+= "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";

         JOptionPane.showMessageDialog(this, msg+"Total Amount: " + amount +
                 "\nVAT: " +df.format(vat)+ "\nGrand Total Amount: " +df.format(total_amount)+"\nAmount Paid: "+ df.format(p) +
                 "\nChange: "+ df.format(pay));


         int response = JOptionPane.showConfirmDialog(this, "Do you want to order again?","CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

         if(response == JOptionPane.YES_OPTION)
         {
             tf1.setText("");
             tf2.setText("");
             tf3.setText("");
             tf4.setText("");
             tf5.setText("");
             tf6.setText("");
             tf7.setText("");
             tf8.setText("");
             tf9.setText("");
             tf10.setText("");

             cb1.setSelected(false);
             cb2.setSelected(false);
             cb3.setSelected(false);
             cb4.setSelected(false);
             cb5.setSelected(false);
             cb6.setSelected(false);
             cb7.setSelected(false);
             cb15.setSelected(false);
             cb8.setSelected(false);
             cb9.setSelected(false);
         }
         if(response == JOptionPane.NO_OPTION)
         {
             String message = "Thanks for ordering. Hope you come back next time!";
             JOptionPane.showMessageDialog(this, message);
             this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             System.exit(0);
         }

     }
 }

 public class BookStore {
     public static void main(String[] args) {

         Menu2 menu2 = new Menu2();

         menu2.setTitle("Products");
         Color c3 = new Color(253, 238, 220);
         menu2.getContentPane().setBackground(c3);
         menu2.setSize(1350, 800);
         menu2.setVisible(true);
         menu2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         menu2.setLocationRelativeTo(null);
         menu2.setResizable(false);



     }
 }