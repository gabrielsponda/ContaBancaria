package contaBancaria.model;

import contaBancaria.util.Cores;

public class Conta {

	// Atributos
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	// Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if (this.getSaldo() < valor) {
			System.out.println(Cores.TEXT_RESET);
			System.out.println("========================================");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT );
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("|          SALDO INSUFICIENTE!         |");
			System.out.println("└──────────────────────────────────────┘");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	// Método auxiliar
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1 -> tipo = "Corrente";
		case 2 -> tipo = "Poupança";
		}
		
		System.out.println(Cores.TEXT_RESET);
		System.out.println("========================================");
		System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND );
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("|            DADOS DA CONTA            |");
		System.out.println("├──────────────────────────────────────┤" + Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND);
		 System.out.printf("| Número: %-29d|\n"                       , this.numero);
		 System.out.printf("| Agência: %-28d|\n"                      , this.agencia);
		 System.out.printf("| Tipo: %-31s|\n"                         , tipo);
		 System.out.printf("| Titular: %-28s|\n"                      , this.titular);
		 System.out.printf("| Saldo: %-30.2f|\n"                      , this.saldo);
	}

}
