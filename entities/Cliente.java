package entities;

public class Cliente{
	public String nome;
	public char sexo;
	public byte idade;
	public double altura;
	public double peso;
	
	public double calcularIMC(){
		double imc = 0;
		imc = (peso / (Math.pow(altura, 2)));
		return imc;
	}
	public String toString(){
		return "Nome: " + nome + ". Sexo: " + sexo + ". Idade:" + idade + ". Altura: " + altura + ". Peso: " + peso + ". IMC: " + calcularIMC();
	}
	
}
