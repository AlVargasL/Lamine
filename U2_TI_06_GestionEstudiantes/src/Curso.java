public class Curso {

    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];
    }

    public boolean inscribir(Estudiante e) {
        for(int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] == null) {
                inscritos[i] = e;
                return true;
            }
        }
        return false;
    }

    public double calcularPromedio() {
        double suma = 0;
        int contador = 0;
        for (Estudiante e : inscritos) {
            if (e != null) {
                suma += e.getPromedio();
                contador ++;
            }
        }
        return (contador > 0) ? suma / contador : 0;
    }

}