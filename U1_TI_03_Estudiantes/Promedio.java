package U1_TI_03_Estudiantes;
import U1_TI_03_Estudiantes.U1_TI_03_Estudiantes_Promedio.Estudiante;

public class Promedio {
    public static void main(String[] args) {
        // Crear un arreglo de 5 estudiantes
        Estudiante[] estudiantes = new Estudiante[5];

        // Crear y asignar datos a cada estudiante
        for (int i = 0; i < 5; i++) {
            Estudiante e = new Estudiante();
            e.setNombre("Estudiante " + (i + 1));
            e.setMatricula("20243ds00" + (i + 1));

            // Asignar 5 notas usando setNota
            e.setNota(0, 80);
            e.setNota(1, 75);
            e.setNota(2, 90);
            e.setNota(3, 60);
            e.setNota(4, 85);

            estudiantes[i] = e;
        }

        // Mostrar los datos
        for (int i = 0; i < 5; i++) {
            Estudiante e = estudiantes[i];
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matrícula: " + e.getMatricula());
            System.out.printf("Promedio: %.2f\n", e.calcularPromedio());
            System.out.println("¿Aprobado?: " + (e.aprobado() ? "Sí" : "No"));
            System.out.println("-------------------------");
        }
    }
}
