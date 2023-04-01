package tasks;

public class Vector {
    // три приватных поля
    private double x;
    private double y;
    private double z;

    // конструктор с параметрами в виде списка координат x, y, z
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение:
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    // метод, вычисляющий угол между векторами (или косинус угла): косинус угла
    // между векторами равен скалярному произведению векторов,
    // деленному на произведение модулей (длин) векторов:
    // // Косинус между двумя векторами
    public double cos(Vector vector){
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return scalarProduct(vector) / (length() * vector.length());
    }

}


