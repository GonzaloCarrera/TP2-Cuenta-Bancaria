package ar.edu.unlam.pb2.CuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaBancariaTest {

	CuentaBancaria unaCuentaNueva = new CuentaBancaria();
	CuentaSueldo unaCuentaSueldo = new CuentaSueldo();
	CajaDeAhorros unaCajaDeAhorros = new CajaDeAhorros();
	CuentaCorriente unaCuentaCorriente = new CuentaCorriente();

	@Test
	public void testDeposito() {
		unaCuentaNueva.setDepositar(1500.0);
		Double saldoActual = unaCuentaNueva.getSaldo();
		Double esperado = 1500.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}

	@Test
	public void testSaldo() {
		unaCuentaNueva.setSaldo(500.0);
		Double saldoActual = unaCuentaNueva.getSaldo();
		Double esperado = 500.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}

	@Test
	public void testCuentaSueldo() {
		unaCuentaSueldo.setSaldo(500.0);
		unaCuentaSueldo.setRetirar(100.0);
		Double saldoActual = unaCuentaSueldo.getSaldo();
		Double esperado = 400.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}

	@Test
	public void testUnaCajaDeAhorros() {
		unaCajaDeAhorros.setSaldo(1000.0);
		unaCajaDeAhorros.setRetirar(200.0);
		Double saldoActual = unaCajaDeAhorros.getSaldo();
		Double esperado = 800.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}

	@Test
	public void testQueUnaCajaDeAhorrosCobreAdicionalAlSuperarLasCincoExtracciones() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros();
		miCajaDeAhorros.setDepositar(100.0);
		for (Integer i = 0; i < 5; i++) {
			miCajaDeAhorros.setRetirar(0);
		}
		miCajaDeAhorros.setRetirar(90);
		Double esperado = 4.0;
		Double actual = miCajaDeAhorros.getSaldo();
		assertEquals(esperado, actual);
	}

	@Test
	public void testUnaCuentaCorriente() {
		unaCuentaCorriente.setSaldo(2000.0);
		unaCuentaCorriente
				.setRetirar(2150.0);/* Dinero a retirar con descubierto */
		Double saldoActual = unaCuentaCorriente.getSaldo();
		Double esperado = -157.5;/* saldo en cuenta con comisión calculada */
		assertEquals(esperado, saldoActual, 0.0001);
	}
	
	@Test
	public void testQueElSaldoEnDescubiertoSeDescuenteCorrectamente(){
		CuentaCorriente miCuentaCorriente = new CuentaCorriente();
		miCuentaCorriente.setDepositar(100.0);
		miCuentaCorriente.setRetirar(150.0);
		Double esperado=100.0;
		Double actual= miCuentaCorriente.getDescubierto();
		assertEquals(esperado, actual);
	}
}