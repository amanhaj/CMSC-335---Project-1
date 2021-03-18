/*
 * File name: Cube.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Cube that takes in length of sides of cube
 * then calls cube method in Volume class.
 */
class Cube extends ThreeDimensionalShape {
    public void cu (double l, double w, double h){

        length = l;
        width = w;
        height = h;
        v.cube(length, width, height);
    }
}