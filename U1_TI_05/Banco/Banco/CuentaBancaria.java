package Banco;

public class CuentaBancaria {

    private String titular;
    private double saldo = 0;

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto; // sumamos el monto a la cuenta
        } else {
            System.out.println("El monto no puede ser negativo");
        }
    }

    // Método para sacar dinero
    public boolean retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto; // sacamos el monto de la cuenta
            } else {
                System.out.println("No hay suficiente dinero en la cuenta");
            }
        } else {
            System.out.println("El monto no puede ser negativo");
        }
            return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}