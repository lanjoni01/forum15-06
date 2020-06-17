package aula20200615;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Turma {
	
	private String descricao;
	private Integer codigo;
	private	HashSet<Aluno> alunos;
	private Aluno lider;
	
	public Turma(String descricao, Integer codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
		alunos = new HashSet<Aluno>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		if(aluno.getContrato().getSituacao().equals(Situacao.IRREGULAR)) {
			return;
		}
		this.alunos.add(aluno);
		aluno.setTurma(this);
	}
	
	public void adicionarLider(Aluno lider) {
		this.lider = lider;
	}
	public Aluno getLider() {
		return lider;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	@Override
	public String toString() {
		return "Turma [descricao=" + descricao + ", codigo=" + codigo + ", alunos=" + alunos + ", lider=" + lider + "]";
	}
	
}