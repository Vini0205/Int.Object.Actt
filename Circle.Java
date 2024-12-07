/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calunod_divinee_circle.java;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Calunod_divinee_circleJava {

    public static class Circle {

        private double radius;

        public Circle() {
            this.radius = 1.0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        public double getDiameter() {
            return 2 * radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        circle.setRadius(radius);

        System.out.println("Circle with radius " + circle.getRadius() + ":");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Diameter: " + circle.getDiameter());

        input.close();
    }
}
