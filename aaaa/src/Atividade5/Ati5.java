package Atividade5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ati5 {
    
    public static void main(String[] args) {
        
         JFrame flame = new JFrame("Atividade 5");
         flame.setSize(1280, 720);
         flame.setLocation(350,150);
         flame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         flame.setUndecorated(false);
         flame.setVisible(true);  
         
         JLabel labelNum1 = new JLabel("Número 1:");
         labelNum1.setBounds(397, 56, 200, 30);

         flame.setVisible(true);  

         JTextField TxtNum1 = new JTextField();
         TxtNum1.setVisible(true);
         TxtNum1.setBounds(397, 86, 200, 40);
         TxtNum1.setSize(200, 40);
         
         JLabel TxtNum2 = new JLabel("Número 2:");
         TxtNum2.setBounds(617, 56, 200, 30);
         
         JTextField txtNum2 = new JTextField();
         txtNum2.setVisible(true);
         txtNum2.setBounds(617, 86, 200, 40);
         txtNum2.setSize(200, 40);
         
         JLabel labelNum3 = new JLabel("Número 3:");
         labelNum3.setBounds(840, 56, 200, 30);
         
         JTextField txtNum3 = new JTextField();
         txtNum3.setVisible(true);
         txtNum3.setBounds(840, 86, 200, 40);
         txtNum3.setSize(200, 40);
         flame.getContentPane().setLayout(null);
         
         JButton btnResultado = new JButton("Resultado");
         flame.getContentPane().add(btnResultado);
       
         btnResultado.setSize(161, 47);
         btnResultado.setLocation(637,157);    
            
            btnResultado.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(TxtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                    int num3 = Integer.parseInt(txtNum3.getText());
                    
                    String result = "";

                    if(num1 == num2 && num2 == num3 && num1 == num3 && num2 == num3){
                        result = "Triângulo equilátero";
                    }else if(num1 == num2){
                        result = "Triângulo isóceles";
                    }else if(num2 == num3){
                        result = "Triângulo isóceles";
                    }else if(num1 == num3){
                        result = "Triângulo isóceles";
                    }else if(num1 != num2 && num2 != num3 && num1 != num3 && num2 != num3){
                        result = "Triângulo escaleno";
                    }
                        
                                        
                    JOptionPane.showMessageDialog(null, result);
                }
            });
            
            flame.getContentPane().add(labelNum1);
            flame.getContentPane().add(TxtNum1);
            flame.getContentPane().add(TxtNum2);
            flame.getContentPane().add(txtNum2);
            flame.getContentPane().add(labelNum3);
            flame.getContentPane().add(txtNum3);
            flame.getContentPane().add(btnResultado);

    }
    
}
