/*
 * File name: Square.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Square whos method takes in side l and calls square method
 * from Area class.
 */
class Square extends TwoDimensionalShape {
    public void sq (double l){

        length = l;
        a.square(length);
    }
}