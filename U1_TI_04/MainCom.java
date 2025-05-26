package U1_TI_04;

import javax.swing.JOptionPane;

import U1_TI_04.U1_TI_04_Computadora.Computadora;

public class MainCom {

    public static void main(String[] args) {

        Computadora cm = new Computadora(); // creamos una instancia de la clase Computadora
        String modelo = JOptionPane.showInputDialog("Escibe el modelo de una computadora Apple");
        cm.setModelo(modelo); // llamamos al metodo setModelo
        String encendido = JOptionPane.showInputDialog("Quieres encender la computadora?"); // preguntamos si queremos encender la computadora
        if (encendido.equalsIgnoreCase("Si")) {
            cm.encender(); // llama al metodo encender
        }        

        System.out.println("-----------------------------------------");
        System.out.println("Estado de encendico:" + cm.getEncendido());
        System.out.println("La marca es:" + cm.getMarca());
        System.out.println("El modelo es:" + cm.getModelo());
        System.out.println("-----------------------------------------");

    }

}