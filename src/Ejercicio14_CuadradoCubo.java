/**
 * Ejercicio Propuesto No 14
 * Tema: Calculo de cuadrado y cubo de un numero
 * Descripcion: Lee un numero y obtiene su cuadrado y su cubo.
 */

public class Ejercicio14_CuadradoCubo {
    
    private double numero;
    private double cuadrado;
    private double cubo;
    
    /**
     * Constructor que recibe el numero a calcular
     */
    public Ejercicio14_CuadradoCubo(double numero) {
        this.numero = numero;
        calcularPotencias();
    }
    
    /**
     * Calcula el cuadrado y el cubo del numero
     */
    private void calcularPotencias() {
        this.cuadrado = this.numero * this.numero;
        this.cubo = this.numero * this.numero * this.numero;
    }
    
    /**
     * Obtiene el numero original
     */
    public double getNumero() {
        return this.numero;
    }
    
    /**
     * Obtiene el cuadrado del numero
     */
    public double getCuadrado() {
        return this.cuadrado;
    }
    
    /**
     * Obtiene el cubo del numero
     */
    public double getCubo() {
        return this.cubo;
    }
    
    /**
     * Establece un nuevo numero y recalcula
     */
    public void setNumero(double numero) {
        this.numero = numero;
        calcularPotencias();
    }
    
    /**
     * Muestra los resultados del calculo
     */
    public void mostrarResultados() {
        System.out.println("\n=== CALCULO DE CUADRADO Y CUBO ===");
        System.out.printf("Numero ingresado: %.2f%n", this.numero);
        System.out.println("-".repeat(35));
        System.out.printf("Cuadrado (%.2f²): %.2f%n", this.numero, this.cuadrado);
        System.out.printf("Cubo (%.2f³): %.2f%n", this.numero, this.cubo);
        System.out.println("===================================\n");
    }
    
    /**
     * Metodo main para probar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Propuesto No 14");
        System.out.println("Calculo de Cuadrado y Cubo de un Numero\n");
        
        // Ejemplo 1
        Ejercicio14_CuadradoCubo calc1 = new Ejercicio14_CuadradoCubo(5);
        calc1.mostrarResultados();
        
        // Ejemplo 2
        Ejercicio14_CuadradoCubo calc2 = new Ejercicio14_CuadradoCubo(7);
        calc2.mostrarResultados();
        
        // Ejemplo 3 con decimal
        Ejercicio14_CuadradoCubo calc3 = new Ejercicio14_CuadradoCubo(2.5);
        calc3.mostrarResultados();
        
        // Ejemplo 4 con numero negativo
        Ejercicio14_CuadradoCubo calc4 = new Ejercicio14_CuadradoCubo(-3);
        calc4.mostrarResultados();
    }
}
