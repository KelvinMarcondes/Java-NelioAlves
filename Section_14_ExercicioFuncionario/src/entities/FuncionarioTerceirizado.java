package entities;

public class FuncionarioTerceirizado extends Funcionario{

	private Double adicionalSalario;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double adicionalSalario) {
		super(nome, horas, valorPorHora);
		this.adicionalSalario = adicionalSalario;
	}

	public Double getAdicionalSalario() {
		return adicionalSalario;
	}

	public void setAdicionalSalario(Double adicionalSalario) {
		this.adicionalSalario = adicionalSalario;
	}
	
	public double pagamento() {
		return super.pagamento() + adicionalSalario * 1.1;
	}
	
}
