package ar.edu.unlam.pb2.CuentaBancaria;

public class CajaDeAhorros extends CuentaBancaria {

	private Integer cont = 0;
	private Double costoAdicional = 6.0;

	public void setRetirar(double saldo) {
		if ((super.getSaldo() >= saldo) && (cont < 5)) {
			super.setSaldo(super.getSaldo()-saldo);
		} else {
			if (super.getSaldo() >= saldo + costoAdicional && cont >= 5) {
				super.setSaldo(super.getSaldo()-(saldo+costoAdicional));
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
		cont++;
	}

}
