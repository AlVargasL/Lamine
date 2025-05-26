package U1_TI_04.U1_TI_04_Computadora;

public class Computadora {

        private String marca = "Apple";
        private String modelo;
        private boolean encendido;

        public void encender() {
            encendido = true;
        }

        public boolean getEncendido() {
            return encendido;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
}