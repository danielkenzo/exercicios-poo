import java.util.Scanner;

public class Main {    
  public static int ordenar(int[] vetor) {
    int qtdTrocas = 0;
    
    for (int i = 0; i < vetor.length - 1; i++) {
      int indiceMenorElemento = i;

      //Procura qual o elemento de menor valor a partir da posição i
      //E pegamos o índice desse elemento
      for (int k = i + 1; k < vetor.length; k++){
        if (vetor[k] < vetor[indiceMenorElemento]){
          indiceMenorElemento = k;
        }
      }

      //Verifica se o elemento já está na posição correta
      //Caso não esteja, movemos ele até a posicão certa
			if (i != indiceMenorElemento) {
        int tmp = vetor[i];
				vetor[i] = vetor[indiceMenorElemento];
				vetor[indiceMenorElemento] = tmp;
				qtdTrocas++;
			}
		}
		return qtdTrocas;
  }
	
	public static void imprimir(int[] v) {
    for (int i = 0; i < v.length - 1; i++)
			System.out.print(v[i] + " ");
		System.out.println(v[v.length - 1]);
	}
    
  public static void main(String[] args) {
    
    //Usuário digita tamanho do vetor
    System.out.print("Digite o tamanho do vetor: ");
    Scanner leitor = new Scanner(System.in);
		int tamanhoVetor = 0;
    tamanhoVetor = leitor.nextInt();

    //Verifica se o tamanho do vetor é maior que 0
    while(tamanhoVetor<=0){
      System.out.println("\nTamanho inválido. Digite um valor maior que 0\n");
      System.out.print("Digite o tamanho do vetor: ");
      tamanhoVetor = leitor.nextInt();
    }

    //Instancia o vetor
		int[] vetor = new int[tamanhoVetor];

    System.out.println("\nDigite os elementos do vetor: ");
    for (int i = 0; i < tamanhoVetor; i++){
      System.out.print("\n"+(i+1)+"° elemento: ");
      vetor[i] = leitor.nextInt();
    }
			
		//Imprime o vetor antes da ordenação
    System.out.print("\nVetor antes da ordenação: ");
		imprimir(vetor);

    //Ordena o vetor e retorna o número de trocas realizadas
		int qtdTrocas = ordenar(vetor);
		
    //Imprime o vetor depois da ordenação
    System.out.print("Vetor após a ordenação: ");
    imprimir(vetor);
		System.out.println("Número de trocas: " + qtdTrocas);
    }
}
