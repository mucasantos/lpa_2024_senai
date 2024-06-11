package basic;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaComissao implements ActionListener{

	public static void main(String[] args) {
		// TODO Autiko-generated method stub
		new TelaComissao();
	}
	
	public TelaComissao()  {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2,20,10));
		
		//Componentes Texto
		JLabel textNome = new JLabel("Nome do funcionário:");
		JLabel textVendas = new JLabel("Total de vendas:");
		JLabel textComissao = new JLabel("Comissão:");
		JLabel textBranco = new JLabel("");
		
		JLabel textValorComissao = new JLabel("Valor da Comissão:");
		JLabel textSalario = new JLabel("Salário:");
		JLabel textSalarioComissao = new JLabel("Salário + Comissão:");

		//Componentes input
		JTextField fieldNome = new JTextField(15);
		JTextField fieldVendas = new JTextField(15);
		JTextField fieldComissao = new JTextField(15);
		JTextField fieldSalario = new JTextField(15);
		JTextField fieldComissaoSalario = new JTextField(15);

		//Componentes JBRadioButton
		JRadioButton radioUm = new JRadioButton("1%");
		JRadioButton radioDois = new JRadioButton("2%");
		JRadioButton radioTres = new JRadioButton("3%");
		JRadioButton radioQuatro = new JRadioButton("4%");
		
		JButton btnCalcular = new JButton("Calcular");
		JButton btnCancel = new JButton("Cancelar");
		
		panel.add(textNome);
		panel.add(fieldNome);
		panel.add(textVendas);
		panel.add(fieldVendas);
		panel.add(textComissao);
		panel.add(textBranco);
		
		panel.add(radioUm);
		panel.add(radioDois);
		panel.add(radioTres);
		panel.add(radioQuatro);
		
		panel.add(textValorComissao);
		panel.add(fieldComissao);
		panel.add(textSalario);
		panel.add(fieldSalario);
		panel.add(textSalarioComissao);
		panel.add(fieldComissaoSalario);
		
		panel.add(btnCalcular);
		
		frame.add(panel);
		
		frame.setSize(400,400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		btnCalcular.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");

	}

}
