package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame {
    private JButton button1 = new JButton("FC Barcelona");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel label1 = new JLabel("Result: 0 X 0");
    private JLabel label2 = new JLabel("Last Scorer: N/A");//название команды, на которую нажали последней
    private JLabel label3 = new JLabel("Winner: DRAW");//команда победитель

    private int madrid = 0, barca = 0;

    public Football() {
        super("Football");
        setSize(250, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(button1);
        container.add(button2);
        container.add(label1);
        container.add(label2);
        container.add(label3);

        button1.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {
                barca++;
                label1.setText("Result: " + barca + " X " + madrid);
                label2.setText("Last Scorer: FC Barcelona");
                if(barca > madrid)
                    label3.setText("Winner: FC Barcelona");
                else if(madrid > barca)
                    label3.setText("Winner: Real Madrid");
                else
                    label3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        button2.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {
                madrid++;
                label1.setText("Result: " + barca + " X " + madrid);
                label2.setText("Last Scorer: Real Madrid");
                if(barca > madrid)
                    label3.setText("Winner: FC Barcelona");
                else if(madrid > barca)
                    label3.setText("Winner: Real Madrid");
                else
                    label3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }

    public static void main(String[] args) {
        new Football();
    }
}
