
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 1);
        Point p3 = new Point(-1, -1);
        System.out.println("Растстояние между точками" + p1 + "и" + p2 + "равно " + p1.length(p2));
        p2.coordinateQuarter();
        p1.coordinateQuarter();
        p3.coordinateQuarter();
        p1.simetric(p2);
        p2.simetric(p3);
        p1.pointLine(p2, p3);
        System.out.println("Точки " + p2 + " и " + p3 + " " + p2.equalsPoint(p3));
        System.out.println("Точки " + p2 + " и " + p1 + " " + p2.equalsPoint(p1));
        Triangel t1 = new Triangel();
        System.out.println("Периметр треугольника с координатами вершин " + t1 + " равен " + t1.perimeter());
        System.out.println("Площадь треугольника с координатами вершин " + t1 + " равна " + t1.area());
        System.out.println("Поворачиваем треугольник с координатами вершин " + t1 + " на " + t1.rotateTriagle(30) + "градусов.\nРезультат поворота " + t1);
    }
}
