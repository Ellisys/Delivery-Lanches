package delivery;

public class Lasanha extends Massa{
	
	public Lasanha(double preco) {
		this.preco = preco;
	}
	
	public String calcularPreco(double valor) {
		//preco += 2*(ingredientes / total+2);
		km *= valor;
		preparo += km;
		return "Deu o total de:R$"+preco+" Reais e vai levar "+preparo+ " minutos para chegar";
		
	}

}
