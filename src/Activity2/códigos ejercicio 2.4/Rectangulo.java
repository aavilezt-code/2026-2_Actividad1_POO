public class Rectangulo {
    double base;
    double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() { return this.base; }
    public double getAltura() { return this.altura; }
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
    
    public void imprimir() {
        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Base: " + this.base + " cm");
        System.out.println("Altura: " + this.altura + " cm");
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm\n");
    }
}
