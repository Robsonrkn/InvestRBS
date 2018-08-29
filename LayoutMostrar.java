package bolsa.valores;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import connection.ConnectionFactory;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LayoutMostrar {
	
	private JFrame frame;
	private JTable table;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
				try {
					LayoutMostrar window = new LayoutMostrar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LayoutMostrar() {
		initialize();
		
		
		readJTableDesc(true,"cotacao");
	}
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Swis721 BT", Font.BOLD, 12));
		frame.getContentPane().setForeground(new Color(0, 0, 205));
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		table = new JTable();
		JScrollPane js = new JScrollPane(table);
		JTableHeader jtheader = table.getTableHeader(); 
		jtheader.setBackground(new Color(65, 105, 225));
		jtheader.setForeground(new Color(224, 255, 255));
		jtheader.setFont(new Font("Swis721 BT", Font.BOLD, 12));
		
		table.setGridColor(new Color(0,100,0));
		((DefaultTableCellRenderer)jtheader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
		table.setColumnSelectionAllowed(true);
		table.setBackground(new Color(240, 255, 255));
		table.setForeground(new Color(0, 0, 128));
		table.setFont(new Font("Square721 BT", Font.PLAIN, 12));
		table.getTableHeader().setReorderingAllowed(false);
		String[][] data = {  };
		  
		Object[] fields = {"Código ", "Cotação", "Empresa", "Data", "Segmento", "Nº De Ações", "Valor de Mercado", "Dívida", "Ativo Total", "Patrimômio Líquido", "Lucro Líquido", "ROE", "PL", "DIV/PAT"};
		
		table.setModel(new DefaultTableModel(data,fields));
	
		table.getColumnModel().getColumn(0).setPreferredWidth(52);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(100);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(9).setPreferredWidth(100);
		table.getColumnModel().getColumn(10).setPreferredWidth(100);
		table.getColumnModel().getColumn(11).setPreferredWidth(43);
		table.getColumnModel().getColumn(12).setPreferredWidth(45);
		table.getColumnModel().getColumn(13).setPreferredWidth(54);
		frame.setBounds(100, 100, 1382, 498);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel testador = new JLabel("padrao");
		testador.setVisible(false);
		table.getTableHeader().addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        int col = table.columnAtPoint(e.getPoint());
		        
		        readJTable(false,"");
		        switch(col) {
		        case 0:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "codigo");	
		        	testador.setText("cima");
		        	
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "codigo");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 1:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "cotacao");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "cotacao");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 2:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "empresa");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "empresa");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 3:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "data");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "data");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 4:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "segmento");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "segmento");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 5:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "n_acao");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "n_acao");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 6:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "v_mercado");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "v_mercado");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 7:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "divida");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "divida");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 8:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "a_total");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "a_total");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 9:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "p_liquido");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "p_liquido");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 10:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "l_liquido");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "l_liquido");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 11:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "roe");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "roe");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 12:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "pl");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "pl");	
		        	testador.setText("padrao");
		        }
		        	break;
		        case 13:
		        	if(testador.getText().equals("padrao")) {
		        	readJTable(true, "pl");	
		        	testador.setText("cima");
		        }else if(testador.getText().equals("cima")) {
		        	readJTableDesc(true, "pl");	
		        	testador.setText("padrao");
		        }
		        	break;

		    }
		        	
		   }});
		JLabel lblNewLabel = new JLabel("EMPRESAS");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 26));
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(testador)
					.addGap(598)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addGap(557))
				.addComponent(js, GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(testador)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(js, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		
		frame.getContentPane().setLayout(groupLayout);
	}
		
	public void readJTable(boolean trocar,String campo) {
			if(trocar == true) {
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			for (Empresas e: conf.EmpresaList(campo)) {
				model.addRow(new Object[] {
					e.getCodigo(),
					e.getCotacao(),
					e.getEmpresa(),
					e.getData(),
					e.getSegmento(),
					e.getN_acao(),
					e.getV_mercado(),
					e.getDivida(),
					e.getA_total(),
					e.getP_liquido(),
					e.getL_liquido(),
					e.getRoe(),
					e.getPl(),
					e.getDivpat()
				});
			}
		}else {
			table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Código ", "Cotação", "Empresa", "Data", "Segmento", "Nº De Ações", "Valor de Mercado", "Dívida", "Ativo Total", "Patrimômio Líquido", "Lucro Líquido", "ROE", "PL", "DIV/PAT"
					}
				));

			}
		}
			
		public void readJTableDesc(boolean trocar, String campo) {
				if(trocar == true) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				ConnectionFactory conf = new ConnectionFactory();
				conf.conectar();
				for (Empresas e: conf.EmpresaListDesc(campo)) {
					model.addRow(new Object[] {
						e.getCodigo(),
						e.getCotacao(),
						e.getEmpresa(),
						e.getData(),
						e.getSegmento(),
						e.getN_acao(),
						e.getV_mercado(),
						e.getDivida(),
						e.getA_total(),
						e.getP_liquido(),
						e.getL_liquido(),
						e.getRoe(),
						e.getPl(),
						e.getDivpat()
					});
				}
			
			}else {
				table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Código ", "Cotação", "Empresa", "Data", "Segmento", "Nº De Ações", "Valor de Mercado", "Dívida", "Ativo Total", "Patrimômio Líquido", "Lucro Líquido", "ROE", "PL", "DIV/PAT"
						}
					));

				}
	}
}

