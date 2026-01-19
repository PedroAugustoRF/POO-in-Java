import java.util.Scanner;

public class FuncoesSintaxe{
	public static void main(String[] args){
		// Funções representam um processamento com um significado
		// Como uma determinada função significa algo e pode ser reaproveitada, ela se torna Função
		// System.out.println(Argumento); é uma função para mostrar algo na tela
		
		// Vantagens: Modularização, Delegação (Diminui tamanho do código), Reaproveitamento.
		
		// Funções podem receber dados de entrada: Parametros ou Argumentos
		// (); << o que vai dentro dos parenteses é o argumento
		// Funções podem ou não retornar uma saída que você guarda numa variável
		
		// Na POO, funções entro de classes recebem o nome de "Métodos"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = 0;
		
		if(a > b)
			maior = a;
		else if(b > c)
			maior = b;
		else
			maior = c;
		
		System.out.println(maior);
		
		System.out.println("Agora vamos printar usando uma função!");
		
		int maiorValor = maiorInteiro(a, b, c);
		mostrarResultado(maiorValor);
		
		sc.close();
	}
	
	// Funções são criadas dentro do public class
	// sintaxe: PRECISA TER O PREFIXO "public static"
	
	// "public" para que a função fique disponivel para outras classes
	// "static" para que essa função possa ser chamada independente de se criar um objeto
	
	// Depois do Prefixo "public static" colocamos o tipo de dado que a função retorna
	// em seguida, colocamos o nome da função
	// por fim, colocamos parenteses para declararmos os parametros da função
	
	// usamos return para retornar pra função main o valor da função criada
	
	public static int maiorInteiro(int x, int y, int z){
		int aux = 0;
		
		if(x > y)
			aux = x;
		else if(y > z)
			aux = y;
		else
			aux = z;
		
		return aux;
	}
	
	// quando a função não vai retornar nada que possa ser reutilizado, usamos o void depois do prefixo
	
	public static void mostrarResultado(int valor){
		System.out.printf("Maior inteiro: %d", valor);
	}
} 