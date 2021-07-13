package funcao.sintaxe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// a,b e c e higher são argumentos - um argunebti é o valor que será passado a
		// variável quando o programa chamar a função - por analogia: seria o carro que
		// a ser estacionado
		int higher = max(a, b, c);
		// max e ShowResult são funções
		showResult(higher);
		sc.close();
	}
	
	// a(s) função(ões) entram "fora" da função "main", porém antes do } da classe (aqui "Main")

	// x,y,z são parametros - parametro é a variável declarada ma
	// assinatura(signature) da função recebem os argumentos em uma
	// função - por analogia : é a vaga no estacionamento
	
	// "public" - para que esta função fique disponivel em outras classes
	
	// "static" - para que esta função possa ser chamada independente de se criar um objeto
	public static int max(int x, int y, int z) {
	// a variavel é só para receber o valor maior	
		int auxiliar;
		if (x > y && x > z) {
			auxiliar = x;
		} else if (y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		//
		return auxiliar;
	}
	// value é um parâmetro
	// no caso abaixo, como a função não vai retornar nada , ela é do tipo "void"(vazio/vácuo)
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
