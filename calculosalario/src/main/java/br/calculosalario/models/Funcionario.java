package br.calculosalario.models;

import java.util.ArrayList;
import java.util.List;


public class Funcionario {
	private String nome;
	private double horasTrabalhadas;
	private double salarioHora;
	private List<Dependente> dependentes;

	public Funcionario() {
		dependentes = new ArrayList<Dependente>();
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getNumeroDependentes() {
		return getDependentes().size();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionaDependente(Dependente dep)
	{
		dependentes.add(dep);
	}

	public double getSalarioBruto() {
		return getHorasTrabalhadas() * getSalarioHora() + (50 * getNumeroDependentes());
	}

	public double getDescontoINSS() {
		double percINSS = (getSalarioBruto() <= 1000 ? 8.5 : 9);
		return getSalarioBruto() * percINSS / 100;
	}

	public double getDescontoIR() {
		double percIR;
		if (getSalarioBruto() <= 500) {
			return 0;
		} else if (getSalarioBruto() <= 1000) {
			percIR = 5;
		} else {
			percIR = 7;
		}
		return getSalarioBruto() * percIR / 100;
	}

	public double getSalarioLiquido() {
		return getSalarioBruto() - getDescontoINSS() - getDescontoIR();
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
}
