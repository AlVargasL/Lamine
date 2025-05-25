package U1_TI_03_Estudiantes.U1_TI_03_Estudiantes_Promedio;

public class Estudiante {
    // Atributos privados
    private String nombre;
    private String matricula;
    private double[] notas = new double[5]; // Arreglo de 5 notas

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < 5; i++) { 
            suma += notas[i];
        }
        return suma / 5;
    }

    // Método para verificar si está aprobado
    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }

    // Getters y Setters para nombre y matrícula
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter y Setter para una nota específica
    public double getNota(int i) {
        return notas[i];
    }

    public void setNota(int i, double n) {
        notas[i] = n;
    }
}
