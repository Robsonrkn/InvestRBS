package bolsa.valores;

import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import connection.ConnectionFactory;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LayoutLogin {

	JFrame frame;
	private JTextField textFieldTitulo;
	private JTextField textFieldNome;
	private ResultSet rs;
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutLogin window = new LayoutLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LayoutLogin() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setVisible(false);
		panel.setBounds(10, 201, 414, 49);
		frame.getContentPane().add(panel);
		
		
		JLabel lblTitulo = new JLabel("Bem vindo ao InvestRBS !");
		lblTitulo.setForeground(new Color(0, 0, 128));
		lblTitulo.setBounds(62, 11, 332, 64);
		lblTitulo.setFont(new Font("Rockwell", Font.BOLD, 26));
		frame.getContentPane().add(lblTitulo);
		
		JButton btnLogar = new JButton("Criar");
		btnLogar.setForeground(new Color(224, 255, 255));
		btnLogar.setBackground(new Color(65, 105, 225));
		btnLogar.setVisible(false);
		btnLogar.setBounds(149, 173, 116, 23);	
		btnLogar.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		frame.getContentPane().add(btnLogar);
		Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
		fontAttributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
		Font sublinhado = new Font("Palatino Linotype", Font.PLAIN,14).deriveFont(fontAttributes);
		
		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(new Color(65, 105, 225));
		label.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		label.setBounds(200, 86, 7, 23);
		frame.getContentPane().add(label);
		
		JLabel lblCatalago = new JLabel();
		lblCatalago.setForeground(new Color(65, 105, 225));
		lblCatalago.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCatalago.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNome = new JLabel();
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setForeground(new Color(65, 105, 225));
		lblNome.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblNome.setBounds(207, 86, 155, 23);
		lblNome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCatalago.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LayoutLMenu.main(null);
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblCatalago.setFont(sublinhado);
				lblNome.setFont(sublinhado);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCatalago.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
				lblNome.setFont(new Font ("Palatino Linotype", Font.PLAIN, 14));
			}
		});
		lblCatalago.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblCatalago.setBounds(72, 86, 129, 23);
		frame.getContentPane().add(lblCatalago);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Cat\u00E1lago:");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Swis721 BT", Font.PLAIN, 16));
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setForeground(new Color(0, 0, 128));
		lblAutor.setFont(new Font("Swis721 BT", Font.PLAIN, 16));
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBackground(new Color(245, 255, 250));
		textFieldTitulo.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setBackground(new Color(245, 255, 250));
		textFieldNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setForeground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldTitulo, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblAutor, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAutor, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(1))
		);
		panel.setLayout(gl_panel);
	
		lblNome.addMouseListener(new MouseAdapter()
		
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LayoutLMenu.main(null);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCatalago.setFont(sublinhado);
				lblNome.setFont(sublinhado);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCatalago.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
				lblNome.setFont(new Font ("Palatino Linotype", Font.PLAIN, 14));
			}
		});
		
		ConnectionFactory conf = new ConnectionFactory();
		conf.conectar();
		
		Connection con = conf.connection();
		
			PreparedStatement stmt;
			try {
				stmt = con.prepareStatement("SELECT * FROM usuarios ;");
				rs = stmt.executeQuery();
				while(rs.next()) {
					lblCatalago.setText(rs.getString("titulo"));
					lblNome.setText(rs.getString("nome"));
				}
				} catch (SQLException e1) {
				e1.printStackTrace();
			}
		frame.getContentPane().add(lblNome);
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				 
				panel.setVisible(true);

			}
		});
		if(lblCatalago.getText().equals("") && lblNome.getText().equals("")) {
			btnLogar.setVisible(true);
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				conf.inserir(textFieldTitulo.getText(), textFieldNome.getText());
				JOptionPane.showConfirmDialog(null, "Usuário cadastrado!");
			}
		});
		if(lblCatalago.getText().equals("")) {
			label.setText("");
		}else {
			label.setText("|");
		}
		
		}
	}
	

