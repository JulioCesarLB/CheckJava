package br.com.fiap.checkpoint.model;

public class Veiculo {

	private String placa;
	private String modelo;
	private String montadora;
	private int ano;
	private Motorista motorista;

	public Veiculo() {

	}

	public Veiculo(String placa, String modelo, String montadora, int ano, Motorista motorista) {
		this.placa = placa;
		this.modelo = modelo;
		this.montadora = montadora;
		this.ano = ano;
		this.motorista = motorista;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	

}
