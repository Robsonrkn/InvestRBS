package connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bolsa.valores.Empresas;

import java.sql.Connection;


public class ConnectionFactory {

	private static Connection connection = null;
	private Statement statement = null;
	private ResultSet rs = null;	
	public void conectar() {
		String DRIVER = "com.mysql.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/investrbs";
		String USER = "root";
		String PASS = "";		
		try {
			Class.forName(DRIVER);
			ConnectionFactory.connection =  DriverManager.getConnection(URL, USER, PASS);
			this.statement = ConnectionFactory.connection.createStatement();
			
		} catch (Exception e) {
			System.out.println("Erro na conexão " + e.getMessage() );
		}	
		}
	public static Connection connection() {
		return connection;
	}
	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		closeConnection(con);		
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}	
	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs ) {
		closeConnection(con, stmt );		
			try {
				if (rs != null) {
					rs.close();
				}					
			} catch (SQLException e) {
				
				e.printStackTrace();
			}		
	}
	public void inserir(String codigo, double cotacao, String empresa, String data, String segmento, double n_acao,
						double v_mercado, double divida, double a_total, double p_liquido, double l_liquido) {
		double roe,pl,divpat = 0;
		roe = l_liquido / p_liquido * 100;
		String roer = String.format("%.1f", roe );
		pl = v_mercado / l_liquido;
		String plr = String.format("%.2f", pl);
		divpat = divida / p_liquido;
		String divpatr = String.format("%.2f",divpat);
		String query = "INSERT INTO invest (codigo, cotacao, empresa, data, segmento, n_acao,v_mercado, divida, a_total, p_liquido, l_liquido,roe, pl, div_pat)"
						+ " VALUES('"+codigo+"','"+ cotacao+"','"+empresa +"','" +data+"','" +segmento+"','" +n_acao+ "','"+v_mercado+ "','" +divida+"','" +a_total+"',"
						+ "'"+p_liquido+"','"+l_liquido+"','"+roer+"','"+plr+"','"+divpatr+"');";				
		try {
			this.statement.executeUpdate(query);
		} catch (SQLException e) {
			
			System.out.println("Erro na conexão inserir " + e.getMessage() );
		}
	}
	public void inserir(String titulo, String nome) {
		String query = "INSERT INTO usuarios (titulo, nome) VALUES ('"+titulo+"',"+"'"+nome+"');";
		try {
			this.statement.executeUpdate(query);
			
			System.out.println("Sucesso ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void modificarTitulo(String tabela, String titulo) {
		String query = ("UPDATE ? SET titulo WHERE titulo = ? ");
		try {
			
			Connection con = connection() ;
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, tabela);
			ps.setString(2, titulo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modificarNome(String tabela, String nome) {
		String query = ("UPDATE ? SET nome WHERE nome = ? ");
		try {
			Connection con = connection() ;
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, tabela);
			ps.setString(2, nome);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modificar(String codigo , String tabela, String empresa ) {
		String	query = ("UPDATE "+ tabela +" SET codigo = '"+codigo+ "' WHERE empresa = '"+empresa+"';");
		try {
			this.statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		public void modificarCotacao(double cotacao,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET cotacao = '"+cotacao+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		public void modificarEmpresa(String empresa,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET empresa = '"+empresa+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarData(String data,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET data = '"+data+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarSegmento(String segmento,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET segmento = '"+segmento+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarNAcao(double n_acao,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET n_acao = '"+n_acao+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarVMercado(double v_mercado,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET v_mercado = '"+v_mercado+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarDivida(double divida,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET divida = '"+divida+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarATotal(double a_total, String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET a_total = '"+a_total+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarPLiquido(double p_liquido,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET p_liquido = '"+p_liquido+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void modificarLLiquido(double l_liquido,String codigo , String tabela) {
			String	query = ("UPDATE "+ tabela +" SET l_liquido = '"+l_liquido+ "' WHERE codigo = '"+codigo+"';");
			try {
				this.statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public void apagarLinha(String codigo, String tabela) {
		String query = ("DELETE FROM "+ tabela + " WHERE codigo = '"+codigo+"';");
		try {
			this.statement.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro de apagar:"+ e);
			e.printStackTrace();
		}
	}
	public ArrayList<Empresas> EmpresaList(String campo) {
		ArrayList<Empresas> EmpresasList = new ArrayList<>();
		try {
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			this.rs = this.statement.executeQuery("SELECT * FROM invest ORDER BY "+campo+";");
			while(rs.next()) {
				Empresas empresa = new Empresas();
				empresa.setCodigo(rs.getString("codigo"));
				empresa.setCotacao(rs.getDouble("cotacao"));
				empresa.setEmpresa(rs.getString("empresa"));
				empresa.setData(rs.getString("data"));
				empresa.setSegmento(rs.getString("segmento"));
				empresa.setN_acao(rs.getDouble("n_acao"));
				empresa.setV_mercado(rs.getDouble("v_mercado"));
				empresa.setDivida(rs.getDouble("divida"));
				empresa.setA_total(rs.getDouble("a_total"));
				empresa.setP_liquido(rs.getDouble("p_liquido"));
				empresa.setL_liquido(rs.getDouble("l_liquido"));
				empresa.setRoe(rs.getDouble("roe"));
				empresa.setPl(rs.getDouble("pl"));
				empresa.setDivpat(rs.getDouble("div_pat"));
				EmpresasList.add(empresa);				
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return EmpresasList;
}
	public ArrayList<Empresas> EmpresaListDesc(String campo) {
		ArrayList<Empresas> EmpresasListDesc = new ArrayList<>();
		try {
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			this.rs = this.statement.executeQuery("SELECT * FROM invest ORDER BY "+campo+" DESC;");
			while(rs.next()) {
				Empresas empresa = new Empresas();
				empresa.setCodigo(rs.getString("codigo"));
				empresa.setCotacao(rs.getDouble("cotacao"));
				empresa.setEmpresa(rs.getString("empresa"));
				empresa.setData(rs.getString("data"));
				empresa.setSegmento(rs.getString("segmento"));
				empresa.setN_acao(rs.getDouble("n_acao"));
				empresa.setV_mercado(rs.getDouble("v_mercado"));
				empresa.setDivida(rs.getDouble("divida"));
				empresa.setA_total(rs.getDouble("a_total"));
				empresa.setP_liquido(rs.getDouble("p_liquido"));
				empresa.setL_liquido(rs.getDouble("l_liquido"));
				empresa.setRoe(rs.getDouble("roe"));
				empresa.setPl(rs.getDouble("pl"));
				empresa.setDivpat(rs.getDouble("div_pat"));
				EmpresasListDesc.add(empresa);
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return EmpresasListDesc;
}
	public ArrayList<Empresas> Usuarios(){
		ArrayList<Empresas> Usuarios = new ArrayList <>();
		try {
			ConnectionFactory conf = new ConnectionFactory();
			conf.conectar();
			this.rs = this.statement.executeQuery("SELECT * FROM invest ORDER BY nome;");
			while(rs.next()) {
				Empresas usuario = new Empresas();
				usuario.setTitulo(rs.getString("titulo"));
				usuario.setNome(rs.getString("nome"));
				Usuarios.add(usuario);
				
			}
		}catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return Usuarios;
	}
	
}
