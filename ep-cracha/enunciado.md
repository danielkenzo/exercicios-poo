<h2> Enunciado do Exercício📄 </h2>

Implemente as classes Cracha, CrachaEstudante e CrachaFuncionario conforme apresentado no diagrama UML a seguir:


![DiagramaUMLCracha](https://user-images.githubusercontent.com/80485432/179897344-934afa75-240e-48de-b581-d0aa01d60e52.png)


A seguir, é apresentada uma descrição das classes apresentadas no diagrama UML.

**Classe abstrata Cracha:**
- public void setNome(String nome): armazena o nome.
- public abstract void imprimir(): método abstrato que será implementado pelas subclasses.

**Classe CrachaEstudante (subclasse de Cracha):**
- public void setCurso(String curso): armazena o nome do curso.
- public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaEstudante, a impressão deve ser de acordo com o seguinte formato:
  
  ESTUDANTE
 
  Nome:<nome do estudante>
  
  Curso:  <nome do curso>

  
**Classe CrachaFuncionario (subclasse de Cracha):**
- public void setCargo(String cargo): armazena o cargo.
- public void setDataAdmissao(int m, int a): armazena o mês (parâmetro m) e o ano (parâmetro a) de admissão.
- public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaFuncionario, a impressão deve ser de acordo com o seguinte formato:
  
  FUNCIONARIO
  
  Nome: <nome do funcionário>
  
  Cargo: <cargo do funcionário>
  
  Admissao: <mes/ano de admissão do funcionário>
  
Para realizar a impressão, use Impressao.imprimirLinha(String texto), por exemplo:

Impressao.imprimirLinha("FUNCIONARIO");
A classe Impressao com o método static imprimirLinha já existe no sistema de correção automática.
