package composite;

public class Principal {

	public static void main(String[] args) {
		Menu menuraiz = new Menu("Restaurante Lima", "Principal");
		
		Menu cafe = new Menu("Caf� da Manh�", "Dispin�vel das 6h as 11h");
		Menu almoco = new Menu("Almo�o", "Dispin�vel das 11h as 14h");
		Menu jantar = new Menu("Jantar", "Dispin�vel das 19h as 23h");
		Menu sobremesa = new Menu("Sobremesa", "gr�tis");
		
		MenuItem pratomanha = new MenuItem("Caf�", "cappuccino", 5);
		MenuItem pratodia = new MenuItem("Lasanha", "A bolonhesa e frango", 14);
		MenuItem sob = new MenuItem("Sorvete", "chocolate", 0);
		MenuItem pratonoite = new MenuItem("Churrasco", "Picanha, Cupim, Lingui�a, Frango", 45);
		
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