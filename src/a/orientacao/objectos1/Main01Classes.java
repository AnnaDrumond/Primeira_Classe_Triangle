package a.orientacao.objectos1;

import java.util.Locale;
import java.util.Scanner;
// Nao esquecer que temos de importar a nossa classe criada para poder fazer a liga��o
import entities.Triangle;

public class Main01Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//vamos usar uma CLASSE para representar um tri�ngulo.
		// triangulo � uma entidade com 03 atributos : a,b e c
		// Depois de criada a classe "Triangle", vamos declarar as vari�veis como sendo do tipo Triangle
		// que � um tipo composto, vez que formado por 03 atributos
		Triangle x, y;
		
		// � necess�rio instanciar as vari�veis, para que cada uma tenha 
		// onde ser armazenado os valores a, b e c.
		x = new Triangle();
		y = new Triangle();
				
		System.out.println("Enter the measures of triangle X: ");
		
		// abaixo � como se faz para ler o n�mero digitado e guardar no atributo a do objecto x
		x.a = sc.nextDouble();
		// abaixo � como se faz para ler o n�mero digitado e guardar no atributo b do objecto x
		x.b = sc.nextDouble();
		// abaixo � como se faz para ler o n�mero digitado e guardar no atributo c do objecto x
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		// faremos o mesmo no caso do objecto y
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// tem que ter o() que indica que stou chamando o m�todo area
		double areaX = x.area();
		double areaY = y.area();
				
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
