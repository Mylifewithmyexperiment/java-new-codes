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
 * main class to call classes of packages
 */
public class Calculation {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Red", 4, 5);

        System.out.println(rectangle.getArea());
        rectangle.draw();

    }

}
