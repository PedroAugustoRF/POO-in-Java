package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Quadrilatero;

public class CalcularQuadrado{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quadrilatero x, y;
		
		x = new Quadrilatero();
		y = new Quadrilatero();
		
		int caso = 0, i = 1;
		double area = 0;
		
		do{
			System.out.println("Digite 1 p/ calcular área do quadrado e 2 p/ retangulo. Caso queira sair digite 0");
			caso = sc.nextInt();
			
			switch(caso){
			case 0:
				i = 0;
				System.out.println("Programa encerrado");
				break;
			case 1:
				System.out.println("Digite o lado um");
				x.ladoUm = sc.nextDouble();
				System.out.println("Digite o lado dois");
				y.ladoDois = sc.nextDouble();
				
				area = x.ladoUm * y.ladoDois;
				
				System.out.printf("Área: %.2f%n", area);
				
				break;
			case 2:
				System.out.println("Digite o lado um");
				x.base = sc.nextDouble();
				System.out.println("Digite o lado dois");
				y.altura = sc.nextDouble();
				
				area = x.base * y.altura;
				
				System.out.printf("Área: %.2f%n", area);
				
				break;
				
			default:
				System.out.println("Valor inválido!");
				break;
			}
			
		}while(i == 1);
		
		sc.close();
	}
}
