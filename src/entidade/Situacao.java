package entidade;

public enum Situacao {

	APROVADO("O aluno est� de ferias"),
	REPORVADO("Nos vemos na proxima turma"), 
	RECUPERACAO("Nos vemos na ter�a!") ; 
	
	private String msg;

	Situacao(String msg){
		this.msg = msg;
	}
	
	public String getMesasage() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
