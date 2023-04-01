package com.company.java17.podvig1;

// записать класс Properties для описания свойств графических примитивов с полями: толщина линии, тип линии, цвет.
// Последнее поле цвет должно предствляться внутренним классом Color с полями: red, green, blue.
// Создать несколько объектов класса Properties с разным набором данных и вывести их в консоль

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Properties props1 = new Properties(1, "пунктирная", 255, 0, 0); // красная пунктирная линия толщиной 2
        Properties props2 = new Properties(2, "пунктирная", 0, 255, 0); // зеленая пунктирная линия толщиной 2
        Properties props3 = new Properties(3, "пунктирная", 0, 0, 255); // синяя пунктирная линия толщиной 2
        System.out.println("Линия толщиной " + props1.getLineWidth() + ". Тип линии " + props1.getLineType() + " и цвет " + props1.getColor().getRed() + ", " + props1.getColor().getGreen() + ", " + props1.getColor().getBlue());
        System.out.println("Линия толщиной " + props2.getLineWidth() + ". Тип линии " + props2.getLineType() + " и цвет " + props2.getColor().getRed() + ", " + props2.getColor().getGreen() + ", " + props2.getColor().getBlue());
        System.out.println("Линия толщиной " + props3.getLineWidth() + ". Тип линии " + props3.getLineType() + " и цвет " + props3.getColor().getRed() + ", " + props3.getColor().getGreen() + ", " + props3.getColor().getBlue());
    }
}

class Properties {
    private int lineWidth;
    private String lineType;
    private Color color;

    public Properties(int lineWidth, String lineType, int red, int green, int blue) {
        this.lineWidth = lineWidth;
        this.lineType = lineType;
        this.color = new Color(red, green, blue);
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public class Color {
        private int red;
        private int green;
        private int blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.blue = blue;
            this.green = green;

        }

        public int getRed() {
            return red;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public int getGreen() {
            return green;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        public int getBlue() {
            return blue;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }
    }
}
