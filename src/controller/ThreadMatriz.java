package controller;

public class ThreadMatriz extends Thread{
	
	private int vet[]; 
	
	public ThreadMatriz(int [] vet) {
		this.vet = vet;
	}

	@Override
	public void run() {
		somaLinha();
	}
	private void somaLinha() {
		int soma = 0;	
		String answ = "";
		
		for(int i=0; i<vet.length;i++) {
			soma += vet[i];
			answ += vet[i] + " ";
		}
		System.out.println(answ + "\nSoma: " + soma +"\n");
	}

}