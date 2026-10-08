public class Planeta {

    // 1. Definición del enumerado para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // 2. Declaración de los atributos
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    TipoPlaneta tipo;
    boolean esObservable = false;

    // 3. Constructor de la clase
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, 
                   int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    // 4. Método para imprimir los atributos básicos del planeta
    public void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }

    // 5. Método para calcular la densidad
    public double calcularDensidad() {
        return masa / volumen;
    }

    // 6. Método para determinar si es un planeta exterior
    public boolean esPlanetaExterior() {
        // Un planeta es exterior si su distancia al sol es mayor de 3.4 UA.
        // 1 UA = 149597870 Km.
        double limite = 3.4 * 149597870;
        return distanciaSol > limite;
    }

    // 7. Método main para ejecutar el programa (tal cual la imagen)
    public static void main(String[] args) {
        // Creación del objeto Planeta 1 (Tierra)
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE, true);
        
        planeta1.imprimir();
        System.out.println("Densidad del planeta = " + planeta1.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta1.esPlanetaExterior());
        
        System.out.println(); // Salto de línea para separar las impresiones

        // Creación del objeto Planeta 2 (Júpiter)
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, TipoPlaneta.GASEOSO, true);
        
        planeta2.imprimir();
        System.out.println("Densidad del planeta = " + planeta2.calcularDensidad());
        System.out.println("Es planeta exterior = " + planeta2.esPlanetaExterior());
    }
}
