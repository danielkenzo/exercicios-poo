package universidade;

public class Disciplina {
  public String nomeDisciplina;
  public int qtdCreditos;

  public void setNome(String nomeDisciplina){
    this.nomeDisciplina=nomeDisciplina;
  }

  public String getNome(){
    return this.nomeDisciplina;
  }

  public void setQtdCreditos(int qtdCreditos){
    this.qtdCreditos=qtdCreditos;
  }

  public int getQtdCreditos(){
    return this.qtdCreditos;
  }
}
