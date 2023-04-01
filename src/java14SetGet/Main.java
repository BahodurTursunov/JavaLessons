package java14SetGet;

public class Main {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.setCoords(0, 0, 10, 20);
        // методы которые запиcывают значение в приватные(закрытые) члены класса называются сеттерами

        Rect r2 = new Rect(40, 20, 100, 200);

        int s1 = r1.square();
        int s2 = r2.square();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(r1.getX1() + ", " + r1.getY1() + ", " + r1.getX2() +
                ", " + r1.getY2());
    }
}

class Rect {
    private static final int MAX_COORD = 1000;
    private int x1, y1;
    private int x2, y2;

    Rect() {
    }

    Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    int square() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }

    private boolean isCorrect(int arg) {
        return (0 <= arg && arg <= MAX_COORD);
    }

    void setCoords(int x1, int y1, int x2, int y2) {
        if (isCorrect(x1) && isCorrect(x2) && isCorrect(y1) && isCorrect(y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }
}
