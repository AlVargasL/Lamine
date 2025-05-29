import javax.swing.JOptionPane;

import Password.UsuarioSeguro;

public class Password {
    public static void main(String[] args) {

        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.println("---------------------------------------------");
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
        usuario.setNombreUsuario(nombreUsuario);



        String password = JOptionPane.showInputDialog("Ingrese su contraseña");
        usuario.setPassword(password);
        System.out.println("---------------------------------------------");



        String intento1 = JOptionPane.showInputDialog("Prueba de autenticación de contraseña:");
        if (usuario.autenticar(intento1)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        System.out.println("---------------------------------------------");



        String intento2 = JOptionPane.showInputDialog("Prueba de autenticación de contraseña:");
        if (usuario.autenticar(intento2)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        System.out.println("---------------------------------------------");
    }
}
