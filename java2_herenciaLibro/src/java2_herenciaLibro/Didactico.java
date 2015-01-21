package java2_herenciaLibro;

//subclase
public class Didactico extends Libro {

	//atributos
	private String tema;
	private int unidadesDidacticas;

	//getters
	public String getTema() {
		return this.tema;
	}

	public int getUnidadesDidacticas() {
		return this.unidadesDidacticas;
	}

	//setters
	public void setTema(String asignatura) {
		this.tema = asignatura;
	}

	public void setUnidadesDidacticas(int cantidad) {
		this.unidadesDidacticas = cantidad;
	}
	
	//metodo override
	@Override
	public void leer() {
		
		super.leer();
		System.out.println("Estudiando unidad didactica");
	}

}
