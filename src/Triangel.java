import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

public class Triangel {
    public double ax, ay, bx, by, cx, cy, perimetr;
    Point a;
    Point b;
    Point c;

    public Triangel() {
        boolean temp = true;
        for (; temp; ) {

            System.out.println("\n Введите координаты вершины A треугольника ");
            a = new Point();
            System.out.println("Введите координаты вершины B треугольника ");
            b = new Point();
            System.out.println("Введите координаты вершины C треугольника ");
            c = new Point();
            if (a.pointLine(b, c)) {
                ax = a.x;
                ay = a.y;
                bx = b.x;
                by = b.y;
                cx = c.x;
                cy = c.y;
                temp = false;
            } else {
                System.out.println("Вершины треугольника находятся на одной линии. Введите другие координаты вершин.");

            }
        }
    }

    public String toString() {
        return "a (" + ax + ";" + ay + ") b (" + bx + ";" + by + ") c (" + cx + ";" + cy + ")";

    }

    public double perimeter() {
        perimetr = (a.length(b) + b.length(c) + c.length(a));
        return perimetr;
    }

    public double area() {
        return Math.sqrt(perimetr / 2 * (perimetr / 2 - a.length(b)) * (perimetr / 2 - b.length(c)) * (perimetr / 2 - c.length(a)));
    }

    public double rotateTriagle(double r) {
        double centerX = (a.x + b.x + c.x) / 3;
        double centerY = (a.y + b.y + c.y) / 3;
        ax = (a.x - centerX) * cos(r) - (a.y - centerY) * sin(r) + centerX;
        ay = (a.x - centerX) * sin(r) + (a.y - centerY) * cos(r) + centerY;
        bx = (b.x - centerX) * cos(r) - (b.y - centerY) * sin(r) + centerX;
        by = (b.x - centerX) * sin(r) + (b.y - centerY) * cos(r) + centerY;
        cx = (c.x - centerX) * cos(r) - (c.y - centerY) * sin(r) + centerX;
        cy = (c.x - centerX) * sin(r) + (c.y - centerY) * cos(r) + centerY;
        return r;
    }

}
