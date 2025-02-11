package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        // Shape төрлийн объектуудыг үүсгэв.
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(4);
        Shape circle = new Circle(5);

        // Renderer классыг ямар ч дүрс дээр ашиглах боломжтой болгов.
        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer squareRenderer = new Renderer(square);
        Renderer circleRenderer = new Renderer(circle);

        // Бүх дүрсүүдийг зурж, талбайг хэвлэнэ.
        rectangleRenderer.draw();
        squareRenderer.draw();
        circleRenderer.draw();
    }
}
