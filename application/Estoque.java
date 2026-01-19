package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Estoque{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product x = new Product();
		
		System.out.println("Digite o nome do produto: ");
		x.nomeProduto = sc.nextLine();
		System.out.println("Digite o preço do produto: ");
		x.precoProduto = sc.nextDouble();
		System.out.println("Digite a quantia do produto: ");
		x.quantia = sc.nextInt();
		
		double total = x.valorTotalEstoque();
		
		// Toda classe em Java é uma subclasse da classe Object
		// ou seja, tem todoa classe, temos metodos da classe Object
		// exemplos: getClass: retorna o tipo do objeto; equals: compara objetos; hashCode: retorna um cod hash do objeto; toString: converte o objeto para string
		
		// podemos usar o toString para imprimir o objeto diretamente mas "formatado"
		// precisamos formatar no arquivo da classe

		System.out.println(x);
		
		System.out.println("Adicione itens ao estoque: ");
		int valor = sc.nextInt();
		x.adicionarProdutoEstoque(valor);
		System.out.println(x);
		
		System.out.println("Retire itens ao estoque: ");
		valor = sc.nextInt();
		x.retirarProdutoEstoque(valor);
		System.out.println(x);
		
		sc.close();
		
	}
}
