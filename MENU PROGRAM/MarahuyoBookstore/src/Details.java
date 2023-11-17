import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Details implements ActionListener {
    private static JLabel label1;
    private static JLabel label2;
    private static JLabel label3;
    private static JLabel label4;
    private static JLabel label5;
    private static JLabel label6;
    private static JLabel label7;
    private static JButton enter;
    private static JTextField text1;
    private static JTextField text2;
    private static JTextField text3;
    private static JTextField text4;
    private static JTextField text5;
    private static JComboBox combo1;

    public Details(){
        JPanel Panelc = new JPanel();
        JFrame Framec = new JFrame();
        String pay[] = {"Cash","Credit","Gcash"};

        Framec.setSize(700,600);
        Framec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Framec.setTitle("Customer Details");
        Framec.setVisible(true);
        Framec.setLocationRelativeTo(null);
        Framec.setResizable(true);
        Framec.add(Panelc);
        Panelc.setLayout(null);
        Panelc.setBackground(new Color(253,238,220));

        label1 = new JLabel("Customer Details");
        label1.setBounds(200,10,700,50);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(new Color(241, 161, 97));
        Panelc.add(label1);

        label2 = new JLabel("Customer Name:");
        label2.setBounds(20,55,300,45);
        label2.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label2);

        text1 = new JTextField();
        text1.setBounds(180,65,260,25);
        Panelc.add(text1);

        label3 = new JLabel("Address:");
        label3.setBounds(20,100,300,45);
        label3.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label3);

        text2 = new JTextField();
        text2.setBounds(180,110,260,25);
        Panelc.add(text2);

        label4 = new JLabel("Contact No.:");
        label4.setBounds(20,150,300,45);
        label4.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label4);

        text3 = new JTextField();
        text3.setBounds(180,160,260,25);
        Panelc.add(text3);

        label5 = new JLabel("Age:");
        label5.setBounds(20,200,300,45);
        label5.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label5);

        text4 = new JTextField();
        text4.setBounds(180,210,260,25);
        Panelc.add(text4);

        label6 = new JLabel("Date:");
        label6.setBounds(20,250,300,45);
        label6.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label6);

        text5 = new JTextField();
        text5.setBounds(180,260,260,25);
        Panelc.add(text5);

        label7 = new JLabel("Payment Method:");
        label7.setBounds(20,300,300,45);
        label7.setFont(new Font("Arial", Font.BOLD, 16));
        Panelc.add(label7);

        combo1 = new JComboBox(pay);
        combo1.setBounds(180,310,260,25);
        Panelc.add(combo1);


        enter = new JButton("Enter");
        enter.setBounds(190,380,300,45);
        enter.addActionListener(this);
        enter.setFont(new Font("Arial", Font.BOLD, 25));
        Color c1 = new Color(241, 161, 97);
        enter.setBackground(c1);
        enter.setForeground(Color.white);
        Panelc.add(enter);

    }


    public static void main(String[] args) {
        Details i = new Details();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String detail1 = text1.getText();
        String detail2 = text2.getText();
        String detail3 = text3.getText();
        String detail4 = text4.getText();
        String detail5 = text5.getText();
        String detail6 = "Payment Method: " + combo1.getItemAt(combo1.getSelectedIndex());
        String data = "         PRE-ORDER FORM \n\n"+"Name: " + detail1 + "\n\n" +"Address: " + detail2 + "\n\n" +"Contact No.: " + detail3 + "\n\n" + "Age: " + detail4 +
                "\n\n" + "Date: " + detail5 + "\n\n" + detail6 ;


        JOptionPane.showMessageDialog(null,data);

        int opt = JOptionPane.showConfirmDialog(null, "Proceed to shop?","CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if(opt == JOptionPane.YES_OPTION) {

            BookStore.main(null);
        } if (opt == JOptionPane.NO_OPTION) {

            System.exit(0);
        }

    }

}
