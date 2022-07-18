import universidade.Curso;
import universidade.Disciplina;

class Main {
  public static void main(String[] args) {

    boolean disciplinaAdicionada;
    
    Curso curso1 = new Curso();
    curso1.setNome("Ciencia da Computacao");
    curso1.setMaxDisciplinas(3);

    //INSTANCIA DISCIPLINA PE
    Disciplina PE = new Disciplina();
    PE.setNome("Programacao Estruturada"); 
    PE.setQtdCreditos(4);

    disciplinaAdicionada = curso1.adicionarDisciplina(PE);
    System.out.print(PE.getNome()+ " -> ");
    if(disciplinaAdicionada){
      System.out.println("Disciplina adicionada com sucesso");
    }
    else{
      System.out.println("Vetor cheio! Não foi possível adicionar a disciplina");
    }

    //INSTANCIA DISCIPLINA PI
    Disciplina PI = new Disciplina();
    PI.setNome("Processamento da Informação"); 
    PI.setQtdCreditos(2);

    disciplinaAdicionada = curso1.adicionarDisciplina(PI);
    System.out.print(PI.getNome()+ " -> ");
    if(disciplinaAdicionada){
      System.out.println("Disciplina adicionada com sucesso");
    }
    else{
      System.out.println("Vetor cheio! Não foi possível adicionar a disciplina");
    }

    //INSTANCIA DISCIPLINA POO
    Disciplina POO = new Disciplina();
    POO.setNome("Programacao Orientada a Objetos"); 
    POO.setQtdCreditos(5);

    disciplinaAdicionada = curso1.adicionarDisciplina(POO);
    System.out.print(POO.getNome()+ " -> ");
    if(disciplinaAdicionada){
      System.out.println("Disciplina adicionada com sucesso");
    }
    else{
      System.out.println("Vetor cheio! Não foi possível adicionar a disciplina");
    }

    //INSTANCIA DISCIPLINA engSoftware
    Disciplina engSoftware = new Disciplina();
    engSoftware.setNome("Engenharia de Software"); 
    engSoftware.setQtdCreditos(5);

    disciplinaAdicionada = curso1.adicionarDisciplina(engSoftware);
    System.out.print(engSoftware.getNome()+ "-> ");
    if(disciplinaAdicionada){
      System.out.println("Disciplina adicionada com sucesso");
    }
    else{
      System.out.println("Vetor cheio! Não foi possível adicionar a disciplina");
    }

    System.out.println("\nLista de disciplinas da "+ curso1.getNome());
    
    String[] listaDisciplinas = curso1.getListaDisciplinasStr();
    System.out.println(listaDisciplinas[0]);
    System.out.println(listaDisciplinas[1]);
    System.out.println(listaDisciplinas[2]);
  }
}
