package br.com.fiap.checkpoint.app;

import javax.swing.JOptionPane;

import br.com.fiap.checkpoint.model.Motorista;
import br.com.fiap.checkpoint.model.Pessoa;
import br.com.fiap.checkpoint.model.Viagem;

public class Aplicacao {
	public final static int NUM = 7;
	public static Pessoa pessoas[] = new Pessoa[NUM];
	public static Motorista motoristas[] = new Motorista[NUM];
	public static Viagem viagens[] = new Viagem[NUM];
	// public static int iniPessoas=0, iniMotoristas=0, iniViagens=0;

	public static void main(String[] args) {

		Pessoa carlos = new Pessoa("Carlos", "199.222.333-44","(11)98757483");
		Pessoa marcelo = new Pessoa("Marcelo", "122.333.333-44","(11)98733383");
		Pessoa henrique = new Pessoa("Henrique", "200.200.200-44","(11)999999999");
		Pessoa matheus = new Pessoa("Matheus", "199.199.111-44","(12)92754583");
		Pessoa joao = new Pessoa("João", "439.243.234-56","(15)98750296");
		Pessoa leandro = new Pessoa("Leandro", "199.456.233-50","(11)987562431");

		Motorista felipeMotorista = new Motorista();
		Motorista renanMotorista = new Motorista();
		Motorista luisMotorista = new Motorista();
		Motorista gabrielMotorista = new Motorista();
		Motorista pedroMotorista = new Motorista();
		Motorista viniciusMotorista = new Motorista();

	}
	/*
	 * VERSÃO 2
	 * 
	 * boolean condit = true; do { int resp =
	 * Integer.parseInt(JOptionPane.showInputDialog(null,"O que você deseja fazer?"
	 * + "\n 1 - Cadastrar motorista" + "\n 2 - Cadastrar passageiro" +
	 * "\n 3 - Realizar viagem" + "\n 4 - Finalizar viagem")); switch (resp) { case
	 * 1: cadastraMotorista(); break; case 2: cadastraPassageiro(); break; case 3:
	 * realizaViagem(); break; case 4: finalizaViagem(); break; default:
	 * JOptionPane.showMessageDialog(null,"Unexpected value: " + resp); }
	 * }while(condit); } public static boolean cadastraMotorista() {
	 * 
	 * } public static void cadastraPassageiro() { String nome =
	 * JOptionPane.showInputDialog(null,"Digite o seu nome"); String cpf =
	 * JOptionPane.showInputDialog(null,"Digite o seu cpf"); String celular =
	 * JOptionPane.showInputDialog(null,"Digite o seu celular");
	 * 
	 * pessoas[topPessoas]= new Pessoa(nome,cpf,celular);
	 * 
	 * } public static boolean realizaViagem() {
	 * 
	 * } public static Viagem finalizaViagem() {
	 * 
	 * }
	 */
}
