/**
 * Ejercicio 2.1 - Clase Persona
 * Modelar el concepto de una persona con nombre, apellido, 
 * número de documento y año de nacimiento.
 */

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    String numeroDocumento;
    int anioNacimiento;
    
    /**
     * Constructor que inicializa los valores de los atributos
     */
    public Persona(String nombre, String apellido, 
                   String numeroDocumento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
    }
    
    /**
     * Método que imprime los valores de los atributos del objeto
     */
    public void imprimir() {
        System.out.println("=== DATOS DE LA PERSONA ===");
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
        System.out.println("Ejercicio 2.1 - Definición de Clases\n");
        
        // Crear primera persona
        Persona persona1 = new Persona("Juan", "Pérez", "1234567890", 1990);
        persona1.imprimir();
        
        // Crear segunda persona
        Persona persona2 = new Persona("María", "García", "0987654321", 1995);
        persona2.imprimir();
    }
}
