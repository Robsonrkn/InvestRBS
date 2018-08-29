package bolsa.valores;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LayoutLMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JFrame frame;
	public LayoutLMenu() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setForeground(new Color(255, 239, 213));
		frame.getContentPane().setForeground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 611, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel lblTitulo = new JLabel("Escolha a op\u00E7\u00E3o desejada:");
		lblTitulo.setForeground(new Color(0, 0, 128));
		lblTitulo.setFont(new Font("Rockwell", Font.BOLD, 26));
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(65, 105, 225));
		btnModificar.setForeground(new Color(224, 255, 255));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				LayoutEditar.main(null);
			}
		});
		btnModificar.setFont(new Font("Swis721 BT", Font.BOLD, 16));
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(65, 105, 225));
		btnConsultar.setForeground(new Color(224, 255, 255));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayoutMostrar.main(null);
			}
		});
		btnConsultar.setFont(new Font("Swis721 BT", Font.BOLD, 16));
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBackground(new Color(65, 105, 225));
		btnApagar.setForeground(new Color(224, 255, 255));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LayoutApagar.main(null);
			}
		});
		btnApagar.setFont(new Font("Swis721 BT", Font.BOLD, 16));
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBackground(new Color(65, 105, 225));
		btnInserir.setForeground(new Color(224, 255, 255));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					LayoutInserir.main(null);
			}
		});
		btnInserir.setFont(new Font("Swis721 BT", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(133)
							.addComponent(lblTitulo))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(btnApagar, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnInserir, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConsultar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnApagar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(276, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutLMenu window = new LayoutLMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
