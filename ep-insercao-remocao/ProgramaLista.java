import java.util.Scanner;

public class Main {
  
  public static boolean inserir(int numero, int[] v) {
    boolean verificar=false;

    //Procura na lista o valor -1
    //Caso exista, é possível inserir o número na lista
    for(int i=0;i<v.length;i++)
      if(v[i]==-1)
        verificar=true;
    
    if(!verificar)
      return false;
      
    else{
      int indice=0;

      //procura o índice em que o número vai ser inserido
      for (int i=0;i<v.length;i++){
        
        if(numero<v[i]){
          indice=i;
          break;
        }
            
        else if(v[i]==-1){
          indice=i;
          break;
        }
      }

      int num_anterior=v[indice];
      int num_atual=numero;
      
      //Insere o novo número na posição correta e realoca os outros elementos
      for(int i=indice;i<v.length;i++){
        if(i!=v.length-1){
          num_anterior=v[i];
          v[i]=num_atual;
          num_atual=num_anterior;
        }

        else
          v[i]=num_atual;
      } 
      return true;
    }
  }
    
  public static boolean remover(int numero, int[] v) {
    int indice=0;
    boolean verificar=false;

    //Verifica se o número existe no vetor
    //Caso exista, guardamos o índice dele
    for (int i=0;i<v.length;i++){  
      if(numero==v[i]){
        indice=i;
        verificar=true;
        break;
      }
    }

    //Caso o número não exista
    if(!verificar)
      return false;

    //Caso o número exista no vetor
    else{

      //Caso o número seja o último elemento do vetor
      if(indice==v.length-1){
        v[indice]=-1;
        return true;
      }
      
      else{
        int prox_num=v[indice+1];

        //Remoção do número do vetor e realocação dos elementos
        for(int i=indice;i<v.length-1;i++){
          
          if(i==v.length-2){
            v[i]=v[i+1];
            v[i+1]=-1;
          }
          
          else{
            v[i]=prox_num;
            prox_num=v[i+2];
          }
        }
        
        return true;
      }
    }
  }
    
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
      
    System.out.print("Digite o número de elementos do vetor: ");
    int numElementos = leitor.nextInt();
    int[] vetor = new int[numElementos];

    //Adicionando elementos ao vetor
    System.out.println("\nDigite os elementos do vetor:");
    System.out.println("Obs: Os elementos devem ser inseridos em ordem crescente (com exeção do -1) e serem maiores ou iguais a 0");
    for (int i = 0; i < numElementos; i++){
      System.out.print((i+1)+"° elemento: ");
      vetor[i]= leitor.nextInt();        
    }

    System.out.println("\nOperação 1 = inserir elemento da lista");
    System.out.println("Operação 2 = remover elemento da lista\n ");
    System.out.print("Digite a operação desejada: ");
    int operacao = leitor.nextInt();
    
    System.out.print("Digite o número que deseja inserir/remover: ");
    int numero = leitor.nextInt();
    

    //Impresão do vetor original
    for(int i=0;i<vetor.length-1;i++)
      System.out.print(vetor[i]+" ");
    System.out.println(vetor[vetor.length-1]);

    boolean resultado;
    if(operacao==1){
      //Função que verifica se é possível inserir mais algum elemento na lista
      resultado=inserir(numero,vetor);
        
      if(!resultado){
        System.out.println("Inserir: false");
        for(int i=0;i<vetor.length-1;i++)
          System.out.print(vetor[i]+" ");
        System.out.println(vetor[vetor.length-1]);
        System.out.println("Não foi possível inserir o elemento na lista, ela está cheia");
      }
        
      else{
        System.out.println("Inserir: true");

        //Impressão do vetor após a inserção
        for(int i=0;i<vetor.length-1;i++)
          System.out.print(vetor[i]+" ");
        System.out.println(vetor[vetor.length-1]);
        System.out.println("Elemento inserido na lista com sucesso");
      }
    }

 
    else if (operacao==2){
      //Função que verifica se o elemento existe na lista
      resultado=remover(numero,vetor);
        
      if(!resultado){
        System.out.println("Remover: false");
        for(int i=0;i<vetor.length-1;i++)
          System.out.print(vetor[i]+" ");
        System.out.println(vetor[vetor.length-1]);
        System.out.println("Elemento não encontrado");
      }
        
      else{
        System.out.println("Remover: true");
        
        //Impressão do vetor após a remoção
        for(int i=0;i<vetor.length-1;i++)
          System.out.print(vetor[i]+" ");
        System.out.println(vetor[vetor.length-1]);
        System.out.println("Elemento removido da lista com sucesso");
      }
    }
  }
  
}
