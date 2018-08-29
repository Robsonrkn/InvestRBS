package bolsa.valores;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import connection.ConnectionFactory;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JRadioButton;

public class LayoutEditar {

	private JFrame frame;
	private JTextField textField;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private ResultSet rs;
	private JTextField textField_13;
	private JTextField textField_14;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEditar window = new LayoutEditar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LayoutEditar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 839, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setVisible(false);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setForeground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(245, 255, 250));
		textField_1.setForeground(new Color(0, 0, 139));
		textField_1.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Encontrar por:");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		
		JRadioButton radioEmp = new JRadioButton("Empresa");
		radioEmp.setBackground(new Color(230, 230, 250));
		radioEmp.setForeground(new Color(0, 0, 128));
		radioEmp.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JRadioButton radioCod = new JRadioButton("C\u00F3digo");
		radioCod.setBackground(new Color(230, 230, 250));
		radioCod.setForeground(new Color(0, 0, 128));
		radioCod.setFont(new Font("Arial", Font.PLAIN, 12));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(lblNewLabel_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(radioCod)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioEmp))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1)))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(41)))
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(75)
							.addComponent(lblNewLabel_2)
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(radioEmp)
								.addComponent(radioCod))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 35, 67, 22);
		panel.add(lblNewLabel);
		
		JLabel lblCotao = new JLabel("Empresa");
		lblCotao.setForeground(new Color(0, 0, 128));
		lblCotao.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblCotao.setBounds(10, 149, 67, 22);
		panel.add(lblCotao);
		
		JLabel lblltimoBalano = new JLabel("Valor de mercado");
		lblltimoBalano.setForeground(new Color(0, 0, 128));
		lblltimoBalano.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblltimoBalano.setBounds(360, 35, 131, 22);
		panel.add(lblltimoBalano);
		
		JLabel lblSegmento = new JLabel("Segmento");
		lblSegmento.setForeground(new Color(0, 0, 128));
		lblSegmento.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblSegmento.setBounds(360, 279, 90, 22);
		panel.add(lblSegmento);
		
		JLabel lblNDeAes = new JLabel("Cota\u00E7\u00E3o");
		lblNDeAes.setForeground(new Color(0, 0, 128));
		lblNDeAes.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblNDeAes.setBounds(10, 96, 100, 20);
		panel.add(lblNDeAes);
		
		JLabel lblValorDeMercado = new JLabel("Data");
		lblValorDeMercado.setForeground(new Color(0, 0, 128));
		lblValorDeMercado.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblValorDeMercado.setBounds(10, 211, 40, 22);
		panel.add(lblValorDeMercado);
		
		JLabel lblDvida = new JLabel("D\u00EDvida");
		lblDvida.setForeground(new Color(0, 0, 128));
		lblDvida.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblDvida.setBounds(10, 279, 56, 22);
		panel.add(lblDvida);
		
		JLabel lblAtivoTotal = new JLabel("Ativo Total");
		lblAtivoTotal.setForeground(new Color(0, 0, 128));
		lblAtivoTotal.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblAtivoTotal.setBounds(10, 342, 100, 22);
		panel.add(lblAtivoTotal);
		
		JLabel lblLucroLquido = new JLabel("Lucro L\u00EDquido");
		lblLucroLquido.setForeground(new Color(0, 0, 128));
		lblLucroLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblLucroLquido.setBounds(362, 149, 107, 22);
		panel.add(lblLucroLquido);
		
		JLabel lblPatrimnioLquido_1 = new JLabel("Patrim\u00F4nio L\u00EDquido");
		lblPatrimnioLquido_1.setForeground(new Color(0, 0, 128));
		lblPatrimnioLquido_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblPatrimnioLquido_1.setBounds(360, 211, 158, 22);
		panel.add(lblPatrimnioLquido_1);
		
		JLabel lblPatrimnioLquido = new JLabel("N\u00BA de a\u00E7\u00F5es");
		lblPatrimnioLquido.setForeground(new Color(0, 0, 128));
		lblPatrimnioLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		lblPatrimnioLquido.setBounds(360, 95, 90, 22);
		panel.add(lblPatrimnioLquido);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(65, 105, 225));
		btnModificar.setForeground(new Color(224, 255, 255));
		btnModificar.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		btnModificar.setBounds(68, 37, 89, 23);
		panel.add(btnModificar);
		
		JButton button = new JButton("Modificar");
		button.setBackground(new Color(65, 105, 225));
		button.setForeground(new Color(224, 255, 255));
		button.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		button.setBounds(71, 94, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Modificar");
		button_1.setBackground(new Color(65, 105, 225));
		button_1.setForeground(new Color(224, 255, 255));
		button_1.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_1.setBounds(77, 148, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Modificar");
		button_2.setBackground(new Color(65, 105, 225));
		button_2.setForeground(new Color(224, 255, 255));
		button_2.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_2.setBounds(56, 210, 89, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Modificar");
		button_3.setBackground(new Color(65, 105, 225));
		button_3.setForeground(new Color(224, 255, 255));
		button_3.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_3.setBounds(68, 278, 89, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Modificar");
		button_4.setBackground(new Color(65, 105, 225));
		button_4.setForeground(new Color(224, 255, 255));
		button_4.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_4.setBounds(495, 34, 89, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("Modificar");
		button_5.setBackground(new Color(65, 105, 225));
		button_5.setForeground(new Color(224, 255, 255));
		button_5.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_5.setBounds(450, 94, 89, 23);
		panel.add(button_5);
		
		JButton button_6 = new JButton("Modificar");
		button_6.setBackground(new Color(65, 105, 225));
		button_6.setForeground(new Color(224, 255, 255));
		button_6.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_6.setBounds(473, 148, 89, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Modificar");
		button_7.setBackground(new Color(65, 105, 225));
		button_7.setForeground(new Color(224, 255, 255));
		button_7.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_7.setBounds(509, 210, 89, 23);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Modificar");
		button_8.setBackground(new Color(65, 105, 225));
		button_8.setForeground(new Color(224, 255, 255));
		button_8.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_8.setBounds(102, 344, 89, 23);
		panel.add(button_8);
		
		JButton button_9 = new JButton("Modificar");
		button_9.setBackground(new Color(65, 105, 225));
		button_9.setForeground(new Color(224, 255, 255));
		button_9.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_9.setBounds(439, 278, 89, 23);
		panel.add(button_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 68, 181, 17);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(46, 139, 87));
		label.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label.setBounds(10, 121, 181, 17);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(46, 139, 87));
		label_1.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_1.setBounds(10, 182, 181, 17);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(46, 139, 87));
		label_2.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_2.setBounds(10, 244, 181, 17);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(new Color(46, 139, 87));
		label_3.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_3.setBounds(360, 183, 214, 17);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(new Color(46, 139, 87));
		label_4.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_4.setBounds(360, 121, 181, 17);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setForeground(new Color(46, 139, 87));
		label_5.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_5.setBounds(360, 312, 202, 17);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(new Color(46, 139, 87));
		label_6.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_6.setBounds(360, 244, 245, 17);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setForeground(new Color(46, 139, 87));
		label_7.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_7.setBounds(10, 375, 163, 17);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setForeground(new Color(46, 139, 87));
		label_8.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_8.setBounds(10, 312, 156, 17);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setForeground(new Color(46, 139, 87));
		label_9.setFont(new Font("Swis721 BT", Font.BOLD, 14));
		label_9.setBounds(360, 68, 245, 17);
		panel.add(label_9);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setForeground(new Color(224, 255, 255));
		btnNewButton_1.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		btnNewButton_1.setBounds(173, 63, 77, 23);
		panel.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 128));
		textField_2.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_2.setBounds(68, 38, 182, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 0, 128));
		textField_3.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_3.setBounds(71, 98, 181, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_10 = new JButton("Salvar");
		button_10.setBackground(new Color(65, 105, 225));
		button_10.setForeground(new Color(224, 255, 255));
		button_10.setFont(new Font("Swis721 BT", Font.BOLD, 12));
	

		button_10.setBounds(173, 121, 77, 23);
		panel.add(button_10);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 0, 128));
		textField_4.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(87, 152, 163, 20);
		panel.add(textField_4);
		
		JButton button_11 = new JButton("Salvar");
		button_11.setBackground(new Color(65, 105, 225));
		button_11.setForeground(new Color(224, 255, 255));
		button_11.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_11.setBounds(173, 179, 77, 23);
		panel.add(button_11);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 0, 128));
		textField_5.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(167, 211, 67, 20);
		textField_5.setDocument(new JTextFieldLimit(4));
		panel.add(textField_5);
		
		JButton button_12 = new JButton("Salvar");
		button_12.setBackground(new Color(65, 105, 225));
		button_12.setForeground(new Color(224, 255, 255));
		button_12.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_12.setBounds(173, 238, 77, 23);
		panel.add(button_12);
		
		textField_6 = new JTextField();
		textField_6.setForeground(new Color(0, 0, 128));
		textField_6.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(68, 282, 184, 20);
		panel.add(textField_6);
		
		JButton button_13 = new JButton("Salvar");
		button_13.setBackground(new Color(65, 105, 225));
		button_13.setForeground(new Color(224, 255, 255));
		button_13.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_13.setBounds(173, 306, 77, 23);
		panel.add(button_13);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(0, 0, 128));
		textField_7.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(96, 345, 154, 20);
		panel.add(textField_7);
		
		JButton button_14 = new JButton("Salvar");
		button_14.setBackground(new Color(65, 105, 225));
		button_14.setForeground(new Color(224, 255, 255));
		button_14.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_14.setBounds(173, 369, 77, 23);
		panel.add(button_14);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(0, 0, 128));
		textField_8.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBounds(495, 38, 158, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 0, 128));
		textField_9.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBounds(451, 98, 202, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(0, 0, 128));
		textField_10.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBounds(477, 152, 176, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setForeground(new Color(0, 0, 128));
		textField_11.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_11.setColumns(10);
		textField_11.setBounds(509, 214, 144, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setForeground(new Color(0, 0, 128));
		textField_12.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_12.setColumns(10);
		textField_12.setBounds(439, 282, 214, 20);
		panel.add(textField_12);
		
		JButton button_15 = new JButton("Salvar");
		button_15.setBackground(new Color(65, 105, 225));
		button_15.setForeground(new Color(224, 255, 255));
		button_15.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_15.setBounds(576, 63, 77, 23);
		panel.add(button_15);
		
		JButton button_16 = new JButton("Salvar");
		button_16.setBackground(new Color(65, 105, 225));
		button_16.setForeground(new Color(224, 255, 255));
		button_16.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_16.setBounds(576, 115, 77, 23);
		panel.add(button_16);
		
		JButton button_17 = new JButton("Salvar");
		button_17.setBackground(new Color(65, 105, 225));
		button_17.setForeground(new Color(224, 255, 255));
		button_17.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_17.setBounds(576, 176, 77, 23);
		panel.add(button_17);
		
		JButton button_18 = new JButton("Salvar");
		button_18.setBackground(new Color(65, 105, 225));
		button_18.setForeground(new Color(224, 255, 255));
		button_18.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_18.setBounds(576, 238, 77, 23);
		panel.add(button_18);
		
		JButton button_19 = new JButton("Salvar");
		button_19.setBackground(new Color(65, 105, 225));
		button_19.setForeground(new Color(224, 255, 255));
		button_19.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		button_19.setBounds(576, 306, 77, 23);
		panel.add(button_19);
		
		JLabel label_10 = new JLabel("/");
		label_10.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		label_10.setBounds(98, 214, 13, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("/");
		label_11.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		label_11.setBounds(153, 212, 13, 19);
		panel.add(label_11);
		
		textField_13 = new JTextField();
		textField_13.setForeground(new Color(0, 0, 128));
		textField_13.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_13.setBounds(56, 211, 32, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		textField_13.setDocument(new JTextFieldLimit(2));
		
		textField_14 = new JTextField();
		textField_14.setForeground(new Color(0, 0, 128));
		textField_14.setFont(new Font("Swis721 BT", Font.PLAIN, 12));
		textField_14.setColumns(10);
		textField_14.setBounds(111, 211, 32, 20);
		textField_14.setDocument(new JTextFieldLimit(2));
		panel.add(textField_14);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(65, 105, 225));
		btnAtualizar.setBounds(563, 405, 90, 23);
		panel.add(btnAtualizar);
		
		btnAtualizar.setForeground(new Color(224, 255, 255));
		btnAtualizar.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((textField_1.getText().equals("") && (radioCod.isSelected() == false && radioEmp.isSelected() == false)) || textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Por favor, digite algo.", "Erro", JOptionPane.ERROR_MESSAGE);
				}else if(radioCod.isSelected()) {
					ConnectionFactory conf = new ConnectionFactory();
					conf.conectar();
					panel.setVisible(true);
					Connection con = conf.connection();
					try {
						PreparedStatement stmt = con.prepareStatement("SELECT * FROM invest WHERE codigo =  ?;");
						stmt.setString(1, textField_1.getText());
						rs = stmt.executeQuery();
						while(rs.next()) {
							lblNewLabel_1.setText(rs.getString("codigo"));
							label.setText(rs.getString("cotacao"));
							label_1.setText(rs.getString("empresa"));
							label_2.setText(rs.getString("data"));
							label_5.setText(rs.getString("segmento"));
							label_4.setText(rs.getString("n_acao"));
							label_9.setText(rs.getString("v_mercado"));
							label_8.setText(rs.getString("divida"));
							label_7.setText(rs.getString("a_total"));
							label_6.setText(rs.getString("p_liquido"));
							label_3.setText(rs.getString("l_liquido"));
						}
						if(label.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Código não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
							panel.setVisible(false);
						}
					} catch (SQLException e) {
						
					}	
				}else if(radioEmp.isSelected()) {
					ConnectionFactory conf = new ConnectionFactory();
					conf.conectar();
					panel.setVisible(true);
					Connection con = conf.connection();
					try {
						PreparedStatement stmt = con.prepareStatement("SELECT * FROM invest WHERE empresa =  ?;");
						stmt.setString(1, textField_1.getText());				
						rs = stmt.executeQuery();
						while(rs.next()) {
							lblNewLabel_1.setText(rs.getString("codigo"));
							label.setText(rs.getString("cotacao"));
							label_1.setText(rs.getString("empresa"));
							label_2.setText(rs.getString("data"));
							label_5.setText(rs.getString("segmento"));
							label_4.setText(rs.getString("n_acao"));
							label_9.setText(rs.getString("v_mercado"));
							label_8.setText(rs.getString("divida"));
							label_7.setText(rs.getString("a_total"));
							label_6.setText(rs.getString("p_liquido"));
							label_3.setText(rs.getString("l_liquido"));
						}
						if(label.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Empresa não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
							panel.setVisible(false);
						}
					} catch (SQLException e) {
				}
				}
			}
		});
		frame.getContentPane().setLayout(groupLayout);
		
		button_10.setVisible(false);
		button_11.setVisible(false);
		button_12.setVisible(false);
		button_13.setVisible(false);
		button_14.setVisible(false);
		button_15.setVisible(false);
		button_16.setVisible(false);
		button_17.setVisible(false);
		button_18.setVisible(false);
		button_19.setVisible(false);
		btnNewButton_1.setVisible(false);
		
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textField_7.setVisible(false);
		textField_8.setVisible(false);
		textField_9.setVisible(false);
		textField_10.setVisible(false);
		textField_11.setVisible(false);
		textField_12.setVisible(false);
		textField_13.setVisible(false);
		textField_14.setVisible(false);
		label_10.setVisible(false);
		label_11.setVisible(false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioEmp);
		bg.add(radioCod);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			btnModificar.setVisible(false);
			textField_2.setVisible(true);
			btnNewButton_1.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnModificar.setVisible(true);
			textField_2.setVisible(false);
			btnNewButton_1.setVisible(false);
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			if(radioEmp.isSelected()) {
				conf.modificar(textField_2.getText(), "invest",textField_1.getText());
			}else if(radioCod.isSelected()) {
				conf.modificar(textField_2.getText(), "invest",label_1.getText());
			}			
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button.setVisible(false);
				textField_3.setVisible(true);
				button_10.setVisible(true);				
			}			
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_1.setVisible(false);
				textField_4.setVisible(true);
				button_11.setVisible(true);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_2.setVisible(false);
				textField_5.setVisible(true);
				textField_13.setVisible(true);
				textField_14.setVisible(true);
				label_10.setVisible(true);
				label_11.setVisible(true);
				button_12.setVisible(true);
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_3.setVisible(false);
				textField_6.setVisible(true);
				button_13.setVisible(true);
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_4.setVisible(false);
				textField_8.setVisible(true);
				button_15.setVisible(true);
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_5.setVisible(false);
				textField_9.setVisible(true);
				button_16.setVisible(true);
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_6.setVisible(false);
				textField_10.setVisible(true);
				button_17.setVisible(true);
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_7.setVisible(false);
				textField_11.setVisible(true);
				button_18.setVisible(true);
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_8.setVisible(false);
				textField_7.setVisible(true);
				button_14.setVisible(true);
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_9.setVisible(false);
				textField_12.setVisible(true);
				button_19.setVisible(true);
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setVisible(true);
				textField_3.setVisible(false);
				button_10.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarCotacao(Double.parseDouble(textField_3.getText()), lblNewLabel_1.getText(), "invest");				
			}
		});
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.setVisible(true);
				textField_4.setVisible(false);
				button_11.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarEmpresa(textField_4.getText(), lblNewLabel_1.getText(), "invest");
			}
		});
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_2.setVisible(true);
				textField_5.setVisible(false);
				button_12.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				String data;
				data = textField_5.getText()+"-" + textField_14.getText() +"-"+ textField_13.getText();
				conf.modificarData(data, lblNewLabel_1.getText(), "invest");
				label_10.setVisible(false);
				label_11.setVisible(false);
			}
		});
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_3.setVisible(true);
				textField_6.setVisible(false);
				button_13.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();				
				conf.modificarDivida(Double.parseDouble(textField_6.getText()), lblNewLabel_1.getText(), "invest");
			}
		});	
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_8.setVisible(true);
				textField_7.setVisible(false);
				button_14.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarATotal(Double.parseDouble(textField_7.getText()), lblNewLabel_1.getText(), "invest");
			}
		});
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			button_4.setVisible(true);
			textField_8.setVisible(false);
			button_15.setVisible(false);
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			conf.modificarVMercado(Double.parseDouble(textField_8.getText()), lblNewLabel_1.getText(), "invest");			
			}
		});
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_5.setVisible(true);
				textField_9.setVisible(false);
				button_16.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarNAcao(Double.parseDouble(textField_9.getText()), lblNewLabel_1.getText(), "invest");
			}
		});
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_6.setVisible(true);
				textField_10.setVisible(false);
				button_17.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarLLiquido(Double.parseDouble(textField_10.getText()), lblNewLabel_1.getText(), "invest");
			}
		});
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_7.setVisible(true);
				textField_11.setVisible(false);
				button_18.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarPLiquido(Double.parseDouble(textField_11.getText()), lblNewLabel_1.getText(), "invest");
			}
		});
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_9.setVisible(true);
				textField_12.setVisible(false);
				button_19.setVisible(false);
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.modificarSegmento(textField_12.getText(), lblNewLabel_1.getText(), "invest");
			}
		});
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if((textField_1.getText().equals("") && (radioCod.isSelected() == false && radioEmp.isSelected() == false)) || textField_1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, digite algo.", "Erro", JOptionPane.ERROR_MESSAGE);
			}else if(radioCod.isSelected()) {
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				panel.setVisible(true);
				Connection con = conf.connection();
				try {
					PreparedStatement stmt = con.prepareStatement("SELECT * FROM invest WHERE codigo =  ?;");
					stmt.setString(1, textField_1.getText());
					rs = stmt.executeQuery();
					while(rs.next()) {
						lblNewLabel_1.setText(rs.getString("codigo"));
						label.setText(rs.getString("cotacao"));
						label_1.setText(rs.getString("empresa"));
						label_2.setText(rs.getString("data"));
						label_5.setText(rs.getString("segmento"));
						label_4.setText(rs.getString("n_acao"));
						label_9.setText(rs.getString("v_mercado"));
						label_8.setText(rs.getString("divida"));
						label_7.setText(rs.getString("a_total"));
						label_6.setText(rs.getString("p_liquido"));
						label_3.setText(rs.getString("l_liquido"));
					}
					if(label.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Código não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
						panel.setVisible(false);
					}
				} catch (SQLException e) {
				}
			}else if(radioEmp.isSelected()) {
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				panel.setVisible(true);
				Connection con = conf.connection();
				try {
					PreparedStatement stmt = con.prepareStatement("SELECT * FROM invest WHERE empresa =  ?;");
					stmt.setString(1, textField_1.getText());
					rs = stmt.executeQuery();
					while(rs.next()) {
						lblNewLabel_1.setText(rs.getString("codigo"));
						label.setText(rs.getString("cotacao"));
						label_1.setText(rs.getString("empresa"));
						label_2.setText(rs.getString("data"));
						label_5.setText(rs.getString("segmento"));
						label_4.setText(rs.getString("n_acao"));
						label_9.setText(rs.getString("v_mercado"));
						label_8.setText(rs.getString("divida"));
						label_7.setText(rs.getString("a_total"));
						label_6.setText(rs.getString("p_liquido"));
						label_3.setText(rs.getString("l_liquido"));
					}
					if(label.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Empresa não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
						panel.setVisible(false);
					}
				} catch (SQLException e) {				
				}
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
