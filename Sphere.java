/*
 * File name: Sphere.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Sphere which takes in the radius and calls sphere method from
 * Volume class.
 */
class Sphere extends ThreeDimensionalShape {
    public void sph (double r){

        radius = r;
        v.sphere(radius);
    }
}