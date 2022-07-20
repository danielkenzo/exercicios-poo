public class CrachaEstudante extends Cracha  {
	protected String curso;
	
	public void setCurso(String curso){
		this.curso=curso;
	}
	
	public void imprimir(){
	    Impressao.imprimirLinha("ESTUDANTE");
	    Impressao.imprimirLinha("Nome: "+ nome);
	    Impressao.imprimirLinha("Curso: "+ curso);
	}
}
