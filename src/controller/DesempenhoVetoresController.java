/* 
Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor 
de 1000 posições e gere o tempo gasto para percorrer o vetor. Repetir para 10000
 e 100000 posições. Responder com o tempo (em nS ou S) de cada operação.
*/

package controller;

public class DesempenhoVetoresController {

	public DesempenhoVetoresController() {  //construtor
		super();
	}
	
	public void contaTempo(int tamanho) {  //recebe o tamanho do vetor
		int vetor[] = new int[tamanho];  //cria o vetor com o tamanho recebido
		
		for(int i=0; i < tamanho; i++) {  //preenche o vetor com zeros
			vetor[i] = 0;
		}
		
		double tempoInicial = System.nanoTime();
		
		for(int item : vetor) {  //percorre o vetor
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		System.out.println(tempoTotal+ "ns.");
		
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println(tempoTotal+ "s.");  //imprime em segundos o tempo da operação
	}

}