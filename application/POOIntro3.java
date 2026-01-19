package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class POOIntro3{
	public static void main(String[] args){
		// iremos colocar Métodos na nossa classe Triangle
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os três lados do triângulo X");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite os três lados do triângulo Y");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();

		double resultadoX = x.areaTriangle();
		double resultadoY = y.areaTriangle();
		
		if(resultadoX > resultadoY)
			System.out.println("Triângulo X é maior");
		else
			System.out.println("Triângulo Y é maior");
	}
}
