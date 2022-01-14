package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("круг", 20);
        Spuare spuare = new Spuare("квадрат", 20);
        Triangle triangle = new Triangle("треугольнил", 10, 54, 22);
        Rectangle rectangle = new Rectangle("прямоугольник", 12, 55);

        Dog dog = new Dog("Rezc");
        Cat cat = new Cat("Багира");

        Drawable[] drawables = {circle, spuare, triangle, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + " Переметр -> " +
                        ((Figure) drawables[i]).colculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].drow();
        }
    }
}

//        System.out.println("------------------------------------");
//        for (Figure figure : figures){
//            System.out.println(figure.getName() + " Переметр -> " + figure.colculatePerimeter());


// System.out.println(circle.getName()+"периметер -> "+circle.colculatePerimeter());
// System.out.println(spuare.getName()+"периметер -> "+spuare.colculatePerimeter());
// System.out.println(triangle.getName()+"периметер -> "+triangle.colculatePerimeter());
// System.out.println(rectangle.getName()+"периметер -> "+rectangle.colculatePerimeter());


