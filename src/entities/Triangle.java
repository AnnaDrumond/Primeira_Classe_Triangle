package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	// "double" pois vai retornar um valor do tipo double
	// o nome do m�todo � area / nos () tesmos a lista de parametros do m�todo
	// como no ex, os valores de a,b e c j� est�o na pr�pria classe, nao preciso de
	// parametros
	public double area() {
		// como dentro da classe eu nao tem objectos, basta eu por diretamente a, b e c
		// porque neste caso, eu estou trabalhando com os atributos da minha classe
		double p = (a + b + c) / 2.0;
		// return � o comando que indica que este metodo vai retornar o que determina o return
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
