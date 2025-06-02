import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.EquilateralTriangle;
import Model.ScaleneTriangle;
import Model.RectangleTriangle;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs scalene = new ScaleneTriangle(20, 25, 20, 30, 40);
        FigureAbs rectangle = new RectangleTriangle(20, 25, 20, 30, 40);
        FigureAbs equilateral = new EquilateralTriangle(20, 25);

        FigureAbs[] figures = { sq, cir, triangle, scalene, rectangle, equilateral };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }
    }
}