package Libro;

public class Test {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Borges","Laberinto",100,10);
		Libro libro2 = new Libro("Cortazar", "Bird", 100,50);
		
		
		
		testerLibros(libro1);
		testerLibros(libro2);
	}
		
		public static void testerLibros(Libro libro) {
			System.out.println(libro.getAutor());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getPaginasLeidas());
			System.out.println(libro.getNumPaginas());
			System.out.println("porcentaje Total ----- ");
			
			libro.porcentajeLeido();
			
		}
	}

