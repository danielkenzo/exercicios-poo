public class CrachaFuncionario extends Cracha  {
	protected String cargo;
	protected int mes,ano;
	
	public void setCargo(String cargo){
		this.cargo=cargo;
	}
	public void setDataAdmissao(int m, int a){
	    mes=m;
	    ano=a;
	    
	}

	public void imprimir(){
	    Impressao.imprimirLinha("FUNCIONARIO");
	    Impressao.imprimirLinha("Nome: "+ nome);
	    Impressao.imprimirLinha("Cargo: "+ cargo);
	    Impressao.imprimirLinha("Admissao: "+ mes+"/"+ano);
	}
}
