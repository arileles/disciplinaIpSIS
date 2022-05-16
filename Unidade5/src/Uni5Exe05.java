import java.util.Scanner;

public class Uni5Exe05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe n (n>2): ");
		int qtd = teclado.nextInt();
		//inicio do calculo
		int numero = 8;
		//Repetir a quantidade de vezes solicitada pelo usuario do sistema
		for (int i = 1; i <= qtd; i ++){
			//A ultima impressao deve ignorar a virgula ( USO DO TERNARIO )
			System.out.print(numero + (i == qtd ? "" : ", "));
			//PREPARAR A VARIAVEL NUMERO PARA IMPRIMIR O PROXIMO VALOR
			//QUANDO INDICE É IMPAR, DEVE SOMAR (1, 3, 5, 7 ... )
			if (i % 2 != 0){
				//Deve somar (preparar a variavel valor para a próxima passagem pelo for)
				numero += 2;
			} else {
				//QUANDO INDICE É PAR, DEVE MULTIPLICAR, REMOVENDO A SOMA DE 2 FEITA NO LOOP ANTERIOR
				numero = (numero - 2) * 2;
			}
		}
		teclado.close();
	}

}
