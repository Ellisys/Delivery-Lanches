package delivery;

public abstract class Massa extends Lanche{
	String molho;
	int preparo = 30;
	
	abstract public String calcularPreco(double valor);
	
}
