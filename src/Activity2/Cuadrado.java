public class Cuadrado {
    double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() { return this.lado; }
    public void setLado(double lado) { this.lado = lado; }
    
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
    public double calcularPerimetro() {
        return 4 * this.lado;
    }
    
    public void imprimir() {
        System.out.println("=== CUADRADO ===");
        System.out.println("Lado: " + this.lado + " cm");
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm\n");
    }
}
