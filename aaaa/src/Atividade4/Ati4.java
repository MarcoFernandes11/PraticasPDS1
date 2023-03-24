package Atividade4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class Ati4 {
	private static JTextField txtNum1;
    
    public static void main(String[] args) {
        
         JFrame flame = new JFrame("Atividade 4");
         flame.setSize(1280, 720);
         flame.setLocation(350,150);
         flame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
         flame.setUndecorated(false);
         flame.setVisible(true);
         
         JLabel labelNum1 = new JLabel("Número 1:");
         labelNum1.setBounds(514, 294, 194, 14);

         flame.setVisible(true);  

         txtNum1 = new JTextField();
         txtNum1.setVisible(true);
         txtNum1.setBounds(514, 312, 194, 28);
         txtNum1.setSize(200, 40);
         
         JLabel labelNum2 = new JLabel("Número 2:");
         labelNum2.setBounds(748, 294, 50, 14);
         
         JTextField txtNum2 = new JTextField();
         txtNum2.setVisible(true);
         txtNum2.setBounds(748, 312, 7, 28);
         txtNum2.setSize(200, 40);
         flame.getContentPane().setLayout(null);
            
         flame.getContentPane().add(labelNum1);
         flame.getContentPane().add(txtNum1);
         flame.getContentPane().add(labelNum2);
         flame.getContentPane().add(txtNum2);
         
         
         JButton btnSubtrair = new JButton("Subtrair");
         flame.getContentPane().add(btnSubtrair);
         btnSubtrair.setSize(129, 23);
         btnSubtrair.setLocation(669,465);
         
            btnSubtrair.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
         int num1 = Integer.parseInt(txtNum1.getText());
         int num2 = Integer.parseInt(txtNum2.getText());
                // Calculate sum
         int result = num1 - num2;
         
         
         JOptionPane.showMessageDialog(null, result);
                }
            });
         
         JButton btnSomar = new JButton("Somar");
         flame.getContentPane().add(btnSomar);
         btnSomar.setSize(129, 23);
         btnSomar.setLocation(669,431);     
         
         JButton btnDividir = new JButton("Dividir");
         btnDividir.setBounds(669, 363, 129, 23);
         flame.getContentPane().add(btnDividir);
         
         JButton btnMult = new JButton("Multiplicar");
         btnMult.setBounds(669, 397, 129, 23);
         flame.getContentPane().add(btnMult);
         
            btnMult.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                // Calculate sum
                    int result = num1 * num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
         
            btnDividir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                // Calculate sum
                    int result = num1 / num2;
                    
                    
                    JOptionPane.showMessageDialog(null, result);
                }
            });
         
         btnSomar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 int num1 = Integer.parseInt(txtNum1.getText());
                 int num2 = Integer.parseInt(txtNum2.getText());
             // Calculate sum
                 int result = num1 + num2;
                 
                 
                 JOptionPane.showMessageDialog(null, result);
             }
         });
    }
}
