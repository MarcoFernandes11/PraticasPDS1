package AtividadesLista2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class Questao1 extends JFrame {

	private JPanel contentPane;
	private JTextField Numeros;
	private JTextField Resultados;

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
		Resultados.setEditable(false);
		
		
		
		
		
        
		JButton btnNewButton = new JButton("Exibir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(Resultados.getText());
				
			}
		});
		btnNewButton.setBounds(318, 153, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int tam = 10;        
		        int[] array = new int[tam];
		        
		        for(int i = 0; i < tam;i++){
		        	int valor = Integer.parseInt(Resultados.getText());
		        	array[i] = valor;
		        	
		        }
				
				
			}
		});
		btnNewButton_1.setBounds(10, 153, 106, 23);
		contentPane.add(btnNewButton_1);
	}
}
