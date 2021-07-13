package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	// "double" pois vai retornar um valor do tipo double
	// o nome do método é area / nos () tesmos a lista de parametros do método
	// como no ex, os valores de a,b e c já estão na própria classe, nao preciso de
	// parametros
	public double area() {
		// como dentro da classe eu nao tem objectos, basta eu por diretamente a, b e c
		// porque neste caso, eu estou trabalhando com os atributos da minha classe
		double p = (a + b + c) / 2.0;
		// return é o comando que indica que este metodo vai retornar o que determina o return
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
