/*
 * File name: Circle.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Circle which takes in the radius and calls the area class.
 */
class Circle extends TwoDimensionalShape {
    public void circ (double r){

        radius = r;
        a.circle(radius);
    }
}