package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class POOIntro2{
	public static void main(String[] args){
		// A POO tem 3 conceitos básicos: Classe, Atributos e Métodos. Também temos os Membros Estáticos
		
		// Resolvendo um problema com a OO:
		// Vamos resolver o problema anterior só que com orientação a objetos
		// Vamos criar uma classe com três atributos para representar o triangulo
		
		// O triangulo é uma entidade com 3 atributos a, b e c.
		
		// Classe é um tipo estruturado que pode conter membros: Atributos e Métodos.
		// Atributos são dados, Métodos são funções
		
		// A Classe também pode ter: Construtores, Sobrecarga, Encapsulamento, Herança e Polimorfismo
		
		// Uma classe tem atributos e/ou métodos. Ex.: Classe Carro tem Cor, Marca e Motor;
		// Um objeto Fusca recebe a classe Carro, logo vamos dar atributos pro fusca;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		double p = 0, areaUm = 0, areaDois = 0;
		
		System.out.println("Entre com os lados do Triangulo: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Entre com os lados do outro Triangulo");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		p = (x.ladoA + x.ladoB + x.ladoC) / 2.0;
		areaUm = Math.sqrt(p * (p - x.ladoA) * (p = x.ladoB) * (p - x.ladoC));
		
		p = (y.ladoA + y.ladoB + y.ladoC) / 2;
		areaDois = Math.sqrt(p * (p - y.ladoA) * (p - y.ladoB) * (p - y.ladoC));
		
		if(areaUm > areaDois)
			System.out.println("Triangulo um é maior");
		else
			System.out.println("Triangulo dois é maior");
		
		sc.close();
	}
}
