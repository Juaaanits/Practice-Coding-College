/*import java.awt.event.*;
import javax.swing.*;

public class ButtonExample
{
    public static void main(String[] args)
    {
        JFrame jframe = new JFrame("Button Example");
        final JTextField textfield =  new JTextField();
        textfield.setBounds(50,50,150,20);
        JButton jbutton = new JButton("Click Here");
        jbutton.setBounds(50, 100, 95, 30);
        jbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textfield.setText("Welcome to Javapoint");
            }
        });
        jframe.add(jbutton);
        jframe.add(textfield);
        jframe.setSize(400, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}

 */


import java.awt.event.*;
import javax.swing.*;

public class ButtonExample {
    ButtonExample() {
        JFrame jframe = new JFrame("Button Example");
        JButton jbutton = new JButton(new ImageIcon("C:\\Users\\Juanito\\Downloads\\Document.png"));
        jbutton.setBounds(300, 300, 1000, 500);
        jframe.add(jbutton);
        jframe.setSize(300, 400);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }

}