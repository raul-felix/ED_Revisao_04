package view;

import br.com.fatec.Lista;
import controller.ListaController;

public class Main {
	
	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<Integer>();
		
		try {
			lista.addLast(10);
			lista.addLast(21);
			lista.addLast(4);
			lista.addLast(13);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ListaController listaController = new ListaController();
		listaController.moveMenor(lista);
		
		try {
			int tamanho = lista.size();
			
			for (int i = 0; i < tamanho; i++) {
				System.out.println(lista.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
