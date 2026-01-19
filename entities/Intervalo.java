package entities;

public class Intervalo {
	public int primeiroInteiro;
	public int segundoInteiro;
	
	public int somarIntervalo(){
		int i = 0, intervalo = 0;
		for(i = primeiroInteiro + 1; i < segundoInteiro; i++){
			intervalo += i;
		}
		return intervalo;
	}
	
	public void imprimirValoresIntervalo(){
		int i = 0;
		System.out.println("Os valores dentro do intervalo são: ");
		for(i = primeiroInteiro + 1; i < segundoInteiro; i++){
			System.out.printf("%d; ", i);
		}
	}
}