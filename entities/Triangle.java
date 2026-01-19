package entities;

public class Triangle{
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	// para criar métodos usamos a sintaxe:
	// public + tipo do dado que vai retornar + nome da função + parametros se precisar
	// public double area();
	
	public double areaTriangle(){
		double semiPerimetro = (ladoA + ladoB + ladoC) / 2.0; 
		double resultado = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
		
		return resultado;
	}
	
}