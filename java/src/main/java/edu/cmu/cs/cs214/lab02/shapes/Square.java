package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen; // Талын уртыг нууцалж, гадаад классууд шууд хандахаас сэргийлэв.

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen; // Квадратын талбайг тооцоолох
    }

    @Override
    public void draw() {
        System.out.println("Квадрат зурах: Талын урт = " + sideLen);
    }
}
