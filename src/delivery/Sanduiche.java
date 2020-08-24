package delivery;

public class Sanduiche extends Lanche{
	
	private double preparo=15;
	
	public Sanduiche(double preco) {
		this.preco = preco;
	}
	
	public String calcularPreco(double valor,double ingredientes,double total) {
		preco += 2*(ingredientes / total+2);
		km *= valor;
		preparo += km;
		return "Deu o total de:R$"+preco+" Reais e vai levar "+preparo+ " minutos para chegar";
		
	}


}
