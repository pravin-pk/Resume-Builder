import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//loginframe
class LoginFrame {

    JFrame frame;
    JPanel panel, panel2;

    LoginFrame(){


        JFrame frame = new JFrame();
        frame.setTitle("Resume Builder");
        frame.setSize(350, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Testing JPanel and adding components
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 350, 600);
        panel.setBackground(new Color(150,150,150));
        panel.setBorder(BorderFactory.createBevelBorder(0));
        //panel.setLayout(new BorderLayout());
        panel.setLayout(null);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 170, 100, 25);
        username.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel.add(username);

        JTextField Usernametxt = new JTextField();
        Usernametxt.setBounds(50, 195, 200, 25);
        panel.add(Usernametxt);

        JLabel password = new JLabel("Password: ");
        password.setBounds(50, 225, 100, 25);
        password.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel.add(password);

        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(50, 250, 200, 25);
        panel.add(Passwordtxt);

        JCheckBox chkbox = new JCheckBox("Show Password");
        chkbox.setBounds(52, 282, 150, 20);
        chkbox.setFont(new Font("Montserrat", Font.PLAIN, 12));
        chkbox.setFocusable(false);
        chkbox.setBackground(new Color(150,150,150));
        panel.add(chkbox);

        JButton loginBtn = new JButton("Sign in");
        loginBtn.setBounds(50, 330, 100, 25);
        loginBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        loginBtn.setBackground(new Color(0, 95, 135));
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setOpaque(true);
        loginBtn.setFocusable(false);
        panel.add(loginBtn);

        JButton registerBtn = new JButton("Sign up");
        registerBtn.setBounds(175, 330, 100, 25);
        registerBtn.setFont(new Font("Montserrat", Font.PLAIN, 15));
        registerBtn.setBackground(new Color(0, 95, 135));
        registerBtn.setForeground(new Color(255, 255, 255));
        registerBtn.setOpaque(true);
        registerBtn.setFocusable(false);
        panel.add(registerBtn);

        //ImageIcon image = new ImageIcon("logo.png");
        JLabel lbl = new JLabel();
        lbl.setBounds(55, 10, 350, 100);
        //lbl.setIcon(image);
        lbl.setText("Resume Builder");
        lbl.setVerticalTextPosition(JLabel.TOP);
        lbl.setHorizontalTextPosition(JLabel.CENTER);
        lbl.setIconTextGap(-10);
        lbl.setFont(new Font("Mv Boli", Font.BOLD, 26));
        panel.add(lbl);

        chkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chkbox.isSelected()) {
                    Passwordtxt.setEchoChar((char) 0);
                } else {
                    Passwordtxt.setEchoChar('\u2022');
                }
            }

        });
     
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usertxt= Usernametxt.getText();
                String passtxt= String.valueOf(Passwordtxt.getPassword());
                if(usertxt.equals("resume") && passtxt.equals("resume")){
                    //IntroPage intro = new IntroPage();
                    JOptionPane.showMessageDialog(null, "Login Successfull", "Message box", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                    IntroPage intro = new IntroPage();
                }
                else{
                    loginBtn.remove(loginBtn);
                    JLabel incorrect = new JLabel("Incorrect Username or Password");
                    incorrect.setForeground(Color.red);
                    incorrect.setBounds(50, 300, 200, 25);
                    
                    loginBtn.setBounds(50, 330, 100, 25);
                    
                    panel.add(incorrect);
                    panel.add(loginBtn);
    
                    panel.revalidate();
                    panel.repaint();
                }
                
            }
        });

        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                registerPanel(frame);
            }
        });



        frame.add(panel);
        frame.setVisible(true);

    }

    public void registerPanel(JFrame frame) {
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 350, 600);
        panel2.setBackground(new Color(150, 150, 150));
        panel2.setLayout(null);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(50, 100, 150, 25);
        name.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(name);

        JTextField nametxt = new JTextField();
        nametxt.setBounds(50, 125, 200, 25);
        panel2.add(nametxt);

        JLabel email = new JLabel("Email Id");
        email.setBounds(50, 160, 100, 25);
        email.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(email);

        JTextField emailtxt = new JTextField();
        emailtxt.setBounds(50, 185, 200, 25);
        panel2.add(emailtxt);

        JLabel usernameR = new JLabel("Username");
        usernameR.setBounds(50, 220, 100, 25);
        usernameR.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(usernameR);

        JTextField usernametxt = new JTextField();
        usernametxt.setBounds(50, 245, 200, 25);
        panel2.add(usernametxt);

        JLabel password = new JLabel("Password");
        password.setBounds(50, 280, 100, 25);
        password.setFont(new Font("Montserrat", Font.PLAIN, 15));
        panel2.add(password);

        JPasswordField Passwordtxt = new JPasswordField();
        Passwordtxt.setBounds(50, 305, 200, 25);
        panel2.add(Passwordtxt);

        JButton registerBtnR = new JButton("Sign up");
        registerBtnR.setBounds(100, 350, 100, 25);
        registerBtnR.setFont(new Font("Montserrat", Font.PLAIN, 15));
        registerBtnR.setBackground(new Color(0, 95, 135));
        registerBtnR.setForeground(new Color(255, 255, 255));
        registerBtnR.setOpaque(true);
        registerBtnR.setFocusable(false);
        panel2.add(registerBtnR);

        frame.add(panel2);
        
    }
    
}