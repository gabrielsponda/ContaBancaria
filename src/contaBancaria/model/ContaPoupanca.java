package contaBancaria.model;

public class ContaPoupanca extends Conta {
	
	int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		 System.out.printf("| Aniversário da conta: %-15d|\n", this.aniversario);
		System.out.println("└──────────────────────────────────────┘");
	}

}
