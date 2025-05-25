package U1_TI_02_AyP;

public class Square {

    private double lado; //lado del cuadrado
    

    //getArea del cuadrado
    public double getArea() {
        double Area = lado*lado;
        return Area;
    }

    //getPerimeter del cuadrado
    public double getPerimeter(){
        double perimeter=lado*4;
        return perimeter;
    }

    public void getLado(double lado) {
    this.lado = lado;
    }

    public double setLado () {
        return this.lado;
    }
}
