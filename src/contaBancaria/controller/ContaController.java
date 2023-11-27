package contaBancaria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent()) {
			conta.get().visualizar();
		}
		else {
			System.out.println(Cores.TEXT_RESET);
			System.out.println("----------------------------------------");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT);
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("|        CONTA NÃO ENCONTRADA!         |");
			System.out.println("└──────────────────────────────────────┘");
		}
	}
	
	public void procurarPorNome(String titular) {
		
		List<Conta> listaNomes = listaContas.stream().filter(c -> c.getTitular().toString().contains(titular)).collect(Collectors.toList());
		System.out.println();
		
		for (var conta : listaNomes)
			conta.visualizar();;
		
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
		
		Optional<Conta> contaProcurada = buscarNaCollection(conta.getNumero());
		
		if (contaProcurada.isPresent()) {
			listaContas.set(listaContas.indexOf(contaProcurada.get()), conta);
			System.out.println(Cores.TEXT_RESET);
			System.out.println("----------------------------------------");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
			System.out.println("┌──────────────────────────────────────┐");
			System.out.printf("|   CONTA %02d ATUALIZADA COM SUCESSO!   |\n", conta.getNumero());
			System.out.println("└──────────────────────────────────────┘");
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
	public void deletar(int numero) {

		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent()) {
			if (listaContas.remove(conta.get()) == true) {
				System.out.println(Cores.TEXT_RESET);
				System.out.println("----------------------------------------");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
				System.out.println("┌──────────────────────────────────────┐");
				System.out.printf("|    CONTA %02d DELETADA COM SUCESSO!    |\n", listaContas.size());
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
		
		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent()) {
			if (conta.get().sacar(valor) == true) {
				System.out.println(Cores.TEXT_RESET);
				System.out.println("----------------------------------------");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
				System.out.println("┌──────────────────────────────────────┐");
				System.out.printf(" |  O SAQUE FOI REALIZADO COM SUCESSO   |\n", listaContas.size());
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
	public void depositar(int numero, float valor) {
		
		Optional<Conta> conta = buscarNaCollection(numero);

		if (conta.isPresent()) {
			conta.get().depositar(valor);
			System.out.println(Cores.TEXT_RESET);
			System.out.println("----------------------------------------");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
			System.out.println("┌──────────────────────────────────────┐");
			System.out.printf(" | O DEPÓSITO FOI REALIZADO COM SUCESSO |\n", listaContas.size());
			System.out.println("└──────────────────────────────────────┘");
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
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		Optional<Conta> contaOrigem = buscarNaCollection(numeroOrigem);
		Optional<Conta> contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem.isPresent() && contaDestino.isPresent()) {
			if (contaOrigem.get().sacar(valor) == true) {
				contaDestino.get().depositar(valor);
				System.out.println(Cores.TEXT_RESET);
				System.out.println("----------------------------------------");
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_GREEN_BACKGROUND_BRIGHT);
				System.out.println("┌──────────────────────────────────────┐");
				System.out.printf("|    A TRANFERÊNCIA FOI CONCLUÍDA!     |\n", listaContas.size());
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

	// Métodos auxiliares
	public int gerarNumero() {
		return ++numero;
	}

	public Optional<Conta> buscarNaCollection(int numero) {

		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return Optional.of(conta);
		}

		return Optional.empty();

	}

}
