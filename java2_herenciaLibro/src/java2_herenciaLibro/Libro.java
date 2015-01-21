package java2_herenciaLibro;

//superclase
public class Libro {
	
		//atributos
		private String tipoLibro;
		private int paginas;
		private String ISBN;
		private String nombre;
		private String editorial;

		//constructor por defecto
		Libro() {
			this.tipoLibro = "";
			this.paginas = 0;
			this.ISBN = "";
			this.nombre = "";
		}

		//getters
		public String getTipoLibro() {
			return this.tipoLibro;
		}

		public int getPaginas() {
			return this.paginas;
		}

		public String getISBN() {
			return this.ISBN;
		}

		public String getNombre() {
			return this.nombre;
		}

		public String getEditorial() {
			return this.editorial;
		}

		//setters
		public void setTipoLibro(String tipo) {
			this.tipoLibro = tipo;
		}

		public void setPaginas(int cantidad) {
			this.paginas = cantidad;
		}

		public void setISBN(String id) {
			this.ISBN = id;
		}

		public void setNombre(String nombreLibro) {
			this.nombre = nombreLibro;
		}

		public void setEditorial(String nombreEditorial) {
			this.editorial = nombreEditorial;
		}
		
		//metodo de superclase
		public void leer() {
			
			System.out.println("Leer libro...");
		}

}
