import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton back, start;
    Rules(String name){

        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome to Java Quizzz " + name);
        heading.setBounds(20, 20, 800, 40);
        heading.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();

        rules.setBounds(20, 50, 790, 380);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. <b>Number of Questions:</b> The quiz consists of a fixed number of questions (e.g., 10 questions)." + "<br><br>" +
                        "2. <b>Answer Format:</b> Each question will have 4 multiple-choice answers. Only one answer is correct." + "<br><br>" +
                        "3. <b>Time Limit:</b> Players have a set amount of time to answer each question (e.g., 5 seconds per question)." + "<br><br>" +
                        "4. <b>Scoring:</b> Players earn points for each correct answer (e.g., 10 points per correct answer)." + "<br><br>" +
                        "5. <b>No Negative Marking:</b> There is no penalty for incorrect answers, but no points are awarded either." + "<br><br>" +
                        "6. <b>Automatic Submission:</b> If the time runs out for a question, the current question is automatically submitted, and the next question is presented." + "<br><br>" +
                        "7. <b>Final Score Display:</b> The player's final score is displayed at the end of the quiz." + "<br><br>" +
                "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(200, 400, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(400, 400, 120, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        setSize(800, 650);
        setLocation(350, 100);
        setResizable(false);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }


    public static void main(String[] args) {
        new Rules("User");
    }
}
