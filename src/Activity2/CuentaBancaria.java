/**
 * Ejercicio 2.4 - Clase CuentaBancaria
 * Modelar una cuenta bancaria con métodos de consignación y retiro.
 */

public class CuentaBancaria {
    // Atributos
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    double saldo;
    
    /**
     * Constructor que inicializa los atributos
     */
    public CuentaBancaria(String nombresTitular, String apellidosTitular,
                          int numeroCuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }
    
    /**
     * Método para consignar dinero (sin valor de retorno)
     */
    public void consignar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Consignación exitosa: $" + valor);
    }
    
    /**
     * Método para retirar dinero (retorna boolean)
     */
    public boolean retirar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar el retiro");
            return false;
        }
        this.saldo = this.saldo - valor;
        System.out.println("Retiro exitoso: $" + valor);
        return true;
    }
    
    /**
     * Método para consultar el saldo (sin valor de retorno)
     */
    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + this.saldo);
    }
    
    /**
     * Método para imprimir los datos de la cuenta
     */
    public void imprimir() {
        System.out.println("=== DATOS DE LA CUENTA ===");
        System.out.println("Titular: " + this.nombresTitular + " " + 
                          this.apellidosTitular);
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("==========================\n");
    }
    
    /**
     * Método main para probar la clase
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 2.4 - Métodos con y sin Valores de Retorno\n");
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "Pérez", 
                                                     1001, tipo.AHORROS);
        cuenta1.imprimir();
        
        cuenta1.consignar(5000);
        cuenta1.consultarSaldo();
        
        cuenta1.retirar(2000);
        cuenta1.consultarSaldo();
        
        cuenta1.retirar(5000);
        cuenta1.consultarSaldo();
    }
}
