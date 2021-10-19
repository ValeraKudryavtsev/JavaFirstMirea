package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess extends JFrame {
    private JLabel label = new JLabel("Угадайте число от 1 до 20 за 3 попытки");
    private JTextField textField;
    private JButton button = new JButton("Ответить");
    private int xNumber = 4;

    public Guess() {
        setTitle("Угадайка");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField(15);
        textField.setToolTipText("Поле для ввода");
        textField.setHorizontalAlignment(JTextField.LEFT);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xNumber == Integer.parseInt(textField.getText()))
                    JOptionPane.showMessageDialog(Guess.this, "Угадал!");
                else if(xNumber > Integer.parseInt(textField.getText()))
                    JOptionPane.showMessageDialog(Guess.this, "Ваше число меньше искомого");
                else
                    JOptionPane.showMessageDialog(Guess.this, "Ваше число больше искомого");
            }
        });
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(label);
        container.add(textField);
        container.add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Guess();
    }
}
