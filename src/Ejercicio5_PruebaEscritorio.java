/**
 * Ejercicio Resuelto No 5
 * Tema: Prueba de escritorio (Seguimiento de instrucciones)
 * Descripcion: Realiza un seguimiento paso a paso de las siguientes instrucciones:
 * SUMA = 0
 * X = 20
 * SUMA = SUMA + X
 * Y = 40
 * X = X + Y ** 2
 * SUMA = SUMA + X / Y
 * Mostrar el valor final de SUMA
 */

public class Ejercicio5_PruebaEscritorio {
    
    private double suma;
    private double x;
    private double y;
    
    /**
     * Constructor - Inicializa las variables
     */
    public Ejercicio5_PruebaEscritorio() {
        this.suma = 0;
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Ejecuta el algoritmo paso a paso
     */
    public void ejecutarAlgoritmo() {
        System.out.println("\n=== PRUEBA DE ESCRITORIO - EJERCICIO 5 ===\n");
        
        // Paso 1: SUMA = 0
        this.suma = 0;
        System.out.printf("Paso 1: SUMA = 0 → SUMA = %.2f%n", this.suma);
        
        // Paso 2: X = 20
        this.x = 20;
        System.out.printf("Paso 2: X = 20 → X = %.2f%n", this.x);
        
        // Paso 3: SUMA = SUMA + X
        this.suma = this.suma + this.x;
        System.out.printf("Paso 3: SUMA = SUMA + X → SUMA = 0 + 20 = %.2f%n", this.suma);
        
        // Paso 4: Y = 40
        this.y = 40;
        System.out.printf("Paso 4: Y = 40 → Y = %.2f%n", this.y);
        
        // Paso 5: X = X + Y ** 2
        // Aqui Y**2 significa Y elevado a la potencia 2 (Y cuadrado)
        double valorAnteriorX = this.x;
        this.x = this.x + Math.pow(this.y, 2);
        System.out.printf("Paso 5: X = X + Y ** 2 → X = %.2f + %.2f = %.2f%n", 
            valorAnteriorX, Math.pow(this.y, 2), this.x);
        
        // Paso 6: SUMA = SUMA + X / Y
        double valorAnteriorSuma = this.suma;
        this.suma = this.suma + (this.x / this.y);
        System.out.printf("Paso 6: SUMA = SUMA + X / Y → SUMA = %.2f + (%.2f / %.2f) = %.2f%n", 
            valorAnteriorSuma, this.x, this.y, this.suma);
        
        // Paso 7: Mostrar el resultado final
        System.out.println("\n" + "=".repeat(40));
        System.out.printf("EL VALOR DE LA SUMA ES: %.2f%n", this.suma);
        System.out.println("=".repeat(40) + "\n");
    }
    
    /**
     * Obtiene el valor final de SUMA
     */
    public double getSuma() {
        return this.suma;
    }
    
    /**
     * Obtiene el valor final de X
     */
    public double getX() {
        return this.x;
    }
    
    /**
     * Obtiene el valor final de Y
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Metodo main para ejecutar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Resuelto No 5");
        System.out.println("Prueba de Escritorio - Seguimiento de instrucciones");
        
        // Crear instancia y ejecutar
        Ejercicio5_PruebaEscritorio prueba = new Ejercicio5_PruebaEscritorio();
        prueba.ejecutarAlgoritmo();
        
        // Mostrar valores finales
        System.out.println("Valores finales de variables:");
        System.out.printf("SUMA = %.2f%n", prueba.getSuma());
        System.out.printf("X = %.2f%n", prueba.getX());
        System.out.printf("Y = %.2f%n", prueba.getY());
        System.out.println();
    }
}
