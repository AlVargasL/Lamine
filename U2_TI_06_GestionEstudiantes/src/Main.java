//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso c = new Curso("1234", "UTEZ", 3);

        Estudiante e1 = new Estudiante("Alan", "alan@gmail.com", 8.5);
        Estudiante e2 = new Estudiante("Emir", "emir@gmail.com", 9);
        Estudiante e3 = new Estudiante("Kevin", "kevin@gmail.com", 8);

        c.inscribir(e1);
        c.inscribir(e2);
        c.inscribir(e3);

        System.out.println("-------------------------------");
        System.out.println("El promedio del grupo es :" + c.calcularPromedio());
        System.out.println("-------------------------------");

    }
}