package application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class MembrosEstaticos2{
	public static void main(String[] args){
		
		// quando usamos classes utilitarias ou membros estáticos, não precisamos instanciar um objeto para usa-las
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio); // já chamando a Classe assim como o Math.(); 
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
