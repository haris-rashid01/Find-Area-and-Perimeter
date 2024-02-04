package p1;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area(double length, double width){
        double area = length * width;
        return area;
    }
    public double perimeter(double length, double width){
        double perimeter = 2*(length + width);
        return  perimeter;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        double l = sc.nextDouble();
        System.out.println("Enter Width");
        double w = sc.nextDouble();
        Rectangle r1 = new Rectangle(l, w);
        System.out.println("Area is: " + r1.area(l, w));
        System.out.println("Perimeter is" + r1.perimeter(l, w));
    }
}