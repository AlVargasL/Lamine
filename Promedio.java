public class Promedio {
    public static void main(String[] args) {
        String x1 = JOptionPane.showInputDialog("dame un numero");
        String x2 = JOptionPane.showInputDialog("dame otro numero");
        String x3 = JOptionPane.showInputDialog("dame otro numero");

        int n1 = Integer.parseInt(x1);
        int n2 = Integer.parseInt(x2);
        int n3 = Integer.parseInt(x3);

        int suma = (n1 + n2 + n3);
        int promedio = suma / 3;

        System.out.println("El promedio de " + suma + " es " + promedio);
    }
}