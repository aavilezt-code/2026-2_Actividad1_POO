/**
 * Ejercicio 2.5 - Clase Película
 * Modelar una película con métodos privados y públicos.
 */

public class Pelicula {
    // Atributos privados
    private String nombre;
    private String director;
    enum genero {ACCION, COMEDIA, DRAMA, SUSPENSO}
    private genero generoP;
    private int duracion;
    private int anio;
    private double calificacion;
    
    /**
     * Constructor público
     */
    public Pelicula(String nombre, String director, String genero,
                   int duracion, int anio, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.generoP = genero.valueOf(genero.toUpperCase());
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }
    
    // Getters (públicos)
    public String getNombre() { return this.nombre; }
    public String getDirector() { return this.director; }
    public String getGenero() { return this.generoP.toString(); }
    public int getDuracion() { return this.duracion; }
    public int getAnio() { return this.anio; }
    public double getCalificacion() { return this.calificacion; }
    
    // Setters (privados)
    private void setNombre(String nombre) { this.nombre = nombre; }
    private void setDirector(String director) { this.director = director; }
    private void setGenero(String genero) { 
        this.generoP = genero.valueOf(genero.toUpperCase()); 
    }
    private void setDuracion(int duracion) { this.duracion = duracion; }
    private void setAnio(int anio) { this.anio = anio; }
    private void setCalificacion(double calificacion) { 
        this.calificacion = calificacion; 
    }
    
    /**
     * Método privado: determina si es película épica
     */
    private boolean esPeliculaEpica() {
        return this.duracion >= 180;
    }
    
    /**
     * Método privado: calcula valoración
     */
    private String calcularVaIluminación() {
        if (this.calificacion >= 0 && this.calificacion <= 2) {
            return "Muy mala";
        } else if (this.calificacion > 2 && this.calificacion <= 4) {
            return "Mala";
        } else if (this.calificacion > 4 && this.calificacion <= 6) {
            return "Regular";
        } else if (this.calificacion > 6 && this.calificacion <= 7) {
            return "Buena";
        } else if (this.calificacion > 7 && this.calificacion <= 8) {
            return "Muy buena";
        } else if (this.calificacion > 8 && this.calificacion <= 9) {
            return "Excelente";
        } else if (this.calificacion > 9 && this.calificacion <= 10) {
            return "Obra maestra";
        } else {
            return "Calificación inválida";
        }
    }
    
    /**
     * Método público: imprime los datos
     */
    public void imprimir() {
        System.out.println("=== PELÍCULA ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Director: " + this.director);
        System.out.println("Género: " + this.generoP);
        System.out.println("Duración: " + this.duracion + " minutos");
        System.out.println("Año: " + this.anio);
        System.out.println("Calificación: " + this.calificacion);
        System.out.println("Valoración: " + calcularVaIluminación());
        if (esPeliculaEpica()) {
            System.out.println("PELÍCULA ÉPICA (duración >= 180 minutos)");
        }
        System.out.println("================\n");
    }
    
    /**
     * Método main para probar la clase
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2.5 - Métodos con Parámetros\n");
        
        Pelicula p1 = new Pelicula("Inception", "Christopher Nolan", 
                                   "accion", 148, 2010, 8.8);
        p1.imprimir();
        
        Pelicula p2 = new Pelicula("Titanic", "James Cameron", 
                                   "drama", 194, 1997, 7.8);
        p2.imprimir();
    }
}
