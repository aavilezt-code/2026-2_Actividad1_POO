/**
 * Ejercicio Propuesto No 17
 * Tema: Cálculo de área y perímetro del círculo
 * Descripción: Dado el radio de un círculo, calcula el área del círculo 
 * y la longitud de la circunferencia.
 */

public class Ejercicio17_Circulo {
    
    private double radio;
    private double area;
    private double perimetro;
    private static final double PI = Math.PI;
    
    /**
     * Constructor que recibe el radio del círculo
     */
    public Ejercicio17_Circulo(double radio) {
        this.radio = radio;
        calcularMedidas();
    }
    
    /**
     * Calcula el área y el perímetro del círculo
     */
    private void calcularMedidas() {
        // Área = π * r²
        this.area = PI * this.radio * this.radio;
        
        // Perímetro = 2 * π * r
        this.perimetro = 2 * PI * this.radio;
    }
    
    /**
     * Obtiene el radio del círculo
     */
    public double getRadio() {
        return this.radio;
    }
    
    /**
     * Obtiene el área del círculo
     */
    public double getArea() {
        return this.area;
    }
    
    /**
     * Obtiene el perímetro del círculo
     */
    public double getPerimetro() {
        return this.perimetro;
    }
    
    /**
     * Obtiene el diámetro del círculo
     */
    public double getDiametro() {
        return 2 * this.radio;
    }
    
    /**
     * Establece un nuevo radio y recalcula las medidas
     */
    public void setRadio(double radio) {
        this.radio = radio;
        calcularMedidas();
    }
    
    /**
     * Muestra las medidas del círculo
     */
    public void mostrarMedidas() {
        System.out.println("\n=== MEDIDAS DEL CÍRCULO ===");
        System.out.printf("Radio: %.2f unidades%n", this.radio);
        System.out.printf("Diámetro: %.2f unidades%n", getDiametro());
        System.out.println("-".repeat(28));
        System.out.printf("Área del círculo: %.4f unidades²%n", this.area);
        System.out.printf("Perímetro (Circunferencia): %.4f unidades%n", this.perimetro);
        System.out.println("============================\n");
    }
    
    /**
     * Método main para probar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Propuesto No 17");
        System.out.println("Cálculo de Área y Perímetro del Círculo\n");
        
        // Ejemplo 1: radio = 5
        Ejercicio17_Circulo circulo1 = new Ejercicio17_Circulo(5);
        circulo1.mostrarMedidas();
        
        // Ejemplo 2: radio = 10
        Ejercicio17_Circulo circulo2 = new Ejercicio17_Circulo(10);
        circulo2.mostrarMedidas();
        
        // Ejemplo 3: radio con decimal
        Ejercicio17_Circulo circulo3 = new Ejercicio17_Circulo(3.5);
        circulo3.mostrarMedidas();
        
        // Comparación entre círculos
        System.out.println("\n=== COMPARACIÓN DE CÍRCULOS ===");
        System.out.printf("Círculo 1 (radio %.2f): Área = %.4f%n", 
            circulo1.getRadio(), circulo1.getArea());
        System.out.printf("Círculo 2 (radio %.2f): Área = %.4f%n", 
            circulo2.getRadio(), circulo2.getArea());
        System.out.printf("Diferencia de área: %.4f%n", 
            circulo2.getArea() - circulo1.getArea());
        System.out.println("===============================\n");
    }
}
