/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author SHASHI
 */
public class Rectangle extends Shape {

    int length;
    int breadth;
    int area;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    int getArea() {
        // throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.

        area = length * breadth;
        return area;

    }

    @Override
    void draw() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The area of rectangle is " + area + "and its color is " + color);

    }

}
