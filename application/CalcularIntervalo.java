package application;
import entities.Intervalo;
import java.util.Scanner;

public class CalcularIntervalo{
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		
		Intervalo valor;
		
		valor = new Intervalo();
		
		int i = 1, resultado;
		
		while(i == 1){
			System.out.println("Digite dois números para serem somados os valores entre o intervalo");
			System.out.println("O primeiro valor tem que ser menor que o segundo: ");
			valor.primeiroInteiro= sc.nextInt();
			valor.segundoInteiro = sc.nextInt();
			
			if(valor.primeiroInteiro > valor.segundoInteiro)
				System.out.println("O primeiro valor tem que ser menor que o segundo: ");
			else
				i = 0;
		}
		
		resultado = valor.somarIntervalo();
		
		System.out.printf("A soma dos valores dentro do intervalo digitado é: %d%n", resultado);
		valor.imprimirValoresIntervalo();
		
		sc.close();
	}

}