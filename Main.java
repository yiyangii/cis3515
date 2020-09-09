/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Scan user input 
        //Give name to square/circle/Triangle
        //Print area one by one 
        System.out.println("Please Enter Square: length and height:");
        Square square = new Square("Square");
        double length = sc.nextDouble();
        double height = sc.nextDouble();
        square.setDimension(height,length);
        
        
        System.out.println("Please Start Enter Circle: radius :");
        Circle circle = new Circle("Circle");
        double radius = sc.nextDouble();
        circle.setDimension(radius);
        
        System.out.println("Please Start Enter Triangle: side, side, side");
        Triangle triangle = new Triangle("Triangle");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        triangle.setDimension(side1,side2,side3);
        
        System.out.println("Please Start Enter EquilateralTriangle: side");
        EquilateralTriangle equilateraltriangle = new EquilateralTriangle("EquilateralTriangle");
        double side = sc.nextDouble();
        equilateraltriangle.setDimension(side);
        
        System.out.println(square.getName());
        square.printDimensions();
        System.out.println("The total Area is :" + square.getArea());
        
        System.out.println(circle.getName());
        circle.printDimensions();
        System.out.println("The total Area is : "+ circle.getArea());
        
        System.out.println(triangle.getName());
        triangle.printDimensions();
        System.out.println("The total Area is : "+ triangle.getArea());
        
        System.out.println(equilateraltriangle.getName());
        equilateraltriangle.printDimensions();
        System.out.println("The total Area is : "+equilateraltriangle.getArea());
    }
}