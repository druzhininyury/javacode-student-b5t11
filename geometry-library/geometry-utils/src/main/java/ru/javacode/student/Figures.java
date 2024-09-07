package ru.javacode.student;

public class Figures {

    public static int compare(GeometryFigure lop, GeometryFigure rop) {
        double lopSquare = lop.getSquare();
        double ropSquare = rop.getSquare();

        if (lopSquare == ropSquare) {
            return 0;
        } else if (lopSquare < ropSquare) {
            return -1;
        } else {
            return 1;
        }
    }

    public static Circle getUpperboundCircle(GeometryFigure figure) {
        return new Circle(figure.getPerimeter() / 4);
    }

}
