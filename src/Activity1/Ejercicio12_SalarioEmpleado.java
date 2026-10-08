/**
 * Ejercicio Propuesto No 12
 * Tema: Calculo de salario del empleado
 * Descripcion: Un empleado trabaja 48 horas en la semana a razon de $5.000 hora.
 * El porcentaje de retencion en la fuente es del 12.5% del salario bruto.
 * Se desea calcular: salario bruto, retencion en la fuente y salario neto del trabajador.
 */

public class Ejercicio12_SalarioEmpleado {
    
    private double horasSemana;
    private double valorHora;
    private double tasaRetencion;
    private double salarioBruto;
    private double retencionFuente;
    private double salarioNeto;
    
    /**
     * Constructor que inicializa los datos del empleado
     */
    public Ejercicio12_SalarioEmpleado(double horasSemana, double valorHora, double tasaRetencion) {
        this.horasSemana = horasSemana;
        this.valorHora = valorHora;
        this.tasaRetencion = tasaRetencion;
        calcularSalarios();
    }
    
    /**
     * Constructor con valores por defecto (48 horas, $5.000 hora, 12.5% retencion)
     */
    public Ejercicio12_SalarioEmpleado() {
        this(48, 5000, 12.5);
    }
    
    /**
     * Calcula el salario bruto, retencion y salario neto
     */
    private void calcularSalarios() {
        // Calcular salario bruto: horas trabajadas * valor por hora
        this.salarioBruto = this.horasSemana * this.valorHora;
        
        // Calcular retencion en la fuente: salario bruto * porcentaje de retencion
        this.retencionFuente = this.salarioBruto * (this.tasaRetencion / 100.0);
        
        // Calcular salario neto: salario bruto - retencion
        this.salarioNeto = this.salarioBruto - this.retencionFuente;
    }
    
    /**
     * Obtiene el salario bruto
     */
    public double getSalarioBruto() {
        return this.salarioBruto;
    }
    
    /**
     * Obtiene la retencion en la fuente
     */
    public double getRetencionFuente() {
        return this.retencionFuente;
    }
    
    /**
     * Obtiene el salario neto
     */
    public double getSalarioNeto() {
        return this.salarioNeto;
    }
    
    /**
     * Obtiene las horas trabajadas en la semana
     */
    public double getHorasSemana() {
        return this.horasSemana;
    }
    
    /**
     * Obtiene el valor por hora
     */
    public double getValorHora() {
        return this.valorHora;
    }
    
    /**
     * Obtiene la tasa de retencion
     */
    public double getTasaRetencion() {
        return this.tasaRetencion;
    }
    
    /**
     * Muestra el resumen del salario del empleado
     */
    public void mostrarResumenSalario() {
        System.out.println("\n=== CALCULO DE SALARIO DEL EMPLEADO ===");
        System.out.printf("Horas trabajadas en la semana: %.0f horas%n", this.horasSemana);
        System.out.printf("Valor por hora: $%.2f%n", this.valorHora);
        System.out.printf("Tasa de retencion en la fuente: %.2f%%%n", this.tasaRetencion);
        System.out.println("\n" + "-".repeat(40));
        System.out.printf("Salario Bruto: $%.2f%n", this.salarioBruto);
        System.out.printf("Retencion en la Fuente (%.2f%%): $%.2f%n", this.tasaRetencion, this.retencionFuente);
        System.out.println("-".repeat(40));
        System.out.printf("Salario Neto: $%.2f%n", this.salarioNeto);
        System.out.println("=========================================\n");
    }
    
    /**
     * Metodo main para probar el ejercicio
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio Propuesto No 12");
        System.out.println("Calculo de Salario del Empleado\n");
        
        // Crear empleado con datos del problema
        Ejercicio12_SalarioEmpleado empleado = new Ejercicio12_SalarioEmpleado();
        
        // Mostrar el resumen
        empleado.mostrarResumenSalario();
        
        // Ejemplo con datos diferentes
        System.out.println("Ejemplo con datos adicionales:");
        Ejercicio12_SalarioEmpleado empleado2 = new Ejercicio12_SalarioEmpleado(40, 8000, 10);
        empleado2.mostrarResumenSalario();
    }
}
