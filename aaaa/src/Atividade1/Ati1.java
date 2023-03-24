package Atividade1;

import javax.swing.JOptionPane;

public class Ati1 {

    public static void main(String[] args) {
        
        double PL = Double.valueOf(JOptionPane.showInputDialog(null, 
                "Digite o custo por litro", 
                    "Preço Litro", 
                    JOptionPane.QUESTION_MESSAGE));
        
        String qntP = 
        JOptionPane.showInputDialog( null, 
                "Digite quantos litros foram abastecidos",
                      "Litros abastecidos",
                        JOptionPane.QUESTION_MESSAGE);
        
        int QNT = Integer.parseInt(qntP);
        
        double pag = QNT * PL;
        
        JOptionPane.showMessageDialog(null, "Total a pagar: " + "R$" + pag);
    }

        
}
