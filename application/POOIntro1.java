package application;

import java.util.Scanner;
import java.util.Locale;

public class POOIntro1{
	public static void main(String[] args){
		// A POO tem 3 conceitos básicos: Classe, Atributos e Métodos. Também temos os Membros Estáticos
		// Resolvendo um problema sem a OO:
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ladoUm = 0, trianguloUm = 0, ladoDois = 0, trianguloDois = 0;
		
		for(int i = 0; i < 3; i++){
			System.out.println("Digite o valor do lado do primeiro triângulo: ");
			ladoUm = sc.nextDouble();
			
			if(ladoUm <= 0){
				System.out.printf("Valor inválido", i--);
			}
			else;
			trianguloUm += ladoUm;
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println("Digite o valor do lado do segundo triângulo: ");
			ladoDois = sc.nextDouble();
			
			if(ladoDois <= 0){
				System.out.printf("Valor inválido", i--);
			}
			else;
			trianguloDois += ladoDois;
		}
		
		trianguloUm = trianguloUm / 3;
		trianguloDois = trianguloDois / 3;
		
		if(trianguloUm > trianguloDois)
			System.out.println("O primeiro triângulo é maior");
		else
			System.out.println("O segundo triângulo é maior");
		
		sc.close();
		
	}
}
