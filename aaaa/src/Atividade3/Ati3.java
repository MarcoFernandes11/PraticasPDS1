package Atividade3;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ati3 {

    public static void main(String[] args) {
        
        int tam = 3;        
        double [] a = new double[tam];
        
        for(int i = 0; i < tam;i++){
            String elem = JOptionPane.showInputDialog(null, 
                    "Insira a " + (i+1) + " Nota");
                        
            double element = Double.valueOf(elem);
            a[i] = element;        
        }

            double calc = a[0] + a[1] + a[2];
            double media = calc/3;
            
            String msg = "";
            
             if(media >= 6){
                 msg = "Aprovado(a)";
             }else if(media >= 4){
                 msg = "Recuperação";
             }else if(media < 4){
                 msg = "Reprovado(a)";
             }
            
            DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        JOptionPane.showMessageDialog(null, 
                "Situação: " + msg + " Nota:" + numberFormat.format(media));
    }
}
