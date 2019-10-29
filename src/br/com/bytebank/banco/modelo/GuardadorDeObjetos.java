package br.com.bytebank.banco.modelo;

public class GuardadorDeObjetos {
	private Object[] referencias;
	private int posicaoLivre;

	public GuardadorDeObjetos() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object cc) {
		referencias[this.posicaoLivre] = cc;
        this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
