import java.util.Scanner;
// Clase base CuentaBancaria
class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    // Constructor
    public CuentaBancaria(double saldoInicial, String numeroCuenta, Cliente cliente) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    // Métodos getters
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public Cliente getCliente() {
        return cliente;
    }

    // Métodos principales
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
            return true;
        } else {
            System.out.println("Fondos insuficientes.");
            return false;
        }
    }

    public void transferir(CuentaBancaria destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia realizada a la cuenta: " + destino.getNumeroCuenta());
        } else {
            System.out.println("No se pudo realizar la transferencia.");
        }
    }

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
// Clase Cliente
class Cliente {
    private String nombre;
    private String identificacion;

    // Constructor
    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Identificación: " + identificacion);
    }
}



// Subclase CuentaCorriente
class CuentaCorriente extends CuentaBancaria {
    private static final double COMISION = 0.02;

    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(1000, numeroCuenta, cliente);
    }

    @Override
    public boolean retirar(double monto) {
        double montoConComision = monto + (monto * COMISION);
        System.out.println("Aplicando una comisión del 2%. Monto total a retirar: $" + montoConComision);
        return super.retirar(montoConComision);
    }
}

// Subclase CuentaAhorro
class CuentaAhorro extends CuentaBancaria {
    private static final double SALDO_MINIMO = 100;

    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500, numeroCuenta, cliente);
    }

    @Override
    public boolean retirar(double monto) {
        if (getSaldo() - monto < SALDO_MINIMO) {
            System.out.println("No se puede realizar el retiro. El saldo debe ser mayor o igual a $100.");
            return false;
        }
        return super.retirar(monto);
    }
}

// Clase principal
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear clientes
        Cliente cliente1 = new Cliente("Sebastian Betancourt", "1728454297");
        Cliente cliente2 = new Cliente("Joel Paucar", "1716412059");

        // Crear cuentas
        CuentaBancaria cuentaCorriente = new CuentaCorriente("1201201", cliente1);
        CuentaBancaria cuentaAhorro = new CuentaAhorro("1201202", cliente2);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú de operaciones ---");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Información de cuentas ---");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println();
                    cuentaAhorro.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferir = scanner.nextDouble();
                    System.out.print("Seleccione la cuenta origen (1: Cuenta Corriente, 2: Cuenta Ahorro): ");
                    int cuentaOrigen = scanner.nextInt();
                    if (cuentaOrigen == 1) {
                        cuentaCorriente.transferir(cuentaAhorro, montoTransferir);
                    } else if (cuentaOrigen == 2) {
                        cuentaAhorro.transferir(cuentaCorriente, montoTransferir);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    System.out.print("Seleccione la cuenta (1: Cuenta Corriente, 2: Cuenta Ahorro): ");
                    int cuentaRetiro = scanner.nextInt();
                    if (cuentaRetiro == 1) {
                        cuentaCorriente.retirar(montoRetirar);
                    } else if (cuentaRetiro == 2) {
                        cuentaAhorro.retirar(montoRetirar);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();
                    System.out.print("Seleccione la cuenta (1: Cuenta Corriente, 2: Cuenta Ahorro): ");
                    int cuentaDeposito = scanner.nextInt();
                    if (cuentaDeposito == 1) {
                        cuentaCorriente.depositar(montoDepositar);
                    } else if (cuentaDeposito == 2) {
                        cuentaAhorro.depositar(montoDepositar);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Gracias por utilizar el sistema bancario.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
