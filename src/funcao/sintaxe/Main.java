package funcao.sintaxe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// a,b e c e higher s�o argumentos - um argunebti � o valor que ser� passado a
		// vari�vel quando o programa chamar a fun��o - por analogia: seria o carro que
		// a ser estacionado
		int higher = max(a, b, c);
		// max e ShowResult s�o fun��es
		showResult(higher);
		sc.close();
	}
	
	// a(s) fun��o(�es) entram "fora" da fun��o "main", por�m antes do } da classe (aqui "Main")

	// x,y,z s�o parametros - parametro � a vari�vel declarada ma
	// assinatura(signature) da fun��o recebem os argumentos em uma
	// fun��o - por analogia : � a vaga no estacionamento
	
	// "public" - para que esta fun��o fique disponivel em outras classes
	
	// "static" - para que esta fun��o possa ser chamada independente de se criar um objeto
	public static int max(int x, int y, int z) {
	// a variavel � s� para receber o valor maior	
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
	// value � um par�metro
	// no caso abaixo, como a fun��o n�o vai retornar nada , ela � do tipo "void"(vazio/v�cuo)
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
