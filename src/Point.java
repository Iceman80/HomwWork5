import java.util.Scanner;

public class Point {
    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    // выводит на экран описание точки
    public void printPoint() {
        System.out.print(this.toString());
    }

    // метод перемещает точку на указанный вектор
    public void movePoint(double a, double b) {
        x = x + a;
        y = y + b;
    }

    // метод изменяет координаты точки на указанные
    public void setPoint(double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создающий точку в начале координат
    public Point() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите координату точки по оси Х");
        x = sc.nextDouble();
        System.out.println(" Введите координату точки по оси Y");
        y = sc.nextDouble();
    }

    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;

    }

    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.
                y - y, 2));
    }

    // метод проверяющий совпадают ли точки
    public String equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return "Точки совпадают";
        } else {
            return "Точки не совпадают";
        }
    }

//    public String equalsPointD(Point p) {
//        if (this.equals(p)) {
//            return "Точки совпадают (equals & hashCode)";
//        } else {
//            return "Точки не совпадают (equals & hashCode)";
//        }
//    }

    public void coordinateQuarter() {
        int temp;
        if (x > 0 && y > 0) temp = 1;
        else if (x < 0 && y > 0) temp = 2;
        else if (x < 0 && y < 0) temp = 3;
        else if (x > 0 && y < 0) temp = 4;
        else {
            System.out.println("Точка расположенна в центре x=0 y=0");
            return;
        }
        System.out.println("Точка с координатами " + x + " " + y + " расположенна в " + temp + " координатной четверти");
    }

    public void simetric(Point p) {
        if ((this.x == (-p.x)) && (this.y == (-p.y)))
            System.out.println("Точки симетричны относительно начала координат");
        else System.out.println("Точки не симетричны относительно начала координат");
    }

    public boolean pointLine(Point p2, Point p3) {
        boolean line = false;
        if ((p3.x - this.x) / (p2.x - this.x) == (p3.y - this.y) / (p2.y - this.y))
            System.out.println("Заданные точки " + this + " " + p2 + " " + p3 + " лежат на одной прямой");
        else {
            System.out.println("Заданные точки не лежат на одной прямой");
            line = true;
        }
        return line;
    }

}
