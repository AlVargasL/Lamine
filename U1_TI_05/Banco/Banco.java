import Banco.CuentaBancaria;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) throws Exception {

        CuentaBancaria cb = new CuentaBancaria();

        cb.setTitular("Yamal");

        System.out.println("--------------------------------------");
        System.out.println("Titular: " + cb.getTitular());

        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa monto"));
        cb.depositar(monto);
        System.out.println("Saldo: " + cb.getSaldo());

        System.out.println("--------------------------------------");

        monto = Double.parseDouble(JOptionPane.showInputDialog("Retirar dinero"));
        cb.retirar(monto);
        System.out.println("Saldo: " + cb.getSaldo());

        System.out.println("--------------------------------------");

        monto = Double.parseDouble(JOptionPane.showInputDialog("Retirar dinero"));
        cb.retirar(monto);
        System.out.println("Saldo: " + cb.getSaldo());

        System.out.println("--------------------------------------");
        
    }
}