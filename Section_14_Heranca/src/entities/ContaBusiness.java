package entities;

public class ContaBusiness extends Conta{
	
	private Double LimiteEmprestimo;
	
	public ContaBusiness() {
		super();
	}

	public ContaBusiness(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
		super(numero, proprietario, saldo);
		LimiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if (valor <= LimiteEmprestimo) {
		saldo += valor - 10.0;
		}
	}
}
