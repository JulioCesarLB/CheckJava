package br.com.fiap.checkpoint.app;

import java.time.LocalDate;
import java.util.Random;

import static javax.swing.JOptionPane.*;

import br.com.fiap.checkpoint.model.Motorista;
import br.com.fiap.checkpoint.model.Pessoa;
import br.com.fiap.checkpoint.model.Veiculo;
import br.com.fiap.checkpoint.model.Viagem;

public class Aplicacao {

	// public static int iniPessoas=0, iniMotoristas=0, iniViagens=0;

	public static void main(String[] args) {

		Pessoa pessoas[] = { new Pessoa("Carlos", "199.222.333-44", "(11)98757483"),
				new Pessoa("Marcelo", "122.333.333-44", "(11)98733383"),
				new Pessoa("Henrique", "200.200.200-44", "(11)999999999"),
				new Pessoa("Matheus", "199.199.111-44", "(12)92754583"),
				new Pessoa("Jo�o", "439.243.234-56", "(15)98750296"),
				new Pessoa("Leandro", "199.456.233-50", "(11)987562431"),
				new Pessoa("Lucca", "124.556.233-51", "(12)987652831") };

		Motorista felipeMotorista = new Motorista("456789", "A", "Felipe", "439.333.234-56", "(11)987562000");
		Motorista renanMotorista = new Motorista("406709", "C", "Renan", "589.343.234-11", "(11)917262001");
		Motorista luisMotorista = new Motorista("116789", "B", "Luis", "129.367.344-56", "(21)987534000");
		Motorista gabrielMotorista = new Motorista("456009", "S", "Gabriel", "129.213.224-26", "(11)911111111");
		Motorista pedroMotorista = new Motorista("780009", "A", "Pedro", "100.233.634-01", "(15)987462000");
		Motorista viniciusMotorista = new Motorista("100789", "C", "Vinicius", "500.300.200-78", "(11)918561000");
		Motorista souzaMotorista = new Motorista("520719", "A", "Souza", "100.300.200-78", "(91)918561111");

		Veiculo veiculos[] = { new Veiculo("444dddd", "corsa", "Chevrolet", 2010, souzaMotorista),
				new Veiculo("224dfdd", "UNO", "Fiat", 2010, viniciusMotorista),
				new Veiculo("412wdcf", "	GOL", "Wolkswagen", 2010, pedroMotorista),
				new Veiculo("4414vfdd", "fusca", "Wolkswagen", 2010, gabrielMotorista),
				new Veiculo("455ddln", "corolla", "Toyota", 2010, luisMotorista),
				new Veiculo("546dkjd", "Ferrari F8", "Ferrari", 2010, renanMotorista),
				new Veiculo("748dghd", "Etios sedan", "Toyota", 2010, felipeMotorista) };

		for (int i = 0; i < veiculos.length; i++) {

			String origem = showInputDialog(null, pessoas[i].getNome() + " porfavor! \nInforme a origem");
			String destino = showInputDialog(null, pessoas[i].getNome() + " porfavor! \nInfome o destino");

			Viagem viagem = new Viagem(new Random().nextInt(101), origem, destino, pessoas[i],
					veiculos[new Random().nextInt(veiculos.length)]);

			String resposta = "Cliente: " + viagem.getPessoa().getNome() +"\n\nData da viagem: "+ viagem.getData()+"\n\nOrigem: " + viagem.getOrigem()
					+ "\nDestino: " + viagem.getDestino() + "\n\nValor da corrida: " + viagem.getValor()
					+ " R$ \n\nMotorista: " + viagem.getVeiculo().getMotorista().getNome() + " | Classe: "
					+ viagem.getVeiculo().getMotorista().getCategoria() + "\n\nCarro: "
					+ viagem.getVeiculo().getModelo() + " " + viagem.getVeiculo().getAno() + " | Placa: "
					+ viagem.getVeiculo().getPlaca() + "\nContato: " + viagem.getVeiculo().getMotorista().getCelular();

			showMessageDialog(null, resposta);
		}

	}
	/*
	 * VERS�O 2
	 * 
	 * boolean condit = true; do { int resp =
	 * Integer.parseInt(JOptionPane.showInputDialog(null,"O que voc� deseja fazer?"
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
