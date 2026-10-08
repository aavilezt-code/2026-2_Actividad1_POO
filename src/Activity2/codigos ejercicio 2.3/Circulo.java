public class Circulo {
    double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() { return this.radio; }
    public void setRadio(double radio) { this.radio = radio; }
    
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
    
    public void imprimir() {
        System.out.println("=== CÍRCULO ===");
        System.out.println("Radio: " + this.radio + " cm");
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm\n");
    }
}
