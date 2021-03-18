import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * File name: ShapesMain.java
 * Author: Amanda Hajati
 * Date: January 24, 2020
 * Course: CMSC 335.
 */
public class ShapesMain {
    public static void main (String[] args) {
        int escape = 0;
        int menuSelection =  0;
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);


        while (escape != 10) {

            System.out.println("*********Welcome to the Java OO Shapes Program **********\n");
            System.out.println("Select from the menu below:\n");
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");


            try {
                menuSelection = input.nextInt();


                while (menuSelection > 10||menuSelection < 1) {
                    System.out.println("Enter a number from 1-10");
                    menuSelection = input.nextInt();
                    if (menuSelection > 10||menuSelection < 1) {
                        System.out.println("Enter a number from 1-10");
                        menuSelection = input.nextInt();
                    }
                }
            }catch (InputMismatchException e){
                input.next();
                System.out.println("Enter a value between 1 to 10\n");
            }
            //Selection Circle
            if (menuSelection == 1) {

                boolean check = false;

                System.out.println("What is the radius?");
                double radius = input.nextDouble();
                System.out.print("The Area is: ");
                Circle circle = new Circle();
                circle.circ(radius);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection Rectangle
            else if (menuSelection == 2) {

                boolean check = false;

                System.out.println("What is the length?");
                double length = input.nextDouble();
                System.out.println("What is the height?");
                double height = input.nextDouble();
                System.out.print("The Area is: ");
                Rectangle rectangle = new Rectangle();
                rectangle.rect(length, height);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }//Selection Square
            else if (menuSelection == 3) {

                boolean check = false;

                System.out.println("What is the length?");
                double length = input.nextDouble();
                System.out.print("The Area is: ");
                Square square = new Square();
                square.sq(length);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter only Y or N");
                        next = string.nextLine();
                    }
                }
            }

            //Selection Triangle
            else if (menuSelection == 4) {

                boolean check = false;

                System.out.println("What is the base?");
                double base = input.nextDouble();
                System.out.println("What is the height?");
                double height = input.nextDouble();
                System.out.print("The Area is: ");
                Triangle triangle = new Triangle();
                triangle.tri(base, height);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter only Y or N");
                        next = string.nextLine();
                    }
                }
            }

            //Selection Sphere
            else if (menuSelection == 5) {

                boolean check = false;

                System.out.println("What is the radius?");
                double radius = input.nextDouble();
                System.out.print("The Volume is: ");
                Sphere sphere = new Sphere();
                sphere.sph(radius);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection Cube
            else if (menuSelection == 6) {

                boolean check = false;

                System.out.println("What is the length?");
                double length = input.nextDouble();
                System.out.println("What is the width?");
                double width = input.nextDouble();
                System.out.println("What is the height?");
                double height = input.nextDouble();
                System.out.print("The Volume is: ");
                Cube cube = new Cube();
                cube.cu(length, width, height);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection Cone
            else if (menuSelection == 7) {

                boolean check = false;

                System.out.println("What is the radius?");
                double radius = input.nextDouble();
                System.out.println("What is the height?");
                double height = input.nextDouble();
                System.out.print("The Volume is: ");
                Cone cone = new Cone();
                cone.co(radius, height);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection Cylinder
            else if (menuSelection == 8) {

                boolean check = false;

                System.out.println("What is the radius?");
                double radius = input.nextDouble();
                System.out.println("What is the height?");
                double height = input.nextDouble();
                System.out.print("The Volume is: ");
                Cylinder cylinder = new Cylinder();
                cylinder.cyl(radius, height);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection Torus
            else if (menuSelection == 9) {

                boolean check = false;

                System.out.println("What is the major radius?");
                double majorRadius = input.nextDouble();
                System.out.println("What is the radius?");
                double radius = input.nextDouble();
                System.out.print("The Volume is: ");
                Torus torus = new Torus();
                torus.tor(radius, majorRadius);

                System.out.println("\nWould you like to continue? (Y or N)");
                String next = string.nextLine();

                while (!check) {
                    if (next.equalsIgnoreCase("Y")) {
                        check = true;
                        escape = 0;
                    } else if (next.equalsIgnoreCase("N")) {
                        check = true;
                        java.util.Date date=new java.util.Date();
                        System.out.println("Thanks for using the program. Today is:\t"+date);
                        escape = 10;
                    }
                    else {
                        System.out.println("Please enter Y or N");
                        next = string.nextLine();
                    }
                }
            }
            //Selection exit
            else if (menuSelection == 10) {
                java.util.Date date=new java.util.Date();
                System.out.println("Thanks for using the program. Today is:\t"+date);
                escape = 10;

            }
        }
    }
}
