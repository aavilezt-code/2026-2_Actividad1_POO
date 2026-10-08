/**
 * Ejercicio 2.1 - Definición de Clases (Página 63)
 * Tema: Modelar el concepto de una persona
 * Descripción: Crear una clase Persona con atributos nombre, apellido, 
 * número de documento y año de nacimiento. Inicializar mediante constructor
 * y permitir la impresión de los datos.
 */

public class Persona {
    
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anioNacimiento;
    
    /**
     * Constructor que inicializa los valores de los atributos
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     * @param numeroDocumento el número de documento de la persona
     * @param anioNacimiento el año de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, 
                   String numeroDocumento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
    }
    
    /**
     * Obtiene el nombre de la persona
     * @return el nombre
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene el apellido de la persona
     * @return el apellido
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Obtiene el número de documento de la persona
     * @return el número de documento
     */
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    /**
     * Obtiene el año de nacimiento de la persona
     * @return el año de nacimiento
     */
    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }
    
    /**
     * Método que imprime los valores de los atributos del objeto
     */
    public void imprimir() {
        System.out.println("\n=== DATOS DE LA PERSONA ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Número de Documento: " + this.numeroDocumento);
        System.out.println("Año de Nacimiento: " + this.anioNacimiento);
        System.out.println("===========================\n");
    }
    
    /**
     * Método main que crea dos personas y muestra sus valores
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2.1 - Definición de Clases");
        System.out.println("Tema: Modelar una Persona\n");
        
        // Crear primera persona
        Persona persona1 = new Persona("Juan", "Pérez", "1234567890", 1990);
        persona1.imprimir();
        
        // Crear segunda persona
        Persona persona2 = new Persona("María", "García", "0987654321", 1995);
        persona2.imprimir();
        
        // Crear tercera persona
        Persona persona3 = new Persona("Carlos", "López", "1122334455", 1988);
        persona3.imprimir();
    }
}
