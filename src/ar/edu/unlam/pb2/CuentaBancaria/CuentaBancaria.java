package ar.edu.unlam.pb2.CuentaBancaria;

public class CuentaBancaria {
	private Double saldo = 0.0;

	public void setDepositar(Double saldo) {
		this.saldo += saldo;
	}

	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo){
		this.saldo=saldo;
	}

}
