package Atividade2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ati2 {

    public static void main(String[] args) {
        
        int tam = 10;        
        int[] array = new int[tam];
        
        for(int i = 0; i < tam;i++){
            String elem = JOptionPane.showInputDialog(null, 
                    "Insira o elemento " + (i+1) + ":" + " (Apenas números)");
                        
            int element = Integer.parseInt(elem);
            array[i] = element;
            
            
        }
        
        JOptionPane.showMessageDialog(null, 
                "Resultado: " + Arrays.toString(array));
    }
    
}
