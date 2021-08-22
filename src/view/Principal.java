/* 
Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor 
de 1000 posições e gere o tempo gasto para percorrer o vetor. Repetir para 10000
 e 100000 posições. Responder com o tempo (em nS ou S) de cada operação.
*/

package view;

import controller.DesempenhoVetoresController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		DesempenhoVetoresController desempVet = new DesempenhoVetoresController();
		Scanner ler = new Scanner(System.in);
		
		for(int i=0 ; i < 3 ; i++) {
			System.out.printf("Informe a quantidade de posições do vetor: ");
			int qntPosicoes = ler.nextInt();
			desempVet.contaTempo(qntPosicoes);
		}
		
		ler.close();
	}

}