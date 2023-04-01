package Lab01;

public class Main {
    public static void main(String[] args) {
        Shape[] sh = new Shape[2];
        sh[0] = new Circle(10, 10, 10, "red");
        sh[1] = new Rectangle(5, 5, 10, 10, "green");
        for (Shape sh1 : sh) {
            sh1.draw();
        }
    }

}

abstract class Shape {
    private String color; // приватная строка цвет

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract void draw();

}

class Rectangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(int x1, int y1, int x2, int y2, String color) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void draw() {
        System.out.println("Прямоугольник с координатой первой вершины - " + getX1() + "." + getY1() +
                " и координатой второй вершины - " + getX2() + "." + getY2() +
                " и с цветом - " + getColor());
    }
}

class Circle extends Shape {
    private int x;
    private int y;
    private int rad;

    public Circle(String color) {
        super(color);
    }

    public Circle(int x, int y, int rad, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void draw() {
        System.out.println("Координаты центра круга - " + getX() + "." + getY() + " С радиусом - " + getRad() +
                " И цветом - " + getColor());
    }
}
