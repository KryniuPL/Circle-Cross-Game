import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int counter = 0;
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    JButton button6 = new JButton("");
    JButton button7 = new JButton("");
    JButton button8 = new JButton("");
    JButton button9 = new JButton("");
    public Main() {
        super("Kolko i krzyzyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setResizable(true);
        setVisible(true);
        setLayout(new GridLayout(3, 3));



        button1.setFont(new Font("Arial", Font.BOLD, 50));
        button2.setFont(new Font("Arial", Font.BOLD, 50));
        button3.setFont(new Font("Arial", Font.BOLD, 50));
        button4.setFont(new Font("Arial", Font.BOLD, 50));
        button5.setFont(new Font("Arial", Font.BOLD, 50));
        button6.setFont(new Font("Arial", Font.BOLD, 50));
        button7.setFont(new Font("Arial", Font.BOLD, 50));
        button8.setFont(new Font("Arial", Font.BOLD, 50));
        button9.setFont(new Font("Arial", Font.BOLD, 50));

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button1 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button1.setText("X");
                    check();
                } else {
                    button1.setText("0");
                    check();
                }
                button1.setEnabled(false);
                counter++;
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button2 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button2.setText("X");
                    check();
                } else {
                    button2.setText("0");
                    check();
                }
                button2.setEnabled(false);
                counter++;
            }
        });


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button3 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button3.setText("X");
                    check();
                } else {
                    button3.setText("0");
                    check();
                }
                button3.setEnabled(false);
                counter++;
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button4 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button4.setText("X");
                    check();
                } else {
                    button4.setText("0");
                    check();
                }
                button4.setEnabled(false);
                counter++;
            }
        });


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button5 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button5.setText("X");
                    check();
                } else {
                    button5.setText("0");
                    check();
                }
                button5.setEnabled(false);
                counter++;
            }
        });


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button6 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button6.setText("X");
                    check();
                } else {
                    button6.setText("0");
                    check();
                }
                button6.setEnabled(false);
                counter++;
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button7 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button7.setText("X");
                    check();
                } else {
                    button7.setText("0");
                    check();
                }
                button7.setEnabled(false);
                counter++;
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button8 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button8.setText("X");
                    check();
                } else {
                    button8.setText("0");
                    check();
                }
                button8.setEnabled(false);
                counter++;
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button9 = (JButton) e.getSource();
                if (counter % 2 == 0) {
                    button9.setText("X");
                    check();
                } else {
                    button9.setText("0");
                    check();
                }
                button9.setEnabled(false);
                counter++;
            }
        });



    }
    public void check()
    {

        if (button1.getText() == "X" && button2.getText() == "X" && button3.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button4.getText() == "X" && button5.getText() == "X" && button6.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button7.getText() == "X" && button8.getText() == "X" && button9.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button1.getText() == "X" && button5.getText() == "X" && button9.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button3.getText() == "X" && button6.getText() == "X" && button7.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button1.getText() == "X" && button4.getText() == "X" && button7.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button2.getText() == "X" && button5.getText() == "X" && button8.getText() == "X") {
            System.out.println("wygrał X");
        } else if (button3.getText() == "X" && button6.getText() == "X" && button9.getText() == "X") {
            System.out.println("wygrał X");

        } else if (button1.getText() == "0" && button2.getText() == "0" && button3.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button4.getText() == "0" && button5.getText() == "0" && button6.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button7.getText() == "0" && button8.getText() == "0" && button9.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button1.getText() == "0" && button5.getText() == "0" && button9.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button3.getText() == "0" && button5.getText() == "0" && button7.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button1.getText() == "0" && button4.getText() == "0" && button7.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button2.getText() == "0" && button5.getText() == "0" && button8.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button3.getText() == "0" && button6.getText() == "0" && button9.getText() == "0") {
            System.out.println("wygrał 0");
        } else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            System.out.println("REMIS");
        }

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
