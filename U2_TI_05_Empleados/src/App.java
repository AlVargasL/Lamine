public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleadoTiempoCompleto = new EmpleadoTiempoCompleto("987654321", "Juan Perez", 10000, "Seguro");
        empleadoTiempoCompleto.calcularSalario();

        Empleado empleadoPorHoras = new EmpleadoPorHoras("123456789", "Juan Perez", 10000, 8);
        empleadoPorHoras.calcularSalario();
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Salario de empleado tiempo completo: " + empleadoTiempoCompleto.calcularSalario());
        System.out.println("Salario de empleado por horas: " + empleadoPorHoras.calcularSalario());
        System.out.println("----------------------------------------------------------------");
    }
}
