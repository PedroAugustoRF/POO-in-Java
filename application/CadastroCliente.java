package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;

public class CadastroCliente{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente aluno = new Cliente();
		
		System.out.println("Digite seu Nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("<F> Para Feminino e <M> Para Masculino");
		aluno.sexo = sc.next().charAt(0);
		System.out.println("Digite sua Idade");
		aluno.idade = sc.nextByte();
		System.out.println("Qual sua altura? <x.xx>");
		aluno.altura = sc.nextDouble();
		System.out.println("Qual seu peso? <xx.xx>");
		aluno.peso = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();
	}
}
