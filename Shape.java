/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author SHASHI
 *
 * Here, i am making an abstract class to just represent all the methods being
 * used in the sub-class of it.
 *
 * I will also make a constructor to pass parameter from one base class to
 * subclass
 *
 * 
 * another reason for making this class abstract that when we extend any class to 
 * this class all the methods need to be defined.
 * in this case getArea, draw has  to be defined in all subclasses.
 * 
 *
 */
public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;

    }

    // here i have defined the methods which i will use in sub class to get value.
    abstract int getArea();

    abstract void draw();

}
