package view;

import model.Exercicio04;

import java.io.IOException;

public class Exercicio04view {
	public static void main(String[] args) throws IOException {
		Exercicio04 exercicio4 = new Exercicio04();

		exibirMatriz(exercicio4.preencherTrianguloSuperior());
	}

	public static void exibirMatriz(int[][] matriz) {
		int tamanho = matriz.length;

		for (int x = 0; x < tamanho; x++) {
			for (int y = 0; y < tamanho; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println();
		}
	}
}
