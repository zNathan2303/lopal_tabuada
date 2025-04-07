package br.sp.senai.jandira.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public String[] calcularTabuada() {
		// Verificar se os valores estão invertidos
		if (minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
		}
		
		// Criar um vetor de String que armazenará
		// Cada linha da tabuada
		int tamanho = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		String resultado[] = new String[tamanho];
		
		// Calcular e mostrar a tabuada
		int contador = 0;
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			String linha = multiplicando + " x " + minimoMultiplicador + " = " + produto;
			resultado[contador] = linha;
			System.out.println(linha);
			minimoMultiplicador++; //"++" ou "+= 1" no final faz receber + 1
			contador++;
		}
		System.out.println("FIM");
		
		return resultado;
	}

}
