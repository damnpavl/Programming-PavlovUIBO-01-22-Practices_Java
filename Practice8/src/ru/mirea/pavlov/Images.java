package ru.mirea.pavlov;
import javax.swing.*;
import java.awt.*;

public class Images extends JFrame {

    public Images() {
        setTitle("Приложение с изображениями");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        JLabel imageLabel1 = new JLabel(new ImageIcon("/Users/pvl/Pictures/Фото 24.10.24, 15.14.jpg"));
        JLabel caption1 = new JLabel("это я нормальный", JLabel.CENTER);
        panel1.setLayout(new BorderLayout());
        panel1.add(imageLabel1, BorderLayout.CENTER);
        panel1.add(caption1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        JLabel imageLabel2 = new JLabel(new ImageIcon("/Users/pvl/Pictures/Фото 24.10.24, 15.15.jpg"));
        JLabel caption2 = new JLabel("это меня скрючило", JLabel.CENTER);
        panel2.setLayout(new BorderLayout());
        panel2.add(imageLabel2, BorderLayout.CENTER);
        panel2.add(caption2, BorderLayout.SOUTH);

        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Images();
    }
}