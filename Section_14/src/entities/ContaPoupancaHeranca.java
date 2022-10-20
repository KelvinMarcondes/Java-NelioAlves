package entities;

public class ContaPoupancaHeranca extends AccountHeranca{
	private double taxaJuros;
	
	public ContaPoupancaHeranca() {
		super();
	}

	public ContaPoupancaHeranca(Integer numero, String proprietario, Double saldo, double taxaJuros) {
		super(numero, proprietario, saldo);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizacaoSaldo(){
		saldo += saldo * taxaJuros;
	}
	
	
	
}
