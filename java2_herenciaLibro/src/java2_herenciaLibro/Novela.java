package java2_herenciaLibro;

//subclase
public final class Novela extends Libro {
	
		//atributos
		private String tipoNovela;
		private String argumento;
		private int capitulos;

		//getters
		public String getTipoNovela() {
			return this.tipoNovela;
		}

		public String getArgumento() {
			return this.argumento;
		}

		public int getCapitulos() {
			return this.capitulos;
		}

		//setters
		public void setTipoNovela(String tipo) {
			this.tipoNovela = tipo;
		}

		public void setArgumento(String descripcion) {
			this.argumento = descripcion;
		}

		public void setCapitulos(int cantidadCapitulos) {
			this.capitulos = cantidadCapitulos;
		}
		
		//metodo override
		@Override
		public void leer() {
			
			super.leer();
			System.out.println("Leyendo novela");
		}
}
