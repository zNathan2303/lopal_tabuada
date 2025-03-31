package br.sp.senai.jandira.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar o programa após clicar no X
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		// Criar label para inserir no JFrame
		JLabel lblMultiplicando = new JLabel(); // boa prática colocar label ou lbl no começo do nome
		lblMultiplicando.setText("Multiplicando:"); // coloca o text dentro do label
		lblMultiplicando.setBounds(20, 10, 150, 30);
		
		// Criar textField para inserir no JFrame
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 150, 30);
		
		// MinMultiplicador
		JLabel lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. multiplicador:");
		lblMinMultiplicador.setBounds(20, 50, 150, 30);
		
		JTextField txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(180, 50, 150, 30);
		
		// MaxMultiplicador
		JLabel lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx, multiplicador:");
		lblMaxMultiplicador.setBounds(20, 90, 150, 30);
		
		JTextField txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(180, 90, 150, 30);
		
		// Criar botão para inserir no JFrame
		JButton buttonCalcular = new JButton(); // button ou btn no começo para boa prática
		buttonCalcular.setText("Calcular");
		
		// Conteúdos que estão sendo colocados dentro do painel de conteudo
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(lblMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		
		
		tela.setVisible(true);
		
	}

}
