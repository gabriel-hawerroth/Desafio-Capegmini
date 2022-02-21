import javax.swing.JOptionPane;

public class anagrama {

	public static void main(String[] args) {

		String palavra = Digite_a_palavra();
		char vetor[];

		// Retira todos os espaços do início, meio e fim das palavras digitadas
		palavra = Retira_Espaco(palavra);

		vetor = new char[palavra.length()];

		// Armazena a palavra em um vetor
		Quebra_Palavra(palavra, vetor);

		// Cria o anagrama
		Calcula_Anagrama(vetor, 0);

		// Termina o código
		System.exit(0);
	}// Fim da classe main

	// Pede ao usuário para digitar uma palavra
	private static String Digite_a_palavra() {
		String palavra = "";
		while (palavra.length() <= 2) {
			palavra = JOptionPane.showInputDialog(null,
					"Digite uma palavra de no minimo 3 caracteres",
					"Calculando Anagrama", JOptionPane.INFORMATION_MESSAGE);
		}
		return palavra;
	}// Fim do método Digite_a_palavra

	/** Mostra a palavra; a palavra é armazenada em um vetor para
	    ficar mais fácil o manuseio */
	private static void Mostra(char[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}// for
		System.out.println("");
	}// Fim do método Mostra

	/** Recebe uma palavra e remove todos os espaços entre, durante e
	    no final de qualquer palavra. */
	private static String Retira_Espaco(String palavra) {
		String alterada = "", interna = (palavra).trim();
		char c;

		for (int i = 0; i < interna.length(); i++) {
			c = interna.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				alterada += c;
			}// if
		}// for

		return alterada;
	}// Fim do método Retira_Espaco

	/** Recebe o vetor contendo a palavra e mostra para o usuário
	    todas as possibilidades de anagrama com esta palavra. */
	private static void Calcula_Anagrama(char vetor[], int k) {
		int i;
		if (k == vetor.length - 1)
			Mostra(vetor);
		else {
			Calcula_Anagrama(vetor, k + 1);
			i = k + 1;
			while (i < vetor.length) {
				Troca_Posicao(vetor, k, i);
				Calcula_Anagrama(vetor, k + 1);
				Troca_Posicao(vetor, k, i);
				i = i + 1;
			}
		}
	}// Fim do método Calcula_Anagrama

	// Efetua a troca das posições desejadas 
	private static void Troca_Posicao(char[] vetor, int k, int i) {
		char aux;
		aux = vetor[i];
		vetor[i] = vetor[k];
		vetor[k] = aux;
	}// Fim metodo Troca_Posicao()

	// Recebe a palavra e um vetor vazio e retorna o vetor contendo a palavra
	private static void Quebra_Palavra(String palavra, char vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = palavra.charAt(i);
		}// for
	}// Fim do método Quebra_Palavra
}// Fim class
