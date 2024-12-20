// swing is under Java Extended package (javax)
import javax.swing.*;
// To use color class using awt
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame is within swing package
public class Login extends JFrame implements ActionListener {

    JButton rules, back;  // to be used in actionPerformed
    JTextField tname;


    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // making layout null to redesigning

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/loginJava.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 460); // Placing image in specified place
        add(image); // places component on frame by passing object

        // Texts
        JLabel heading = new JLabel("Java Quizzz");
        heading.setBounds(620, 60, 280, 45);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(665, 150, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tname = new JTextField();
        tname.setBounds(645, 190, 200, 30);
        tname.setFont(new Font("Arial", Font.PLAIN, 20));
        tname.setHorizontalAlignment(JLabel.CENTER);
        add(tname);

        rules = new JButton("Next");
        rules.setBounds(600, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Quit");
        back.setBounds(750, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);



        setSize(1000, 500);
        setLocation(200, 150);
        setResizable(false);
        setVisible(true); // by default frame is not visible


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name = tname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back){
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
