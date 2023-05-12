package edu.diego.arzate.torres.retoFinal.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Juego extends JFrame {

public Juego() {
  JLabel label = new JLabel();
  Border border = BorderFactory.createLineBorder(new Color(192,128,255),3);
  label.setText("********************  "+"Bienvenido a la Villa Hechizada"+"  ********************");
  label.setForeground(new Color(230, 230, 230));
  label.setFont(new Font("MV Boli",Font.BOLD,27));
  label.setHorizontalAlignment(JLabel.CENTER);
  label.setVerticalAlignment(JLabel.TOP);
  label.setBorder(border);
  this.add(label);



  this.setTitle("La villa Hechizada");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setResizable(false);
  this.setSize(940, 840);
  this.setVisible(true);
  this.getContentPane().setBackground(new Color(39, 39, 39));
  ImageIcon image = new ImageIcon("edu/diego/arzate/torres/retoFinal/ui/mi-loco-dale-pa-fuera.png");
  this.setIconImage(image.getImage());
}
}