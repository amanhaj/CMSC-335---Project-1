import java.text.DecimalFormat;
/*
 * File name: Volume.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Volume that calculates the volume of various 3D shapes
 * to be used in this program.
 */
class Volume {
    public static final double PI = 3.1415926;


    public void sphere(double r) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (4.0/3.0*PI)*(r*r*r);
        System.out.print(numberFormat.format(volume)+"\n");

    }
    public void cube(double l, double w, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (l*w*h);
        System.out.print(numberFormat.format(volume)+"\n");

    }
    public void cone(double r, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (1.0/3)*(PI*(r*r))*h;
        System.out.print(numberFormat.format(volume)+"\n");

    }
    public void cylinder(double r, double h) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (PI*(r*r))*h;
        System.out.print(numberFormat.format(volume)+"\n");

    }
    public void torus(double r, double m) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double volume = (PI*(r*r)*(2*(PI*m)));
        System.out.print(numberFormat.format(volume)+"\n");

    }
}