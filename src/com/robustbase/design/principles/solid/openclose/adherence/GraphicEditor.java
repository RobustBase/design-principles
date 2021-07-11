package com.robustbase.design.principles.solid.openclose.adherence;

/**
 * @author Atul Dwivedi
 * @date 11/07/21
 */
public class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.print("Drawing circle...");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.print("Drawing rectangle...");
    }
}
