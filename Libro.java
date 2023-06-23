package Libro;

public class Libro {

	private String titulo;
	private String autor;
	private double numPaginas;
	private double paginasLeidas;
	
	
	Libro(){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumPaginas(0);
		this.setPaginasLeidas(0);
	}
	
	Libro(String titulo, String autor, int numPaginas, int paginasLeidas){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumPaginas(numPaginas);
		this.setPaginasLeidas(paginasLeidas);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public double getPaginasLeidas() {
		return paginasLeidas;
	}

	public void setPaginasLeidas(int paginasLeidas) {
		this.paginasLeidas = paginasLeidas;
	}
	
	
	// metodos
	
	public void porcentajeLeido(){
		System.out.print(((paginasLeidas / numPaginas) * 100));

	}
	

}
