/*
 * File name: Rectangle.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Rectangle that takes in length and height and passes it
 * to rectangle method in Area class.
 */
class Rectangle extends TwoDimensionalShape {
    public void rect (double l, double h){

        length = l;
        height = h;
        a.rectangle(length, height);
    }
}
