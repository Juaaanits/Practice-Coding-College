import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu1 implements ActionListener
{
    private static JLabel labelMen;
    private static JButton Menub1;
    private static JButton Menub2;
    private static JLabel background;

    public  Menu1(){
        JPanel panelMen = new JPanel();
        JFrame frameMen = new JFrame();

        frameMen.setSize(1165,480);
        frameMen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMen.add(panelMen);
        frameMen.setTitle("Main Menu");
        frameMen.setLocationRelativeTo(null);
        frameMen.setResizable(false);
        frameMen.setVisible(true);

        panelMen.setLayout(null);
        panelMen.setBackground(new Color(253,238,220));

        labelMen = new JLabel("Marahuyo Bookstore");
        labelMen.setBounds(460,10,700,63);
        labelMen.setFont(new Font("Arial", Font.BOLD, 60));
        labelMen.setForeground(new Color(241, 161, 97));
        panelMen.add(labelMen);

        Menub1 = new JButton("BUY ITEMS");
        Menub1.setBounds(680,250,150,45);
        Menub1.addActionListener(this);
        Color c1 = new Color(241, 161, 97);
        Menub1.setFont(new Font("Arial", Font.BOLD, 15));
        Menub1.setBackground(c1);
        Menub1.setForeground(Color.white);
        panelMen.add(Menub1);

        JButton img_1 = new JButton (new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\bookstore_1.jpg"));
        img_1.setBounds(0, 0 , 360, 480);
        panelMen.add(img_1);

        JButton img_2 = new JButton (new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\Light Green Minimalist All New Variant  Email Header.png"));
        img_2.setBounds(361, 308 , 800, 150);
        panelMen.add(img_2);


        JButton img_3 = new JButton (new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\FINAL LOGO.png"));
        img_3.setBounds(650, 80 , 200, 150);
        panelMen.add(img_3);

    }
    public static void main (String[] args) {

        Menu1 a = new Menu1();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Details.main(null);

    }
}
