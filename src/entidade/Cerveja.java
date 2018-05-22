package entidade;

public class Cerveja {

	private Integer idcerveja;
	private String nome;
	private String tipo;
	private String pais;
	private int nota;
	
	public Cerveja() {
		// TODO Auto-generated constructor stub
	}
	
	public Cerveja(Integer idcerveja, String nome, String tipo, String pais, int nota) {
		super();
		this.idcerveja = idcerveja;
		this.nome = nome;
		this.nota = nota;
		this.pais = pais;
		this.tipo = tipo;

	}


	
	public Integer getIdcerveja() {
		return idcerveja;
	}
	public void setIdcerveja(Integer idcerveja) {
		this.idcerveja = idcerveja;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}
