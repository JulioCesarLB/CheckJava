package br.com.fiap.checkpoint.model;

public class Motorista extends Pessoa {
	private String habilitacao; 
	private String categoria;
	
	public Motorista(){
		
	}

	public Motorista(String habilitacao, String categoria, String nome, String cpf, String celular) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setCelular(celular);
		this.habilitacao = habilitacao;
		this.categoria = categoria;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
