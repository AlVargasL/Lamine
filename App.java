import Yamal.Circle;
import Yamal.Square;
import Yamal.Triangle;

public class App {
    public static void main (String[] args) throws Exception  {

        //Cuadrado--------------------------------
        Square sq = new Square ();
        sq.getLado (15);
        System.out.println("Area y perimetro del cuadrado");
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
        System.out.println("");

         //Circulo-----------------------------------
        Circle cl = new Circle ();
        cl.getRadio(8);
        cl.getPi(3.1426);
        System.out.println("Area y perimetro del circulo");
        System.out.println(cl.getArea());
        System.out.println(cl.getPerimeter2());
        System.out.println("");

        //Triangulo----------------------------------
        Triangle tr = new Triangle();
        tr.getBase(10);
        tr.getHigh(15);
        tr.getLado(9);
        System.out.println("Area y perimetro del triangulo");
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimeter3());

    }
}
