package composite;

public class Principal {

	public static void main(String[] args) {
		Menu menuraiz = new Menu("Restaurante Lima", "Principal");
		
		Menu cafe = new Menu("Café da Manhã", "Dispinível das 6h as 11h");
		Menu almoco = new Menu("Almoço", "Dispinível das 11h as 14h");
		Menu jantar = new Menu("Jantar", "Dispinível das 19h as 23h");
		Menu sobremesa = new Menu("Sobremesa", "grátis");
		
		MenuItem pratomanha = new MenuItem("Café", "cappuccino", 5);
		MenuItem pratodia = new MenuItem("Lasanha", "A bolonhesa e frango", 14);
		MenuItem sob = new MenuItem("Sorvete", "chocolate", 0);
		MenuItem pratonoite = new MenuItem("Churrasco", "Picanha, Cupim, Linguiça, Frango", 45);
		
		sobremesa.adicionar(sob);
		cafe.adicionar(pratomanha);
		almoco.adicionar(pratodia);
		almoco.adicionar(sobremesa);
		jantar.adicionar(pratonoite);
		
		//menuraiz.adicionar(cafe);
		menuraiz.adicionar(almoco);
		menuraiz.adicionar(jantar);
		
		//menuraiz.remover(jantar);
		//menuraiz.remover(almoco);
		menuraiz.print();
		
	}
}