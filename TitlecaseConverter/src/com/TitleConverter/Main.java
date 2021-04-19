package com.TitleConverter;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame application = createGui();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setVisible(true);
    }

    private static JFrame createGui(){
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(300,40));

        JButton convertButton = new JButton("Convert");

        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(300,40));

        convertButton.addActionListener(event -> {
            output.setText(TitlecaseConverter.ConvertirAMayusculas(input.getText()));
        });

        JFrame gui = new JFrame("Title case converter");
        gui.setLayout(new FlowLayout());
        gui.add(input);
        gui.add(convertButton);
        gui.add(output);
        gui.pack();
        gui.setLocationRelativeTo(null);

        return gui;
    }
}