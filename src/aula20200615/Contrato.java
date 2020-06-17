package aula20200615;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Contrato {
	private Aluno aluno;
	private HashSet<Avalista> avalistas;
	private Situacao situacao;
	
	public Contrato(Aluno aluno, Situacao situacao) {
		this.aluno = aluno;
		this.situacao = situacao;
		this.avalistas = new HashSet<Avalista>();
	}
	public void adicionarAvalista(Avalista avalista) {
		this.avalistas.add(avalista);
	}
	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Collection<Avalista> getAvalistas() {
		return Collections.unmodifiableCollection(avalistas);
	}
	
}