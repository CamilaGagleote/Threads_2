package view;
import controller.ThreadMatriz;
import java.util.Random;


public class Main {
	public static void main (String [] args) {
		
		Random r = new Random ();
		int matriz [][] = new int [3][5];
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<5;j++) {
				matriz[i][j] = r.nextInt(100);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	
		for(int i=0; i<3; i++) {
			Thread somaLinha = new ThreadMatriz(matriz[i]);
			somaLinha.start();
		}
	}

}