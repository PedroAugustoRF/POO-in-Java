package entities;

public class Product {
	public String nomeProduto;
	public double precoProduto;
	public int quantia;
	
	public double valorTotalEstoque(){
		return precoProduto * quantia;
	}
	
	public void adicionarProdutoEstoque(int quantia){
		this.quantia += quantia;	
	}
	
	public void retirarProdutoEstoque(int quantia){
		this.quantia -= quantia;
	}
	
	public String toString(){
		return "Produto: "+ nomeProduto + ". R$" + String.format("%.2f", precoProduto) + ". Quantia: " + quantia + ". Valor total: " + String.format("%.2f", valorTotalEstoque());
	}
}
