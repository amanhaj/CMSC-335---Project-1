/*
 * File name: Torus.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Torus that takes in radius and majorRadius then
 * calls the torus method from the Volume class.
 */
class Torus extends ThreeDimensionalShape {
    public void tor (double r, double m){

        radius = r;
        majorRadius = m;
        v.torus(radius, majorRadius);
    }
}
