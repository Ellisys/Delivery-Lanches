package delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int escolha,escolhaIngredientes,distancia,guardaIngrediente=0,escolhaMassa;
		List<Integer> total = new ArrayList<>();
		
		Sanduiche san = new Sanduiche(15);
		Lasanha lan = new Lasanha(12);
		Pizza pizza = new Pizza(24);
		Bolo bolo = new Bolo(17);
		Macarrao macarrao = new Macarrao(8);
		String ingredientes[] = {"Finalizar pedido","Tomate","Alface","Hamburguer","Salsicha","Mussarela","Provolone","Presunto","Maionese","Molho especial","cream cheese"};
		String opcoes[] = {"Sanduiches","Massas","Bolos"};
		
		System.out.println("Bem-vindo, Faca o seu pedido: ");
		

		for(int i=0; i<=2; i++) {
			System.out.println("["+(i+1)+"]"+opcoes[i]);
		}
		
		escolha = sc.nextInt();
		
		if(escolha>=4 || escolha<=0) {
			System.out.println("Escolha invalida, por favor escolha de 1 a 3");
			
			while(escolha != 1 && escolha != 2 && escolha != 3) {
				escolha = sc.nextInt();
				
			}
		}
		
		if(escolha==1) {
			System.out.println("Selecione ate 10 ingredientes caso esteja satisfeito finalize o pedido");
			for(int i=0; i<=10; i++) {
				System.out.println("["+(i)+"]"+ingredientes[i]);
			}
			for(int i=0; i<10;i++) {
				escolhaIngredientes = sc.nextInt();
				while(escolhaIngredientes >10 || escolhaIngredientes<0) {
					System.out.println("Por favor escolha entre 1 a 10 e caso queria finalizar escolha 0");
					escolhaIngredientes = sc.nextInt();
				}
					guardaIngrediente += escolhaIngredientes;
					total.add(escolhaIngredientes);
					
			System.out.println("Voce selecionou: "+ingredientes[escolhaIngredientes]);
			
				if(escolhaIngredientes == 0 || i>=9) {
					System.out.println("Pedido finalizado, Qual a distancia ate o restaurante?");
					distancia = sc.nextInt();
					System.out.println(san.calcularPreco(distancia,guardaIngrediente,total.size()));
					return;
				}
			}
		}
		if(escolha==2) {
			System.out.println("Selecione entre [1]macarrao, [2]pizza e [3]lasanha ");
				escolhaMassa = sc.nextInt();
			
			if(escolhaMassa>=4 || escolhaMassa<=0) {
				System.out.println("Escolha invalida, por favor escolha de 1 a 3");
				
				while(escolhaMassa != 1 && escolhaMassa != 2 && escolhaMassa != 3) {
					escolha = sc.nextInt();
					
				}
			}
			if(escolhaMassa==1) {
				System.out.println("Voce escolheu Macarrao , por favor informe os km ate o restaurante");
				distancia = sc.nextInt();
				System.out.println(macarrao.calcularPreco(distancia));

			}if(escolhaMassa==2) {
				System.out.println("Voce escolheu Pizza , por favor informe os km ate o restaurante");
				distancia = sc.nextInt();
				System.out.println(pizza.calcularPreco(distancia));
				
			}if(escolhaMassa==3) {
				System.out.println("Voce escolheu lasanha , por favor informe os km ate o restaurante");
				distancia = sc.nextInt();
				System.out.println(lan.calcularPreco(distancia));
				
			}
		}
		
		if(escolha==3) {
			System.out.println("Voce escolheu Bolo , por favor informe os km ate o restaurante");
			distancia = sc.nextInt();
			System.out.println(bolo.calcularPreco(distancia));
				
		}
		
		
	}

}
