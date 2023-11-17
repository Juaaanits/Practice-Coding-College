import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel welcomeLabel = new JLabel("Welcome To Marahuyo Bookstore");
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    final JTextField user = new JTextField();
    final JPasswordField pass = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton j1 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\FINAL LOGO.png"));
    JButton j2 = new JButton(new ImageIcon("C:\\Users\\Juanito\\Desktop\\Acads\\Advanced Programming\\MENU PROGRAM\\final slogan.png"));
    JCheckBox showPassword = new JCheckBox("Show Password");

    Login()
    {
        setLayout();
        setLocationAndSize();
        setFontsAndColors();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayout()
    {
        container.setLayout(null);
        container.setVisible(true);
    }

    public void setLocationAndSize()
    {
        welcomeLabel.setBounds(30, 200, 700, 50);
        usernameLabel.setBounds(100, 275, 140, 50);
        user.setBounds(260, 275, 200, 40);
        passwordLabel.setBounds(100, 335, 140, 30);
        pass.setBounds(260, 335, 200, 40);
        showPassword.setBounds(250, 380, 150, 30);
        loginButton.setBounds(190, 440, 140, 60);
        resetButton.setBounds(340, 440, 140, 60);
        j1.setBounds(250, 30, 200, 150);
        j2.setBounds(700, 0, 680, 570);
    }

    public void addComponentsToContainer()
    {
        container.add(welcomeLabel);
        container.add(usernameLabel);
        container.add(user);
        container.add(passwordLabel);
        container.add(pass);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(j1);
        container.add(j2);
    }


    public void setFontsAndColors()
    {
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        Color c1 = new Color(241, 161, 97);
        welcomeLabel.setForeground(c1);

        usernameLabel.setBounds(100, 275, 140, 50);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 25));

        user.setBounds(260, 275, 200, 40);
        user.setFont(new Font("Arial", Font.BOLD, 25));

        passwordLabel.setBounds(100, 335, 140, 30);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 25));

        pass.setFont(new Font("Arial", Font.BOLD, 25));

        showPassword.setBounds(255, 385, 160, 30);
        showPassword.setFont(new Font("Arial", Font.BOLD, 15));
        Color c2 = new Color(253,238,220);
        showPassword.setBackground(c2);

        loginButton.setFont(new Font("Arial", Font.BOLD, 25));
        loginButton.setBackground(c1);
        loginButton.setForeground(Color.white);

        resetButton.setFont(new Font("Arial", Font.BOLD, 25));
        resetButton.setBackground(c1);
        resetButton.setForeground(Color.white);
    }

    public void addActionEvent()
    {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    int attempts = 1;

    @Override
    public void actionPerformed(ActionEvent e) {

        boolean successLogin = true;

        String userName = "Juanito";
        String passWord = "abc123";

        //Coding Part of LOGIN button

        if (e.getSource() == loginButton)
        {
            do
            {

                String username = user.getText();
                String password = new String(pass.getPassword());

                JFrame f;
                f = new JFrame();

                if (userName.equals(username) && passWord.equals(password))
                {
                    JOptionPane.showMessageDialog(f, "LOGIN SUCCESSFUL!");
                    new Menu1();
                }
                else if (userName.equals(username) && (!(passWord.equals(password))) && attempts == 3)
                {
                    attempts++;
                    JOptionPane.showMessageDialog(f, "You have reached that maximum number of attempts!");
                    System.exit(0);
                }
                else if (!(userName.equals(username)) && (!(passWord.equals(password))) && attempts == 3)
                {
                    attempts++;
                    JOptionPane.showMessageDialog(f, "You have reached the maximum number of attempts!");
                    System.exit(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(f, "LOGIN FAILED!  Attempt: " + attempts + "/3","Warning", JOptionPane.WARNING_MESSAGE);
                    attempts++;
                }

            }
            while (!successLogin);
        }

        //Coding Part of RESET button
        if (e.getSource() == resetButton)
        {
            user.setText("");
            pass.setText("");
        }

        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword)
        {
            if (showPassword.isSelected())
            {
                pass.setEchoChar((char) 0);
            }
            else
            {
                pass.setEchoChar('*');
            }


        }

    }
}

public class MarahuyoBookstore {
    public static void main(String[] args)
    {
        Login frame = new Login();
        frame.setTitle("MARAHUYO BOOKSTORE");
        Color c3 = new Color(253,238,220);
        frame.getContentPane().setBackground(c3);
        frame.setSize(1390,570);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}






