package AtividadesLista2.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.Region;

import Reniao.num;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class Questao1 extends JFrame {

	
	private JPanel contentPane;
	private JTextField Numeros;
	private JTextField Resultados;
	

	private  ArrayList<num> listaDeNum = new ArrayList<>(); 
		
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao1 frame = new Questao1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Questao1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escreva um Numero:");
		lblNewLabel.setBounds(10, 25, 106, 14);
		contentPane.add(lblNewLabel);
		
		Numeros = new JTextField();
		Numeros.setBounds(10, 40, 414, 20);
		contentPane.add(Numeros);
		Numeros.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(10, 72, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		Resultados = new JTextField();
		Resultados.setBounds(10, 97, 414, 20);
		contentPane.add(Resultados);
		Resultados.setColumns(10);
		Resultados.setEditable(true);
		Resultados.setEnabled(true);
		
		
		
		JButton Cadatrar = new JButton("Cadastrar");
		Cadatrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num2 = 0;
				
				
				for(int i = 0; i<10;i++) {
				num2 = Integer.parseInt(Numeros.getText());
				
				num Nume = new num();
				
				Nume.setNum1(num2);
				
				if(num2 % 2==0) {
				listaDeNum.add(Nume);
				i++;
				}
				
				}
				
		        }
				
				
		});
		Cadatrar.setBounds(10, 153, 106, 23);
		contentPane.add(Cadatrar);
		
		
        
		JButton Exibir = new JButton("Exibir");
		Exibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0; i<10;i++) {
				Resultados.setText(listaDeNum.toString());
				i++;
				}
			}
				
		});
		Exibir.setBounds(318, 153, 106, 23);
		contentPane.add(Exibir);
		
		
	}

	protected void JOptionPane() {
		// TODO Auto-generated method stub
		
	}
}
