//package com.company;

import java.util.*;
import java.lang.Math;

class Rectangle {
    private double x1, x2, y1, y2;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getArea() {
        if(x1 < x2 && y1 < y2) {
            return (x2 - x1) * (y2 - y1);
        } else {
            return 0;
        }
    }

    public double getIntersectedArea(Rectangle other) {
        Rectangle res = new Rectangle(
                Math.max(x1, other.x1),
                Math.max(y1, other.y1),
                Math.min(x2, other.x2),
                Math.min(y2, other.y2));
        return res.getArea();
    }

    Rectangle() {
        Scanner input = new Scanner(System.in);

        System.out.println("Setting coordinates of Rectangle:");
        System.out.print("LeftUp corner x1 = ");
        this.x1 = input.nextDouble();
        System.out.print("LeftUp corner y1 = ");
        this.y1 = input.nextDouble();
        System.out.print("RightDown corner x2 = ");
        this.x2 = input.nextDouble();
        System.out.print("RightDown corner y2 = ");
        this.y2 = input.nextDouble();
    }

    Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle r1 = new Rectangle(0.0, 0.0, 5.0, 2.0);
        Rectangle r2 = new Rectangle(0.0, 0.0, 2.0, 5.0);
        Rectangle r3 = new Rectangle(5.0, 2.0, 10.0, 4.0);
        Rectangle r4 = new Rectangle(-1.0, -1.0, 1.0, 1.0);
        Rectangle r5 = new Rectangle(5.0, 2.0, 0.0, 0.0);

        System.out.println("Areas: ");
        System.out.println("S(r1) = " + r1.getArea());
        System.out.println("S(r2) = " + r2.getArea());
        System.out.println("S(r3) = " + r3.getArea());
        System.out.println("S(r4) = " + r4.getArea());
        System.out.println("S(r5) = " + r5.getArea());

        System.out.println("Intersected Areas: ");
        System.out.println("S(r1) /\\ S(r2) = " + r1.getIntersectedArea(r2));
        System.out.println("S(r1) /\\ S(r3) = " + r1.getIntersectedArea(r3));
        System.out.println("S(r1) /\\ S(r4) = " + r1.getIntersectedArea(r4));
        System.out.println("S(r1) /\\ S(r5) = " + r1.getIntersectedArea(r5));
        System.out.println("S(r2) /\\ S(r1) = " + r2.getIntersectedArea(r1));
        System.out.println("S(r3) /\\ S(r1) = " + r3.getIntersectedArea(r1));
        System.out.println("S(r4) /\\ S(r1) = " + r4.getIntersectedArea(r1));
        System.out.println("S(r5) /\\ S(r1) = " + r5.getIntersectedArea(r1));
        System.out.println("S(r4) /\\ S(r3) = " + r4.getIntersectedArea(r3));
        System.out.println("S(r3) /\\ S(r4) = " + r3.getIntersectedArea(r4));
    }
}
