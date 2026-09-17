/**
 * Ejercicio Resuelto No 4
 * Tema: Edades de la familia de Juan
 * Descripción: A partir de la edad de Juan, se calcula la edad de sus hermanos 
 * y de su madre, donde:
 * - Alberto tiene 2/3 de la edad de Juan
 * - Ana tiene 4/3 de la edad de Juan
 * - La mamá tiene la suma de las edades de los tres hijos
 */

public class Ejercicio4_EdadesJuan {
    
    private double edadJuan;
    private double edadAlberto;
    private double edadAna;
    private double edadMama;
    
    /**
     * Constructor que recibe la edad de Juan
     */
    public Ejercicio4_EdadesJuan(double edadJuan) {
        this.edadJuan = edadJuan;
        calcularEdades();
    }
    
    /**
     * Calcula las edades de todos los miembros de la familia
     */
    private void calcularEdades() {
        this.edadAlberto = (2.0 / 3.0) * this.edadJuan;
        this.edadAna = (4.0 / 3.0) * this.edadJuan;
        this.edadMama = this.edadJuan + this.edadAlberto + this.edadAna;
    }
    
    /**
     * Obtiene la edad de Juan
     */
    public double getEdadJuan() {
        return this.edadJuan;
    }
    
    /**
     * Obtiene la edad de Alberto
     */
    public double getEdadAlberto() {
        return this.edadAlberto;
    }
    
    /**
     * Obtiene la edad de Ana
     */
    public double getEdadAna() {
        return this.edadAna;
    }
    
    /**
     * Obtiene la edad de la mamá
     */
    public double getEdadMama() {
        return this.edadMama;
    }
    
    /**
     * Muestra las edades de toda la familia
     */
    public void mostrarEdades() {
        System.out.println("\n=== EDADES DE LA FAMILIA DE JUAN ===");
        System.out.printf("Edad de Juan: %.2f años%n", this.edadJuan);
        System.out.printf("Edad de Alberto: %.2f años%n", this.edadAlberto);
        System.out.printf("Edad de Ana: %.2f años%n", this.edadAna);
        System.out.printf("Edad de la Mamá: %.2f años%n", this.edadMama);
        System.out.println("=====================================\n");
    }
    
    /**
     * Método main para probar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Resuelto No 4");
        System.out.println("Cálculo de edades de la familia de Juan\n");
        
        // Crear instancia con edad de Juan
        Ejercicio4_EdadesJuan familia = new Ejercicio4_EdadesJuan(30);
        
        // Mostrar las edades calculadas
        familia.mostrarEdades();
    }
}
