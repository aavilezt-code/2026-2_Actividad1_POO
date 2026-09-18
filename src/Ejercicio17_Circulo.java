/**
 * Ejercicio Propuesto No 17
 * Tema: Calculo de area y perimetro del circulo
 * Descripcion: Dado el radio de un circulo, calcula el area del circulo 
 * y la longitud de la circunferencia.
 */

public class Ejercicio17_Circulo {
    
    private double radio;
    private double area;
    private double perimetro;
    private static final double PI = Math.PI;
    
    /**
     * Constructor que recibe el radio del circulo
     */
    public Ejercicio17_Circulo(double radio) {
        this.radio = radio;
        calcularMedidas();
    }
    
    /**
     * Calcula el area y el perimetro del circulo
     */
    private void calcularMedidas() {
        // Area = π * r²
        this.area = PI * this.radio * this.radio;
        
        // Perimetro = 2 * π * r
        this.perimetro = 2 * PI * this.radio;
    }
    
    /**
     * Obtiene el radio del circulo
     */
    public double getRadio() {
        return this.radio;
    }
    
    /**
     * Obtiene el area del circulo
     */
    public double getArea() {
        return this.area;
    }
    
    /**
     * Obtiene el perimetro del circulo
     */
    public double getPerimetro() {
        return this.perimetro;
    }
    
    /**
     * Obtiene el diametro del circulo
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
     * Muestra las medidas del circulo
     */
    public void mostrarMedidas() {
        System.out.println("\n=== MEDIDAS DEL CIRCULO ===");
        System.out.printf("Radio: %.2f unidades%n", this.radio);
        System.out.printf("Diametro: %.2f unidades%n", getDiametro());
        System.out.println("-".repeat(28));
        System.out.printf("Area del circulo: %.4f unidades²%n", this.area);
        System.out.printf("Perimetro (Circunferencia): %.4f unidades%n", this.perimetro);
        System.out.println("============================\n");
    }
    
    /**
     * Metodo main para probar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Propuesto No 17");
        System.out.println("Calculo de Area y Perimetro del Circulo\n");
        
        // Ejemplo 1: radio = 5
        Ejercicio17_Circulo circulo1 = new Ejercicio17_Circulo(5);
        circulo1.mostrarMedidas();
        
        // Ejemplo 2: radio = 10
        Ejercicio17_Circulo circulo2 = new Ejercicio17_Circulo(10);
        circulo2.mostrarMedidas();
        
        // Ejemplo 3: radio con decimal
        Ejercicio17_Circulo circulo3 = new Ejercicio17_Circulo(3.5);
        circulo3.mostrarMedidas();
        
        // Comparacion entre circulos
        System.out.println("\n=== COMPARACION DE CIRCULOS ===");
        System.out.printf("Circulo 1 (radio %.2f): Area = %.4f%n", 
            circulo1.getRadio(), circulo1.getArea());
        System.out.printf("Circulo 2 (radio %.2f): Area = %.4f%n", 
            circulo2.getRadio(), circulo2.getArea());
        System.out.printf("Diferencia de area: %.4f%n", 
            circulo2.getArea() - circulo1.getArea());
        System.out.println("===============================\n");
    }
}
