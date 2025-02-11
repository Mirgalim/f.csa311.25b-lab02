package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape; // Renderer нь зөвхөн Shape интерфэйсийг ашиглана.

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        // Дүрсийн draw() функцыг дуудна.
        shape.draw();
        // Дүрсний талбайг хэвлэх
        System.out.println("Дүрс хэвлэгдлээ.\nТүүний талбай: " + shape.getArea());
    }
}
