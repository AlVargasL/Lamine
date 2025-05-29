package Password;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario .trim().isEmpty()) {
            this.nombreUsuario = nombreUsuario;
            System.out.println("El nombre del usuario es: " + nombreUsuario);
        } else {
            System.out.println("El nombre del usuario no puede ser nulo");
        }
    }

    public void setPassword(String password) {
        if (password == null) {
            System.out.println("La contraseña no puede ser nula.");
        }
    
        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }
    
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;
    
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
    
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                digito = true;
            }
        }
    
        if (!mayuscula) {
            System.out.println("La contraseña debe tener al menos una mayúscula.");
        }
        if (!minuscula) {
            System.out.println("La contraseña debe tener al menos una minúscula.");
        }
        if (!digito) {
            System.out.println("La contraseña debe tener al menos un dígito.");
        }
    
        if (mayuscula && minuscula && digito) {
            this.password = password;
            System.out.println("Contraseña guardada.");
        }
    }

    public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }

    public boolean estaInicializado() {
        return nombreUsuario != null && password != null;
    }
    
}