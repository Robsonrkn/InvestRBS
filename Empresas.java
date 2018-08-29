package bolsa.valores;



public class Empresas {
	private double cotacao, n_acao, v_mercado, divida, a_total, p_liquido, l_liquido, roe, pl, divpat;
	private String codigo, empresa, data, segmento, titulo, nome;
	
	public Empresas(){

	}

	public double getA_total() {
		return a_total;
	}

	public void setA_total(double a_total) {
		this.a_total = a_total;
	}

	public double getL_liquido() {
		return l_liquido;
	}

	public void setL_liquido(double l_liquido) {
		this.l_liquido = l_liquido;
	}

	public double getN_acao() {
		return n_acao;
	}

	public void setN_acao(double n_acao) {
		this.n_acao = n_acao;
	}

	public double getP_liquido() {
		return p_liquido;
	}

	public void setP_liquido(double p_liquido) {
		this.p_liquido = p_liquido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getV_mercado() {
		return v_mercado;
	}

	public void setV_mercado(double v_mercado) {
		this.v_mercado = v_mercado;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

	public double getDivida() {
		return divida;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public String getPl() {
		this.pl = this.getV_mercado() / this.getL_liquido();
		String res = String.format("%.2f", this.pl);
		
		return res;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}

	public String getRoe() {
		this.roe = this.getL_liquido() / this.getP_liquido() * 100;
		String res = String.format("%.1f", this.roe )+"%";
		return res;
	}

	public void setRoe(double roe) {
		this.roe = roe;
	}

	public String getDivpat() {
		
		this.divpat = this.getDivida() / this.p_liquido;
		String res = String.format("%.2f", this.divpat);
		return res;
	}

	public void setDivpat(double divpat) {
		this.divpat = divpat;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
