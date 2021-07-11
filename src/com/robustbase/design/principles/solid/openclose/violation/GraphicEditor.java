package com.robustbase.design.principles.solid.openclose.violation;

/**
 * @author Atul Dwivedi
 * @date 11/07/21
 */
public class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.type == 1) {
            drawCircle((Circle) shape);
        } else if (shape.type == 2) {
            drawRectangle((Rectangle) shape);
        }
    }

    public void drawCircle(Circle circle) {
        circle.drawCircle();
    }

    public void drawRectangle(Rectangle rectangle) {
        rectangle.drawRectangle();
    }

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());

        /*
         * What if a new shape need to be introduced, let's say Triangle?
         *
         * We need to do below steps in order to make it work with existing design
         * 1. Create Triangle class
         * 1.1 Extend from Shape
         * 1.2 Initialize type instance variable of Shape class in Triangle constructor
         * 1.3 create drawTriangle method
         *
         * 2. Modify GraphicEditor class
         * 2.1 Add one more else-if block for Triangle
         * 2.2 Add drawTriangle method
         *
         * Point number 2. Modify GraphicEditor class represent bad design
         * What problems this bad design
         */

    }
}

class Shape {
    int type;
}

class Circle extends Shape {
    public Circle() {
        super.type = 1;
    }

    void drawCircle() {
        System.out.print("Drawing circle...");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 2;
    }

    void drawRectangle() {
        System.out.print("Drawing rectangle...");
    }
}
