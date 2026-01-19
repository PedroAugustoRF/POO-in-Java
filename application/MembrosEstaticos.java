package application;
import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos{
	
	public static final double PI = 3.14159; // assim se declara uma constante. final declara como constante, e a norma pra contante é o nome dela todo em MAIUSCULO
	
	public static void main(String[] args){
		// Membros estáticos ou membros de classe são membros que fazem sentido independente do objeto
		// Funciona independentemente de objetos diferentes
		// São chamadas a partir do nome da classe ex: Math.sqrt();
		// Usado em classes utilitárias e declaração de constantes
		// Uma classe com apenas membros estáticos pode ser uma classe estática e não pode ser intanciada
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double raio = sc.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circunferencia(double raio){
		return 2.0 * PI * raio;
	}
	public static double volume(double raio){
		return 4 * PI * Math.pow(raio, 3) / 3;
	}
	
}
