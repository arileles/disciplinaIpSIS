public class Uni5Exe04 {

	public static void main(String[] args) {
		double soma = 0;
		double numerador = 3;
		double denominador = 2;
		double apoio = 4;

		for (int count = 1; count <= 20; count++) {
			soma = soma + (numerador / denominador);
			numerador += 2;
			denominador += apoio;
			apoio += 2;
		}
		System.out.println("A soma é: " + soma);
	}

}
