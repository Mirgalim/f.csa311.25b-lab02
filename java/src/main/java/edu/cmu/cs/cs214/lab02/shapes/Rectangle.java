package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    // Мэдээллийн далдлалыг хангахын тулд хувийн (private) хувьсагч ашиглалаа.
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width; // Дөрвөлжингийн талбайг тооцоолно.
    }

    @Override
    public void draw() {
        // Дөрвөлжин дүрслэх функц
        System.out.println("Дөрвөлжин зурах: Өндөр = " + height + ", Өргөн = " + width);
    }
}
