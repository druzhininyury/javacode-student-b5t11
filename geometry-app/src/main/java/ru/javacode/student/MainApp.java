package ru.javacode.student;

public class MainApp {

    public static void main(String[] args) {
        GeometryFigure rectangle = new Rectangle(10, 15);
        GeometryFigure circle = new Circle(10);
        GeometryFigure triangle = new Triangle(10, 11, 12);

        GeometryFigure[] figures = new GeometryFigure[] {rectangle, circle, triangle};

        for (GeometryFigure figure : figures) {
            System.out.println("Figure " + figure.getClass().getSimpleName() + " has square=" + figure.getSquare() + ", perimeter=" + figure.getPerimeter());
        }

        System.out.print("Comparing " + rectangle.getClass().getSimpleName() + " and " + circle.getClass().getSimpleName() + ": ");
        System.out.println(Figures.compare(rectangle, circle));

        Circle upperboundCircle = Figures.getUpperboundCircle(rectangle);
        System.out.println("Upper bound circle square=" + upperboundCircle.getSquare() + ", perimeter=" + upperboundCircle.getPerimeter());

        GeometrySolid cube = new Cube(10);
        GeometrySolid sphere = new Sphere(10);

        GeometrySolid[] solids = new GeometrySolid[] {cube, sphere};

        for (GeometrySolid solid : solids) {
            System.out.println("Solid " + solid.getClass().getSimpleName() + " has volume=" + solid.getVolume());
        }
    }

}
