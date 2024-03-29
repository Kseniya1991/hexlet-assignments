package exercise;

public class Circle {
    private int radius;
    private Point point;

    public Circle(Point point, int radius) {
        this.radius = radius;
        this.point = point;
    }

    public int getRadius() throws NegativeRadiusException {
        if(radius < 0) {
            throw new NegativeRadiusException("Радиус меньше 0");
        }
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}