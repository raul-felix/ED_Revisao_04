package controller;

import br.com.fatec.Lista;

public class ListaController {
	
	public void moveMenor(Lista<Integer> lista) {
		int menor;
		int posicaoMenor = 0;
		try {
			menor = lista.get(0);
		} catch (Exception e) {
			menor = Integer.MAX_VALUE;
			e.printStackTrace();
		}
		
		int tamanho = lista.size();
		
		for (int i = 1; i < tamanho; i++) {
			try {
				int valor = lista.get(i);
				if (valor < menor) {
					menor = valor;
					posicaoMenor = i;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			lista.remove(posicaoMenor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		lista.addFirst(menor);
	}

}
