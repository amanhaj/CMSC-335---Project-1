/*
 * File name: Cylinder.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Cylinder that takes in radius and height then
 * calls the cylinder method from the volume class.
 */
class Cylinder extends ThreeDimensionalShape {
    public void cyl (double r, double h){

        radius = r;
        height = h;
        v.cylinder(radius, height);
    }
}
