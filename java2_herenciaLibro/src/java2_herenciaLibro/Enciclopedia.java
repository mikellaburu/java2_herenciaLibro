package java2_herenciaLibro;

//subclase
public class Enciclopedia extends Libro {

	//atributos
	private int tomos;
	private int conceptos;
	private String tipo;

	//getters
	public int getTomos() {
		return this.tomos;
	}

	public int getConceptos() {
		return this.conceptos;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	//setters
	public void setTomos(int cantidadTomos) {
		this.tomos = cantidadTomos;
	}

	public void setConceptos(int cantidadConceptos) {
		this.conceptos = cantidadConceptos;
	}
	
	public void setTipo(String tipoEnciclopedia) {
		this.tipo = tipoEnciclopedia;
	}
	
}