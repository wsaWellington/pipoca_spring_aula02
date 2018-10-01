package br.usjt.pi.pessoa.model;

public class Pessoa {

	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;

	public Pessoa(String nome, String cpf, String rg, String telefone, String email) {
		// TODO Auto-generated constructor stub
	}



	public Pessoa() {
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
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



	public int getId() {
		return id;
	}


		
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone="
				+ telefone + ", email=" + email  + "]";
	}



	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}

	
	

}
