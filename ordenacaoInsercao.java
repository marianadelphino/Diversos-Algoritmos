public class OrdenacaoInsercao {
	/**
	 * Executa Ordenação por Inserção em um vetor de inteiros 
	 * @param array vetor a ordenar
	 */
	public static void insertionSort(int[] array) {
		int j, temp;                                 // declara variáveis j (contador do laço interno) e temp (armazena valor a ser inserido)
		for (int i = 0; i < array.length; i++) {     // laço externo que é incrementado até o comprimento do vetor 
			j = i;                                   // valor do contador do laço interno = valor do contador do laço externo  
			temp = array[i];                         // elemento a ser inserido armazenado em temp 
			while (j != 0 && array[j - 1] > temp) {  // 1* laço interno que determina j diferente de zero e elemento imediatamente a esquerda do elemento a ser inserido maior do que elemento a ser inserido
				array[j] = array[j - 1];             // se a condição 1* do laço interno for obedecida, o elemento de maior valor é deslocado para a direita e
				j--;                                 // j é decrementado por 1 
			}                                        //
			array[j] = temp;                         // finalmente, j assume valor decrementado por 1 (ou não) e o valor a ser inserido é temp 
		}
	}

	
	public static void main(String[] args) {
		// instanciar um vetor e preencher com valores aleatórios
		int[] numbers = new int[] { 17, 26, 5, 2 };

		// imprimir o vetor antes da ordenação 
		System.out.println("Antes da Ordenação por Inserção, o vetor é");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
			System.out.println();
		}

		// chamada do método insertionSort para ordenar o vetor 
		insertionSort(numbers); 

		// imprimir o vetor depois da ordenação 
		System.out.println("\nApós a Ordenação por Inserção, o vetor é");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
			System.out.println();
		}
	}
}
