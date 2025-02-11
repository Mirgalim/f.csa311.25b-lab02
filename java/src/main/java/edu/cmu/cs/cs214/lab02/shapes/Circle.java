package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius; // Радиусыг private болгож, мэдээлэл нуух зарчим баримталсан.

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Тойргийн талбайг тооцоолох
    }

    @Override
    public void draw() {
        System.out.println("Тойрог зурах: Радиус = " + radius);
    }
}
