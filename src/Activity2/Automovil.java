/**
 * Ejercicio 2.2 - Clase Automóvil
 * Modelar un automóvil con múltiples atributos y métodos.
 */

public class Automovil {
    // Atributos
    String marca;
    int modelo;
    double motor;
    String tipoCombustible;
    String tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    double velocidadMaxima;
    String color;
    double velocidadActual;
    
    /**
     * Constructor que inicializa todos los atributos
     */
    public Automovil(String marca, int modelo, double motor, 
                     String tipoCombustible, String tipoAutomovil,
                     int numeroPuertas, int cantidadAsientos,
                     double velocidadMaxima, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }
    
    // Getters
    public String getMarca() { return this.marca; }
    public int getModelo() { return this.modelo; }
    public double getMotor() { return this.motor; }
    public String getTipoCombustible() { return this.tipoCombustible; }
    public String getTipoAutomovil() { return this.tipoAutomovil; }
    public int getNumeroPuertas() { return this.numeroPuertas; }
    public int getCantidadAsientos() { return this.cantidadAsientos; }
    public double getVelocidadMaxima() { return this.velocidadMaxima; }
    public String getColor() { return this.color; }
    public double getVelocidadActual() { return this.velocidadActual; }
    
    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public void setMotor(double motor) { this.motor = motor; }
    public void setTipoCombustible(String tipoCombustible) { 
        this.tipoCombustible = tipoCombustible; 
    }
    public void setTipoAutomovil(String tipoAutomovil) { 
        this.tipoAutomovil = tipoAutomovil; 
    }
    public void setNumeroPuertas(int numeroPuertas) { 
        this.numeroPuertas = numeroPuertas; 
    }
    public void setCantidadAsientos(int cantidadAsientos) { 
        this.cantidadAsientos = cantidadAsientos; 
    }
    public void setVelocidadMaxima(double velocidadMaxima) { 
        this.velocidadMaxima = velocidadMaxima; 
    }
    public void setColor(String color) { this.color = color; }
    
    /**
     * Método para acelerar el automóvil
     */
    public void acelerar(double incremento) {
        this.velocidadActual += incremento;
        if (this.velocidadActual > this.velocidadMaxima) {
            System.out.println("No se puede exceder la velocidad máxima");
            this.velocidadActual = this.velocidadMaxima;
        }
    }
    
    /**
     * Método para desacelerar el automóvil
     */
    public void desacelerar(double decremento) {
        this.velocidadActual -= decremento;
        if (this.velocidadActual < 0) {
            System.out.println("No se puede tener velocidad negativa");
            this.velocidadActual = 0;
        }
    }
    
    /**
     * Método para frenar (poner velocidad en cero)
     */
    public void frenar() {
        this.velocidadActual = 0;
    }
    
    /**
     * Método para calcular el tiempo estimado de llegada
     */
    public double calcularTiempoLlegada(double distancia) {
        if (this.velocidadActual == 0) {
            System.out.println("El automóvil debe estar en movimiento");
            return 0;
        }
        return distancia / this.velocidadActual;
    }
    
    /**
     * Método para mostrar los valores de los atributos
     */
    public void imprimir() {
        System.out.println("=== DATOS DEL AUTOMÓVIL ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motor: " + this.motor + " litros");
        System.out.println("Tipo de Combustible: " + this.tipoCombustible);
        System.out.println("Tipo de Automóvil: " + this.tipoAutomovil);
        System.out.println("Número de Puertas: " + this.numeroPuertas);
        System.out.println("Cantidad de Asientos: " + this.cantidadAsientos);
        System.out.println("Velocidad Máxima: " + this.velocidadMaxima + " km/h");
        System.out.println("Color: " + this.color);
        System.out.println("Velocidad Actual: " + this.velocidadActual + " km/h");
        System.out.println("===========================\n");
    }
    
    /**
     * Método main para probar la clase
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2.2 - Atributos con Tipos Primitivos\n");
        
        Automovil auto1 = new Automovil("Toyota", 2023, 2.0, "Gasolina",
                                        "Compacto", 4, 5, 200, "Blanco");
        auto1.imprimir();
        
        // Prueba de aceleración
        System.out.println("Acelerando...");
        auto1.acelerar(80);
        System.out.println("Velocidad actual: " + auto1.getVelocidadActual() + " km/h");
        
        // Prueba de tiempo de llegada
        double tiempo = auto1.calcularTiempoLlegada(160);
        System.out.println("Tiempo estimado para recorrer 160 km: " + tiempo + " horas\n");
    }
}
