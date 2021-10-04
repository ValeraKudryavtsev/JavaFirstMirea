package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Gif extends JFrame {
    public static void main(String[] args) {
        new Gif();
    }

    public Gif() {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Image img = new ImageIcon("/Users/valera_kudryavtsev/Downloads/1R7R.gif").getImage();
        g.drawImage(img, 50, 50, 300, 300, null);//выводим img
    }
}
