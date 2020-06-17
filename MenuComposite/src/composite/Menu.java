package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponente {
	protected ArrayList<MenuComponente> menu = new ArrayList<MenuComponente>();
	String nome, descricao;
	
	public Menu (String nome, String desc) {
		this.nome = nome;
		this.descricao = desc;
	}
	
	public void adicionar(MenuComponente menucomponente) {
		this.menu.add(menucomponente);
	}
	
	public void remover(MenuComponente menucomponente) {
		this.menu.remove(menucomponente);
	}

	public ArrayList<MenuComponente> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<MenuComponente> menu) {
		this.menu = menu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void print() {
		System.out.print("\nMenu -> " + getNome()); 
		System.out.println(" - " + getDescricao()); 
		System.out.println("------------------------------------------");
		
		Iterator iterator = menu.iterator();
		while (iterator.hasNext()) {
			MenuComponente menuitem = (MenuComponente) iterator.next();
			menuitem.print();		
		}	 
	
		//System.out.println("\n------------------------------------------");
	}
}