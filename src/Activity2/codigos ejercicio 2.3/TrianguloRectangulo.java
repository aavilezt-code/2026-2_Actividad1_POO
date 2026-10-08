public class TrianguloRectangulo {
    double base;
    double altura;
    
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() { return this.base; }
    public double getAltura() { return this.altura; }
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
    }
    
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
    
    public double calcularPerimetro() {
        return this.base + this.altura + calcularHipotenusa();
    }
    
    public String determinarTipo() {
        double hip = calcularHipotenusa();
        if (this.base == this.altura && this.altura == hip) {
            return "Equilátero";
        } else if (this.base == this.altura || this.altura == hip || 
                   this.base == hip) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    public void imprimir() {
        System.out.println("=== TRIÁNGULO RECTÁNGULO ===");
        System.out.println("Base: " + this.base + " cm");
        System.out.println("Altura: " + this.altura + " cm");
        System.out.println("Hipotenusa: " + calcularHipotenusa() + " cm");
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
        System.out.println("Tipo: " + determinarTipo() + "\n");
    }
}
