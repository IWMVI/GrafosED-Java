package view;

import model.Exercicio03;

import java.util.Random;

public class Exercicio03view {
	public static void main(String[] args) {
		int[][] grafo = new int[4][4];
		Random aleatorio = new Random();

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				if (x > y) {
					grafo[x][y] = grafo[y][x] = aleatorio.nextInt(10);
				}
			}
		}

		Exercicio03 exercicio3 = new Exercicio03();
		exercicio3.exibirArestas(grafo);
	}
}
