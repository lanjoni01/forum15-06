package aula20200615;

import java.util.Calendar;

public class Aluno extends Pessoa{
	
	private String ra;
	private Contrato contrato;
	private Turma turma; 
	
	public Aluno(String nome, String sobrenome, Calendar dataNascimento, Endereco endereco, String ra) {
		super(nome, sobrenome, dataNascimento, endereco);
		this.ra = ra;
	}
	public String getRa() {
		return ra;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	public Contrato getContrato() {
		return contrato;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ra == null) ? 0 : ra.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (ra == null) {
			if (other.ra != null)
				return false;
		} else if (!ra.equals(other.ra))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return " Aluno: RA: " + ra + " Nome: " +  getNome() + " Sobrenome: " + getSobrenome() + " Data Nascimento: " + getDataNascimento() ;
	}
}
