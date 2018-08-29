package bolsa.valores;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import connection.ConnectionFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DropMode;

public class LayoutInserir {

	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;

	
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutInserir window = new LayoutInserir();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LayoutInserir() {
		initialize();
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 748, 434);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setForeground(new Color(0, 0, 128));
		lblCdigo.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblCdigo.setBounds(10, 93, 67, 20);
		frame.getContentPane().add(lblCdigo);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setForeground(new Color(0, 0, 128));
		lblEmpresa.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblEmpresa.setBounds(10, 164, 73, 20);
		frame.getContentPane().add(lblEmpresa);
		
		JLabel lblCotao = new JLabel("Cota\u00E7\u00E3o:");
		lblCotao.setForeground(new Color(0, 0, 128));
		lblCotao.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblCotao.setBounds(10, 129, 73, 18);
		frame.getContentPane().add(lblCotao);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setForeground(new Color(0, 0, 128));
		lblData.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblData.setBounds(10, 201, 46, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblSegmento = new JLabel("Segmento:");
		lblSegmento.setForeground(new Color(0, 0, 128));
		lblSegmento.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblSegmento.setBounds(10, 226, 138, 23);
		frame.getContentPane().add(lblSegmento);
		
		JLabel lblNDeAes = new JLabel("N\u00BA de A\u00E7\u00F5es:");
		lblNDeAes.setForeground(new Color(0, 0, 128));
		lblNDeAes.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblNDeAes.setBounds(10, 260, 99, 16);
		frame.getContentPane().add(lblNDeAes);
		
		JLabel lblValorDeMercado = new JLabel("Valor de mercado:");
		lblValorDeMercado.setForeground(new Color(0, 0, 128));
		lblValorDeMercado.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblValorDeMercado.setBounds(10, 288, 138, 14);
		frame.getContentPane().add(lblValorDeMercado);
		
		JLabel lblDvida = new JLabel("D\u00EDvida:");
		lblDvida.setForeground(new Color(0, 0, 128));
		lblDvida.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblDvida.setBounds(404, 96, 67, 14);
		frame.getContentPane().add(lblDvida);
		
		JLabel lblRoe = new JLabel("ROE:");
		lblRoe.setForeground(new Color(0, 0, 128));
		lblRoe.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblRoe.setBounds(404, 233, 46, 16);
		frame.getContentPane().add(lblRoe);
		
		JLabel lblLucroLquido = new JLabel("Lucro L\u00EDquido:");
		lblLucroLquido.setForeground(new Color(0, 0, 128));
		lblLucroLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblLucroLquido.setBounds(404, 205, 138, 14);
		frame.getContentPane().add(lblLucroLquido);
		
		JLabel lblDigiteOsDados = new JLabel("Digite os dados:");
		lblDigiteOsDados.setForeground(new Color(0, 0, 128));
		lblDigiteOsDados.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 28));
		lblDigiteOsDados.setBounds(238, 11, 275, 73);
		frame.getContentPane().add(lblDigiteOsDados);
		
		JLabel lblAtivoTotal = new JLabel("Ativo total:");
		lblAtivoTotal.setForeground(new Color(0, 0, 128));
		lblAtivoTotal.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblAtivoTotal.setBounds(404, 136, 99, 14);
		frame.getContentPane().add(lblAtivoTotal);
		
		JLabel lblDivpat = new JLabel("DIV/PAT:");
		lblDivpat.setForeground(new Color(0, 0, 128));
		lblDivpat.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblDivpat.setBounds(404, 288, 80, 20);
		frame.getContentPane().add(lblDivpat);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(245, 255, 250));
		textField_3.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_3.setForeground(new Color(0, 0, 128));
		textField_3.setColumns(10);
		textField_3.setBounds(106, 260, 171, 20);
		frame.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(245, 255, 250));
		textField_5.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_5.setForeground(new Color(0, 0, 128));
		textField_5.setColumns(10);
		textField_5.setBounds(461, 92, 261, 20);
		frame.getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(245, 255, 250));
		textField_7.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_7.setForeground(new Color(0, 0, 128));
		textField_7.setColumns(10);
		textField_7.setBounds(491, 132, 231, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(245, 255, 250));
		textField_8.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_8.setForeground(new Color(0, 0, 128));
		textField_8.setColumns(10);
		textField_8.setBounds(556, 165, 166, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(245, 255, 250));
		textField_9.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_9.setForeground(new Color(0, 0, 128));
		textField_9.setColumns(10);
		textField_9.setBounds(517, 201, 205, 20);
		frame.getContentPane().add(textField_9);
		
		textField_12 = new JTextField();
		textField_12.setBackground(new Color(245, 255, 250));
		textField_12.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_12.setForeground(new Color(0, 0, 128));
		textField_12.setColumns(10);
		textField_12.setBounds(76, 130, 201, 20);
		frame.getContentPane().add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setBackground(new Color(245, 255, 250));
		textField_14.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_14.setForeground(new Color(0, 0, 128));
		textField_14.setColumns(10);
		textField_14.setBounds(86, 163, 191, 20);
		frame.getContentPane().add(textField_14);
	
		textField_17 = new JTextField();
		textField_17.setBackground(new Color(245, 255, 250));
		textField_17.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_17.setForeground(new Color(0, 0, 128));
		textField_17.setColumns(10);
		textField_17.setBounds(89, 226, 188, 20);
		frame.getContentPane().add(textField_17);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 255, 250));
		textField_1.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_1.setForeground(new Color(0, 0, 128));
		
		
		textField_1.setColumns(10);
		textField_1.setBounds(76, 95, 201, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(0, 0, 128));
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 12));
		
		btnSalvar.setBounds(597, 341, 87, 31);
		frame.getContentPane().add(btnSalvar);
		
		JLabel lblPatrimnioLquido = new JLabel("Patrim\u00F4nio L\u00EDquido:");
		lblPatrimnioLquido.setForeground(new Color(0, 0, 128));
		lblPatrimnioLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblPatrimnioLquido.setBounds(404, 164, 158, 23);
		frame.getContentPane().add(lblPatrimnioLquido);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(442, 260, 115, 16);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(0, 0, 139));
		label_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_2.setBounds(485, 288, 61, 20);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(new Color(255, 140, 0));
		label_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_3.setBounds(447, 231, 115, 16);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 255, 250));
		textField.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField.setForeground(new Color(0, 0, 128));
		
		
		textField.setColumns(10);
		textField.setBounds(148, 287, 129, 20);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Calcular");
		button.setForeground(new Color(0, 0, 128));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_5.getText().equals("")&& textField_8.getText().equals("")) {
					label_2.setText("");
				}else {
				double div, patL = 0 ;
				div = Double.parseDouble((textField_5.getText()));
				patL = Double.parseDouble((textField_8.getText()));
				double divpat = div / patL;
				String valor = String.format("%.2f", divpat);
				
				label_2.setText(valor);
				if(divpat > 0 && divpat <= 25 ) {
					label_2.setForeground(new Color(0, 0, 255));
				}else if(divpat > 25 && divpat <= 50) {
					label_2.setForeground(new Color(255, 160, 0));
				}else if(divpat > 50 ) {
					label_2.setForeground(new Color(255, 0, 0));
				}
				label_2.setText(valor);
				}
			}
		});
		button.setBounds(565, 288, 87, 20);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Calcular");
		button_1.setForeground(new Color(0, 0, 139));
		
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_9.getText().equals("")&& textField_8.getText().equals("")) {
					label_3.setText("");
				}else {
			double lLiqui, patL;
			lLiqui = Double.parseDouble((textField_9.getText()));
			patL = Double.parseDouble((textField_8.getText()));
			double roe = (lLiqui/patL) *100;
			String valor = String.format("%.1f", roe )+ "%";
			label_3.setText(valor);
			if(roe >= 20) {
				label_3.setForeground(new Color(0, 0, 255));
			}else if(roe < 20 && roe > 10) {
				label_3.setForeground(new Color(255, 160, 0));
			}else if(roe < 10 ) {
				label_3.setForeground(new Color(255, 0, 0));
			}
			label_3.setText(valor);
			}
			}
				
		});
		button_1.setBounds(565, 230, 87, 21);
		frame.getContentPane().add(button_1);
		
		JLabel label_1 = new JLabel("P/L:");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		label_1.setBounds(404, 258, 46, 20);
		frame.getContentPane().add(label_1);
		
		JButton button_2 = new JButton("Calcular");
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")&& textField_9.getText().equals("")) {
					label.setText("");
				}else {
				double vmer, lLiqui;
				vmer = Double.parseDouble(textField.getText());
				lLiqui = Double.parseDouble((textField_9.getText()));
				double pl = vmer / lLiqui;
				String valor = String.format("%.2f", pl);
				label.setText(valor);
				if(pl >= 0 && pl <= 6 ) {
					label.setForeground(new Color(0, 0, 255));
				}else if(pl > 6 && pl <= 12) {
					label.setForeground(new Color(255, 160, 0));
				}else if(pl < 0 && pl > 12 ) {
					label.setForeground(new Color(255, 0, 0));
				}
				label.setText(valor);
				}
				}		
		});
		button_2.setBounds(565, 260, 87, 21);
		frame.getContentPane().add(button_2);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(245, 255, 250));
		textField_2.setForeground(new Color(0, 0, 128));
		textField_2.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setDocument(new JTextFieldLimit(2));
		textField_2.setBounds(50, 198, 31, 20);
		frame.getContentPane().add(textField_2);
		
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(245, 255, 250));
		textField_4.setForeground(new Color(0, 0, 128));
		textField_4.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(96, 198, 31, 20);
		textField_4.setDocument(new JTextFieldLimit(2));
		frame.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(245, 255, 250));
		textField_6.setForeground(new Color(0, 0, 128));
		textField_6.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(140, 198, 46, 20);
		textField_6.setDocument(new JTextFieldLimit(4));
		frame.getContentPane().add(textField_6);
		
		JLabel label_4 = new JLabel("/");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_4.setBounds(86, 201, 5, 18);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("/");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_5.setBounds(132, 201, 5, 14);
		frame.getContentPane().add(label_5);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField_1, textField_12, textField_14, textField_2, textField_4, textField_6, textField_3, textField_5, textField_7, textField_8, textField_9, textField_17, btnSalvar, textField, button, button_1, button_2}));
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane(), textField_1, textField_12, textField_14, textField_2, textField_4, textField_6, textField_17, textField_3, textField, textField_7, textField_5, textField_8, textField_9, button_1, button_2, button, btnSalvar}));
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				
				
				
				if ((textField_14.getText().equals("") && textField.getText().equals("")) && (textField_17.getText().equals("") && textField_2.getText().equals("")) && (textField_1.getText().equals("") && textField_3.getText().equals(""))&&
				(textField_12.getText().equals("") && textField_5.getText().equals("")) && (textField_7.getText().equals("") && textField_8.getText().equals("")) && (textField_9.getText().equals("")&& textField_4.getText().equals("") && textField_6.getText().equals("")) ) {
					
					JOptionPane.showMessageDialog(null, "Campo(s) incompleto(s)", "Erro", JOptionPane.ERROR_MESSAGE);
					
				}else {
					String emp, seg ,dat, datA, datM, datD, cod ="";
					double vmer, nda, cot, div, ati, patL, lLiqui = 0;
					
					emp = textField_14.getText();
					vmer = Double.parseDouble(textField.getText());
					seg = textField_17.getText();
					datD = textField_2.getText();
					datM = textField_4.getText();
					datA = textField_6.getText();
					cod = textField_1.getText();
					nda = Double.parseDouble((textField_3.getText()));
					cot = Double.parseDouble((textField_12.getText()));
					div = Double.parseDouble((textField_5.getText()));
					ati = Double.parseDouble((textField_7.getText()));
					patL = Double.parseDouble((textField_8.getText()));
					lLiqui = Double.parseDouble((textField_9.getText()));
					dat = datA +"-"+ datM +"-"+ datD;
					JOptionPane.showMessageDialog(null, "Dados registrados", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					conf.inserir(cod, cot, emp, dat, seg, nda,vmer, div, ati, patL, lLiqui);
				}
				
			}
		});
		
		
	}
	static class JTextFieldLimit extends PlainDocument {

		private static final long serialVersionUID = 1L;
	private int limit;
	 JTextFieldLimit(int limit) {
	   super();
	   this.limit = limit;
	 }

	 JTextFieldLimit(int limit, boolean upper) {
	   super();
	   this.limit = limit;
	 }

	 public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	   if (str == null)
	     return;

	   if ((getLength() + str.length()) <= limit) {
	     super.insertString(offset, str, attr);
	   }
	 }
}
}