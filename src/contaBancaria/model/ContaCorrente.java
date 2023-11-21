package contaBancaria.model;

import contaBancaria.util.Cores;

public class ContaCorrente extends Conta {

	private float limiteTotal;
	private float limiteAtual;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limiteTotal = limite;
		this.limiteAtual = limite;
	}

	public float getLimiteTotal() {
		return limiteTotal;
	}

	public void setLimiteTotal(float limite) {
		this.limiteTotal = limite;
	}

	public float getLimiteAtual() {
		return limiteAtual;
	}

	public void setLimiteAtual(float limite) {
		this.limiteAtual = limite;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		 System.out.printf("| Limite de crédito: %-18.2f|\n", this.limiteAtual);
		System.out.println("└──────────────────────────────────────┘");
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimiteAtual() < valor) {
			System.out.println(Cores.TEXT_RESET);
			System.out.println("========================================");
			System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_RED_BACKGROUND_BRIGHT);
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("|          SALDO INSUFICIENTE!         |");
			System.out.println("└──────────────────────────────────────┘");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);

		if (this.getSaldo() < 0)
			this.setLimiteAtual(this.getLimiteAtual() - Math.abs(this.getSaldo()));

		return true;
		
	}

	@Override
	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);

		if (this.getSaldo() > 0)
			this.setLimiteAtual(this.getLimiteTotal());
		else
			this.setLimiteAtual(this.getLimiteTotal() - Math.abs(this.getSaldo()));

	}

}
