package aula20200518.conjuntos;

public class Cor {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public Cor(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object outro) {
		//instanceof determina se uma refer�ncia aponta para um objeto de determinado tipo,
		//no caso, se a refer�ncia "outro" aponta para um objeto cujo tipo seja "Cor".
		if (outro instanceof Cor) {
			//Type casting (ou coer��o de tipos) for�a que a refer�ncia assuma um novo tipo, 
			//no caso, a refer�ncia "outro" que � do tipo Object vai assumir o tipo "Cor", que est� entre par�nteses."
			//Se "outro" n�o apontar para um objeto do tipo "Cor", uma exce��o "ClassCastException" ser� lan�ada.
			String nomeDoOutro = ((Cor) outro).getNome();
			return this.nome.equals(nomeDoOutro);
		}
		return false;
	}

}