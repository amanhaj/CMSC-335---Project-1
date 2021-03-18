import java.text.DecimalFormat;
/*
 * File name: Area.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335
 * Purpose: Creates class Area which contains all the methods to
 * calculate the area of eligible shapes.
 */
class Area {
    public static final double PI = 3.14159265359;

    public void circle (double r){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = PI*(r*r);
        System.out.print(numberFormat.format(area)+"\n");

    }
    public void square (double l){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = l*l;
        System.out.print(numberFormat.format(area)+"\n");

    }
    public void triangle (double b, double h){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = (b*h)/2;
        System.out.print(numberFormat.format(area)+"\n");

    }
    public void rectangle (double l, double h){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = l*h;
        System.out.print(numberFormat.format(area)+"\n");

    }
}
