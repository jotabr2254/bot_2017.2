package entidade;

public enum Situacao {

	APROVADO("O aluno está de ferias"),
	REPORVADO("Nos vemos na proxima turma"), 
	RECUPERACAO("Nos vemos na terça!") ; 
	
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
