public class PruebaFiguras {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2.3 - Estado de un Objeto\n");
        
        Circulo c = new Circulo(5);
        c.imprimir();
        
        Rectangulo r = new Rectangulo(4, 6);
        r.imprimir();
        
        Cuadrado cu = new Cuadrado(5);
        cu.imprimir();
        
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        t.imprimir();
    }
}
