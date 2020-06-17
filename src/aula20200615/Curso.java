package aula20200615;

import java.util.HashSet;

public class Curso {
	
	private Coordenador coordenador;
	private String descricao;
	private Integer codigo;
	private HashSet<Turma> turmas;
	
	public Curso(String descricao, Integer codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
		this.turmas = new HashSet<Turma>();
	}
	
	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	public void adicionarTurmas(Turma turma){
		this.turmas.add(turma);
	}

	
	
	@Override
	public String toString() {
		return "Curso [coordenador=" + coordenador + ", descricao=" + descricao + ", codigo=" + codigo + ", turmas="
				+ turmas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Curso other = (Curso) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}