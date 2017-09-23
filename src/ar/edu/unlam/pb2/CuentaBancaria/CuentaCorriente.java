package ar.edu.unlam.pb2.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria{
	
	private Double descubierto=150.0;
	private Double comision=1.05;
	
	
	
	public void setRetirar(Double saldo){
		if(super.getSaldo()>=saldo){
			super.setSaldo(super.getSaldo()-saldo);
		}
		else{
			if(super.getSaldo()+descubierto>=saldo){
				this.descubierto+= (super.getSaldo()-saldo);
				super.setSaldo((super.getSaldo()-saldo)*comision);
			}
			else{
				System.out.println("Saldo insuficiente");
			}
		}
	}

	public Double getDescubierto() {
		return descubierto;
	}


	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}
}
