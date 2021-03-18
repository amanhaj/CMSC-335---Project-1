/*
 * File name: Triangle.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class triangle that whos method takes in base and height
 * and calls them to the triangle method in the Area class.
 */
class Triangle extends TwoDimensionalShape {
    public void tri (double b, double h){

        base = b;
        height = h;
        a.triangle(base, height);
    }
}