package aula20200615;

import java.util.Calendar;

public class Coordenador extends Pessoa {

	public Coordenador(String nome, String sobrenome, Calendar dataNascimento, Endereco endereco) {
		super(nome, sobrenome, dataNascimento, endereco);
	}
	
	@Override
	public String toString() {
		return " Nome: " +  getNome() + " Sobrenome: " + getSobrenome() + " Data Nascimento: " + getDataNascimento() ;
	}

}