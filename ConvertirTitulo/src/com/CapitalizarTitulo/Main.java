package com.CapitalizarTitulo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){
        JFrame aplicacion = crearGui();
        aplicacion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
    private static JFrame crearGui(){
        JTextField entrada = new JTextField();
        entrada.setPreferredSize(new Dimension(300,40));

        JButton boton = new JButton("Convertir");

        JLabel salida = new JLabel();
        salida.setPreferredSize(new Dimension(300,40));

        boton.addActionListener(e -> {
            salida.setText(ConvertirTituloMayuscula.convertirAMayuscula(entrada.getText()));
        });
        JFrame gui = new JFrame("Pantalla covierte titulo a Mayusculas");
        gui.setLayout(new FlowLayout());
        gui.add(entrada);
        gui.add(boton);
        gui.add(salida);
        gui.pack();
        gui.setLocationRelativeTo(null);

        return gui;
    }


}
