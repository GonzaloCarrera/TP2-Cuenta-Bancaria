package ar.edu.unlam.pb2.CuentaBancaria;

public class CuentaSueldo extends CuentaBancaria {

	public void setRetirar(Double saldo) {
		if (super.getSaldo() >= saldo) {
			super.setSaldo(super.getSaldo()-saldo);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
}