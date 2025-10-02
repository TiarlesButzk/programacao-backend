package br.com.store.backend.model;

public class Test {

	public static void main(String[] args) {
		
		for (String string : args) {
			Produto p = Produto.builder()
					.nome(string)
					.build();
		}
		
	}

}
