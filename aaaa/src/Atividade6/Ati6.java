package Atividade6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ati6 {
    
    public static void main(String[] args) {
        
         JFrame flame = new JFrame("Atividade 6");
         flame.setSize(1280, 720);
         flame.setLocation(350,150);
         flame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         flame.setUndecorated(false);
         flame.setVisible(true); 
         
         JLabel labelNota1 = new JLabel("Nota 1:");
         labelNota1.setBounds(430, 276, 200, 24);
         


         flame.setVisible(true);  

         JTextField txt1 = new JTextField();
         txt1.setVisible(true);
         txt1.setBounds(430, 304, 200, 40);
         txt1.setSize(200, 40);
         
         JLabel labelNota2 = new JLabel("Nota 2:");
         labelNota2.setBounds(653, 276, 200, 24);
         
         JTextField txt2 = new JTextField();
         txt2.setVisible(true);
         txt2.setBounds(653, 304, 200, 40);
         txt2.setSize(200, 40);
         
         JLabel labelNota3 = new JLabel("Nota 3:");
         labelNota3.setBounds(873, 276, 200, 24);
         
         JTextField txt3 = new JTextField();
         txt3.setVisible(true);
         txt3.setBounds(873, 304, 200, 40);
         txt3.setSize(200, 40);
         
         JLabel labelNome = new JLabel("Nome: ");
         labelNome.setBounds(430, 161, 200, 24);
         
         JTextField txtnome = new JTextField();
         txtnome.setVisible(true);
         txtnome.setBounds(430, 187, 200, 40);
         txtnome.setSize(200, 40);
         
         JButton btnCalcular = new JButton("Calcular");
            btnCalcular.setSize(133, 45);
            btnCalcular.setLocation(689,392);     
            
            btnCalcular.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txt1.getText());
                    int num2 = Integer.parseInt(txt2.getText());
                    int num3 = Integer.parseInt(txt3.getText());
                    
                    String nom = txtnome.getText();
                    
                        int res = (num1 + num2 + num3)/3;
                        
                    
                    JOptionPane.showMessageDialog(null, nom + ": " + res);
                }
            });
            flame.getContentPane().setLayout(null);
            
            
            flame.getContentPane().add(labelNota1);
            flame.getContentPane().add(txt1);
            flame.getContentPane().add(labelNota2);
            flame.getContentPane().add(txt2);
            flame.getContentPane().add(labelNota3);
            flame.getContentPane().add(txt3);
            flame.getContentPane().add(labelNome);
            flame.getContentPane().add(txtnome);
            flame.getContentPane().add(btnCalcular);
    }
    
}
