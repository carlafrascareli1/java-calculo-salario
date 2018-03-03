package br.calculosalario.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.calculosalario.models.Dependente;
import br.calculosalario.models.Funcionario;

public class ValoresTest {

	private Funcionario funcionarioTeste;

	@Before
	public void Antes() {
		this.funcionarioTeste = new CriadorFuncionario().nome("João")
				.salarioHora(15)
				.horasTrabalhadas(160)
				.comDependente(new Dependente("Filho 1"))
				.comDependente(new Dependente("Filho 2"))
				.constroi();
	}

	@Test
	public void deveVerificarSalarioBruto() {
		assertEquals(2500.0, funcionarioTeste.getSalarioBruto());
	}

	@Test
	public void deveVerificarDescontoINSS() {
		assertEquals(225.0, funcionarioTeste.getDescontoINSS());
	}
	
	@Test
	public void deveVerificarDescontoIR() {
		assertEquals(175.0, funcionarioTeste.getDescontoIR());
	}
	
	@Test
	public void deveVerificarSalarioLiquido() {
		assertEquals(2100.0, funcionarioTeste.getSalarioLiquido());
	}
}
