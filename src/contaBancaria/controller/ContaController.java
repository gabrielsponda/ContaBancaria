package contaBancaria.controller;

import java.util.ArrayList;

import contaBancaria.model.Conta;
import contaBancaria.repository.ContaRepository;
import contaBancaria.util.Cores;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	private int numero = 0;

	public int getNumero() {
		return numero;
	}

	@Override
	public void procurarPorNumero(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println(Cores.TEXT_RESET);
		System.out.println("----------------------------------------");
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT);
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("|        CONTA NÃO ENCONTRADA!         |");
		System.out.println("└──────────────────────────────────────┘");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println(Cores.TEXT_RESET);
		System.out.println("----------------------------------------");
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
		System.out.println("┌──────────────────────────────────────┐");
		System.out.printf("|     CONTA %02d CRIADA COM SUCESSO!     |\n", conta.getNumero());
		System.out.println("└──────────────────────────────────────┘");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {

		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true) {
				System.out.println(Cores.TEXT_RESET);
				System.out.println("----------------------------------------");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
				System.out.println("┌──────────────────────────────────────┐");
				System.out.printf("|    CONTA %02d DELETADA COM SUCESSO!    |\n", conta.getNumero());
				System.out.println("└──────────────────────────────────────┘");
			}
		} else {
			System.out.println(Cores.TEXT_RESET);
			System.out.println("----------------------------------------");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT);
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("|        CONTA NÃO ENCONTRADA!         |");
			System.out.println("└──────────────────────────────────────┘");
		}

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	// Métodos auxiliares
	public int gerarNumero() {
		return ++numero;
	}

	public Conta buscarNaCollection(int numero) {

		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;

	}

}
