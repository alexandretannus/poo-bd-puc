package model;

public class Aluno {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private Long matricula;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		String objeto = "Nome: " + this.nome + 
				"\nMatricula: " + this.matricula +
				"\n";
		return objeto;
	}
	
}
