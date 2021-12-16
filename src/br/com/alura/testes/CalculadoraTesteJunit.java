package br.com.alura.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTesteJunit {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(2, 2);
		
		Assert.assertEquals(4, soma);
	}

}
