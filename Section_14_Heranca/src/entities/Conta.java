package entities;

public class Conta {
	
	private Integer numero;
	private String proprietario;
	protected Double saldo;
	
	public Conta() {
	}

	public Conta(Integer numero, String proprietario, Double saldo) {
		super();
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	

}
