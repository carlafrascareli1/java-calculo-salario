package br.calculosalario.tests;

import br.calculosalario.models.Dependente;
import br.calculosalario.models.Funcionario;

public class CriadorFuncionario {

	private Funcionario funcionario;

	public CriadorFuncionario() {
		funcionario = new Funcionario();
	}

	public CriadorFuncionario nome(String nome) {
		this.funcionario.setNome(nome);
		return this;
	}
	
	public CriadorFuncionario horasTrabalhadas(double horasTrabalhadas) {
		this.funcionario.setHorasTrabalhadas(horasTrabalhadas);
		return this;
	}
	
	public CriadorFuncionario salarioHora(double salarioHora) {
		this.funcionario.setSalarioHora(salarioHora);
		return this;
	}

	public CriadorFuncionario comDependente(Dependente dep) {
		this.funcionario.adicionaDependente(dep);
		return this;
	}

	public Funcionario constroi() {
		return funcionario;
	}
}
