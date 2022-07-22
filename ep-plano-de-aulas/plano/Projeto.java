package plano;

public class Projeto extends Aula implements Avaliacao{
	private double peso;
	private String data;
	
	public Projeto(double peso, String descricao, String data) {
		super.setDescricao(descricao);
		this.peso = peso;
		this.data = data;
	}

	@Override
	public String getTipo() {
		return "Projeto";
	}
	
	@Override
	public double getPeso() {
		return this.peso;		
	}

    @Override
	public String getDataEntrega(){
	    return data;
	}
}
