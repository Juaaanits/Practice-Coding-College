import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calcu implements ActionListener{
    JTextField d1,d2,d3;
    JButton a1,a2,a3,a4;
    Calcu(){
        JFrame f = new JFrame("calculator");
        d1 = new JTextField("");
        d1.setBounds (250,50,150,20);
        d2 = new JTextField("");
        d2.setBounds(250,100,150,20);
        d3 = new JTextField("");
        d3.setBounds(250,150,150,20);
        d3.setEditable(false);

        final JLabel label = new JLabel();
        JLabel l1=new JLabel("Number 1: ");
        l1.setBounds(50,50, 150,20);
        l1.setFont(new Font("Arial", Font.BOLD, 22));
        JLabel l2=new JLabel("Number 2: ");
        l2.setBounds(50,100, 150,20);
        l2.setFont(new Font("Arial", Font.BOLD, 22));
        label.setBounds(20,150, 200,50);
        JLabel l3 = new JLabel("Output: ");
        l3.setBounds(50, 150, 150, 20);
        l3.setFont(new Font("Arial", Font.BOLD, 22));


        a1 = new JButton("+");
        a1.setBounds(50,200,50,50);
        a2 = new JButton("-");
        a2.setBounds(120,200,50,50);
        a3 = new JButton("/");
        a3.setBounds(190,200,50,50);
        a4 = new JButton("x");
        a4.setBounds(260,200,50,50);

        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);

        f.add(d1);
        f.add(d2);
        f.add(d3);

        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(a4);
        f.add(l1);
        f.add(l2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = d1.getText();
        String s2 = d2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;

        if (e.getSource() == a1) {
            c = a + b;
        }
        else if (e.getSource() == a2) {
            c = a - b;
        }
        else if (e.getSource() == a3) {
            c = a / b;
        }
        else if (e.getSource() == a4) {
            c = a * b;
        }
        String result = String.valueOf(c);
        a3.setText(result);
    }
    public static void main(String[]args) {
        new Calcu();
    }
}