import java.util.Scanner;

public class CampoMinado {

  public static int verificarBombas(int l, int c, int matriz[][], int numLinhas, int numColunas)
  {
    int numBombas=0;
    numLinhas-=1;
    numColunas-=1;

    //caso 1
    if(l==0 && c==0)
    {
      if(matriz[l][c+1]==1)
        numBombas+=1;

      if(matriz[l+1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c+1]==1)
        numBombas+=1;
    }

    //caso 2
    else if(l==0 && c==numColunas)
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l+1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c]==1)
        numBombas+=1;
    }

    //caso 3
    else if(l==numLinhas && c==0)
    {
      if(matriz[l][c+1]==1)
        numBombas+=1;

      if(matriz[l-1][c+1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c]==1)
        numBombas+=1;
    }

    //caso 4
    else if(l==numLinhas && c==numColunas)
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l-1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c]==1)
        numBombas+=1;
    }

    //caso 5
    else if(l==0 && c!=numColunas && c!=0)
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l][c+1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c+1]==1)
        numBombas+=1;
    }

    //caso 6
    else if(l!=0 && l!=numLinhas && c==0)
    {
      if(matriz[l][c+1]==1)
        numBombas+=1;

      if(matriz[l-1][c]==1)
        numBombas+=1;
      
      if(matriz[l-1][c+1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c+1]==1)
        numBombas+=1;
    }

    //caso 7
    else if(l!=0 && l!=numLinhas && c==numColunas)
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l-1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c-1]==1)
        numBombas+=1;
    }

    //caso 8
    else if(l==numLinhas && c!=numColunas && c!=0)
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l][c+1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c]==1)
        numBombas+=1;
      
      if(matriz[l-1][c+1]==1)
        numBombas+=1;
    }

    //caso 9
    else
    {
      if(matriz[l][c-1]==1)
        numBombas+=1;

      if(matriz[l][c+1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l+1][c]==1)
        numBombas+=1;
      
      if(matriz[l+1][c+1]==1)
        numBombas+=1;

      if(matriz[l-1][c-1]==1)
        numBombas+=1;
      
      if(matriz[l-1][c]==1)
        numBombas+=1;
      
      if(matriz[l-1][c+1]==1)
        numBombas+=1;
    }

    return numBombas;
  }
  
  public static void imprimir(String texto, boolean pulaLinha){
    if(pulaLinha){
      System.out.println(texto);
    }
    
    else{  
      System.out.print(texto);
    }
    
  }
  
  public static void main(String[] args) {
    imprimir("Programa válido para matrizes maiores ou iguais a 3x3", true);
    
    Scanner leitor = new Scanner(System.in);
    
    imprimir("Digite o número de linhas: ",false);
    int numLinhas = leitor.nextInt();
    imprimir("Digite o número de colunas: ",false);
    int numColunas = leitor.nextInt();
    
    int numBombas=0;
    int[][] matriz = new int[numLinhas][numColunas];

    //Montando a matriz
    imprimir("\nDigite os elementos da matriz (1 ou 0)",true);
    for (int linha = 0; linha < numLinhas; linha++){
      for (int coluna = 0; coluna < numColunas; coluna++){
        System.out.print("linha "+linha + ", coluna "+ coluna+": ");
        matriz[linha][coluna] = leitor.nextInt();          
      }
    }

    System.out.println();
    for (int linha = 0; linha < numLinhas; linha++){
      for (int coluna = 0; coluna < numColunas; coluna++){
        System.out.print(matriz[linha][coluna]+" ");          
      }
      System.out.println();
    }
    
    System.out.println();
    imprimir("Observação, o indíce das linhas/colunas começam do 0",true);
    imprimir("Digite o índice da linha a ser analisada: ",false);
    int linhaEscolhida = leitor.nextInt();
    
    imprimir("Digite o índice da coluna a ser analisada: ",false);
    int colunaEscolhida = leitor.nextInt();
    System.out.println();

    //Função que retornar o número de bombas encontradas ao redor do local escolhido
    numBombas=verificarBombas(linhaEscolhida, colunaEscolhida, matriz, numLinhas, numColunas);

    imprimir("Número de bombas ao redor: ",false);
    System.out.print(numBombas);    
  }
}
