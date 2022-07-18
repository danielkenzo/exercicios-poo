<h2> Enunciado do Exercício📄 </h2>

Escreva um programa que leia uma lista com n inteiros. O programa então irá imprimir os elementos da lista. Essa lista de valores está ordenada (em ordem crescente). As posições livres (final da lista) receberão o valor -1. Por exemplo, a seguir é apresentada uma lista que possui três posições livres (as posições livres sempre estarão no final da lista):

**[11 22 33 44 55 -1 -1 -1]**

Após a leitura da lista, o programa deve ler dois números inteiros (código da operação e valor). O código da operação pode ser:

- 1 (operação inserir): deve inserir o valor na lista, mantendo a ordenação crescente. A inserção somente será realizada se tiver pelo menos um espaço livre.
- 2 (operação remover): deve remover o valor da lista. Após a remoção, haverá mais um espaço livre, que deverá ficar no final da lista (a lista deverá manter-se em ordem crescente). Caso o valor não seja encontrado na lista, a lista não será alterada.

O programa deve conter dois métodos: inserir e remover, conforme descrição a seguir:

- public static boolean inserir(int numero, int[] v): realiza a operação de inserção do numero na lista (v). O retorno (boolean) indica se foi possível realizar a inserção (true) ou não (false).
- public static boolean remover(int numero, int[] v): realiza a operação de remoção do numero da lista (v). O retorno (boolean) indica se foi possível realizar a remoção (true) ou não (false).

Depois de realizar a operação (inserir ou remover), deve ser impresso se a operação foi realizada com sucesso ou não:
- "Inserir: true/false" ou "Remover: true/false"

E, ao final, a lista após a realização da operação deve ser impressa

<h3> Entrada </h3>

- Número de elementos na lista
- Elementos da lista
- Operação: inserir (1) ou remover (2)
- Número usado na operação de inserção ou remoção

<h3> Saída </h3>

- Elementos da lista original
- Nome da operação e retorno (boolean) neste formato: "Inserir: true/false" ou "Remover: true/false"
- Elementos da lista após a operação
