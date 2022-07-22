package plano;

public class Prova extends Aula implements Avaliacao {

	private double peso;
	private String data;
	
	public Prova(double peso, String descricao, String data) {
		super.setDescricao(descricao);
		this.peso = peso;
		this.data = data;
	}

	@Override
	public String getTipo() {
		return "Prova";
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
