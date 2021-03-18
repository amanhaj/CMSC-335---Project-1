/*
 * File name: Cone.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Cone which contains method to take in
 * radius and height and calls Volume class cone method.
 */
class Cone extends ThreeDimensionalShape {
    public void co (double r, double h){

        radius = r;
        height = h;
        v.cone(radius, height);
    }
}