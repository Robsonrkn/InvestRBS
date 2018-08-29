package bolsa.valores;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import connection.ConnectionFactory;
import javax.swing.JRadioButton;
import java.awt.Color;

public class LayoutApagar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private ResultSet rs;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutApagar window = new LayoutApagar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LayoutApagar() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(230, 230, 250));
	frame.setBounds(100, 100, 837, 481);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	textField = new JTextField();
	textField.setColumns(10);
	ButtonGroup bg = new ButtonGroup();
	
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(240, 248, 255));
	panel.setVisible(false);
	
	JLabel lblNewLabel_2 = new JLabel("Encontrar por:");
	lblNewLabel_2.setForeground(new Color(0, 0, 128));
	lblNewLabel_2.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	
	textField_1 = new JTextField();
	textField_1.setBackground(new Color(245, 255, 250));
	textField_1.setForeground(new Color(0, 0, 128));
	textField_1.setColumns(10);
	
	JButton btnNewButton = new JButton("Buscar");
	btnNewButton.setBackground(new Color(65, 105, 225));
	btnNewButton.setForeground(new Color(224, 255, 255));
	btnNewButton.setFont(new Font("Swis721 BT", Font.BOLD, 12));
	
	JRadioButton radioCod = new JRadioButton("C\u00F3digo");
	radioCod.setBackground(new Color(230, 230, 250));
	radioCod.setForeground(new Color(0, 0, 128));
	radioCod.setFont(new Font("Arial", Font.PLAIN, 12));
	
	JRadioButton radioEmp = new JRadioButton("Empresa");
	radioEmp.setBackground(new Color(230, 230, 250));
	radioEmp.setForeground(new Color(0, 0, 128));
	radioEmp.setFont(new Font("Arial", Font.PLAIN, 12));
	GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.TRAILING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_2)
							.addComponent(textField_1)))
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(34)
						.addComponent(btnNewButton))
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(radioCod)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(radioEmp)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 724, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(68)
						.addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(radioCod)
							.addComponent(radioEmp))
						.addGap(7)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnNewButton))
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
				.addContainerGap())
	);
	panel.setLayout(null);
	bg.add(radioEmp);
	bg.add(radioCod);
	JLabel lblNewLabel = new JLabel("C\u00F3digo:");
	lblNewLabel.setForeground(new Color(0, 0, 128));
	lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblNewLabel.setBounds(10, 35, 67, 22);
	panel.add(lblNewLabel);
	
	JLabel lblCotao = new JLabel("Empresa:");
	lblCotao.setForeground(new Color(0, 0, 128));
	lblCotao.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblCotao.setBounds(10, 155, 79, 22);
	panel.add(lblCotao);
	
	JLabel lblltimoBalano = new JLabel("Valor de mercado:");
	lblltimoBalano.setForeground(new Color(0, 0, 128));
	lblltimoBalano.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblltimoBalano.setBounds(302, 35, 160, 22);
	panel.add(lblltimoBalano);
	
	JLabel lblSegmento = new JLabel("Segmento:");
	lblSegmento.setForeground(new Color(0, 0, 128));
	lblSegmento.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblSegmento.setBounds(304, 285, 100, 22);
	panel.add(lblSegmento);
	
	JLabel lblNDeAes = new JLabel("N\u00BA de a\u00E7\u00F5es:");
	lblNDeAes.setForeground(new Color(0, 0, 128));
	lblNDeAes.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblNDeAes.setBounds(10, 96, 100, 20);
	panel.add(lblNDeAes);
	
	JLabel lblValorDeMercado = new JLabel("Data:");
	lblValorDeMercado.setForeground(new Color(0, 0, 128));
	lblValorDeMercado.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblValorDeMercado.setBounds(10, 217, 153, 22);
	panel.add(lblValorDeMercado);
	
	JLabel lblDvida = new JLabel("D\u00EDvida:");
	lblDvida.setForeground(new Color(0, 0, 128));
	lblDvida.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblDvida.setBounds(10, 285, 67, 22);
	panel.add(lblDvida);
	
	JLabel lblAtivoTotal = new JLabel("Ativo Total:");
	lblAtivoTotal.setForeground(new Color(0, 0, 128));
	lblAtivoTotal.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblAtivoTotal.setBounds(10, 348, 101, 22);
	panel.add(lblAtivoTotal);
	
	JLabel lblLucroLquido = new JLabel("Lucro L\u00EDquido:");
	lblLucroLquido.setForeground(new Color(0, 0, 128));
	lblLucroLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblLucroLquido.setBounds(302, 155, 126, 22);
	panel.add(lblLucroLquido);
	
	JLabel lblPatrimnioLquido_1 = new JLabel("Patrim\u00F4nio L\u00EDquido:");
	lblPatrimnioLquido_1.setForeground(new Color(0, 0, 128));
	lblPatrimnioLquido_1.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblPatrimnioLquido_1.setBounds(302, 217, 172, 22);
	panel.add(lblPatrimnioLquido_1);
	
	JLabel lblPatrimnioLquido = new JLabel("Cota\u00E7\u00E3o:");
	lblPatrimnioLquido.setForeground(new Color(0, 0, 128));
	lblPatrimnioLquido.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
	lblPatrimnioLquido.setBounds(304, 95, 180, 22);
	panel.add(lblPatrimnioLquido);
	
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
	label_1.setBounds(10, 188, 181, 17);
	panel.add(label_1);
	
	JLabel label_2 = new JLabel("");
	label_2.setForeground(new Color(46, 139, 87));
	label_2.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_2.setBounds(10, 250, 181, 17);
	panel.add(label_2);
	
	JLabel label_3 = new JLabel("");
	label_3.setForeground(new Color(46, 139, 87));
	label_3.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_3.setBounds(10, 318, 181, 17);
	panel.add(label_3);
	
	JLabel label_4 = new JLabel("");
	label_4.setForeground(new Color(46, 139, 87));
	label_4.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_4.setBounds(10, 381, 181, 17);
	panel.add(label_4);
	
	JLabel label_5 = new JLabel("");
	label_5.setForeground(new Color(46, 139, 87));
	label_5.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_5.setBounds(302, 318, 224, 17);
	panel.add(label_5);
	
	JLabel label_6 = new JLabel("");
	label_6.setForeground(new Color(46, 139, 87));
	label_6.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_6.setBounds(302, 250, 224, 17);
	panel.add(label_6);
	
	JLabel label_7 = new JLabel("");
	label_7.setForeground(new Color(46, 139, 87));
	label_7.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_7.setBounds(302, 188, 224, 17);
	panel.add(label_7);
	
	JLabel label_8 = new JLabel("");
	label_8.setForeground(new Color(46, 139, 87));
	label_8.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_8.setBounds(302, 121, 224, 17);
	panel.add(label_8);
	
	JLabel label_9 = new JLabel("");
	label_9.setForeground(new Color(46, 139, 87));
	label_9.setFont(new Font("Swis721 BT", Font.BOLD, 14));
	label_9.setBounds(302, 68, 224, 17);
	panel.add(label_9);
	
	JButton btnApagar = new JButton("Apagar tudo");
	btnApagar.setForeground(new Color(0, 0, 139));
	btnApagar.setFont(new Font("Arial", Font.BOLD, 14));
	btnApagar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showConfirmDialog(null, "Tem Certeza?", "Apagar", 0, JOptionPane.INFORMATION_MESSAGE );
			
		}
	});
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(textField_1.getText().equals("") && (radioCod.isSelected() == false && radioEmp.isSelected() == false) || textField_1.getText().equals("")) {
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
						label_3.setText(rs.getString("segmento"));
						label_4.setText(rs.getString("n_acao"));
						label_9.setText(rs.getString("v_mercado"));
						label_8.setText(rs.getString("divida"));
						label_7.setText(rs.getString("a_total"));
						label_6.setText(rs.getString("p_liquido"));
						label_5.setText(rs.getString("l_liquido"));
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
						label_3.setText(rs.getString("segmento"));
						label_4.setText(rs.getString("n_acao"));
						label_9.setText(rs.getString("v_mercado"));
						label_8.setText(rs.getString("divida"));
						label_7.setText(rs.getString("a_total"));
						label_6.setText(rs.getString("p_liquido"));
						label_5.setText(rs.getString("l_liquido"));
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
	btnApagar.setBounds(517, 375, 134, 37);
	panel.add(btnApagar);
	frame.getContentPane().setLayout(groupLayout);
	
	
}
}
