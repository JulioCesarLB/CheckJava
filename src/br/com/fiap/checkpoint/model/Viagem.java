package br.com.fiap.checkpoint.model;

import java.time.LocalDate;

public class Viagem {
	private LocalDate data; 
	private double valor;
	private String origem;
	private String destino;
	private Pessoa pessoa;
	private Veiculo veiculo;
	public Viagem() {
		
	}
	public Viagem(LocalDate data, double valor, String origem, String destino, Pessoa pessoa, Veiculo veiculo) {
		this.data = data;
		this.valor = valor;
		this.origem = origem;
		this.destino = destino;
		this.pessoa = pessoa;
		this.veiculo = veiculo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	} 

}
