/*
 * Program Name: Cylinder.java
 * Author: Cody Walker
 * Date: 5/10/2026
 *
 * Pseudocode:
 * 1. Create a Cylinder class that extends Shape.
 * 2. Store the radius and height.
 * 3. Calculate surface area.
 * 4. Calculate volume.
 * 5. Display results using toString().
 *
 * Program Inputs:
 * Radius and height values
 *
 * Program Outputs:
 * Surface area and volume of a cylinder
 */

public class Cylinder extends Shape
/* Shows Inheritance from Shape, 
   cylinder MUST implement surface_area() and volume() */

   {

    // Attributes 
    private double radius;
    private double height;

    // Parameterized constructor - initializes radius and height (two values)
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    // Override annotation acts as a safety check
    @Override
    public double surface_area()
    {
        return (2 * Math.PI * radius * radius) +
               (2 * Math.PI * radius * height);
    }

    // Override annotation acts as a safety check
    @Override
    public double volume()
    {
        return Math.PI * radius * radius * height;
    }

    // Override annotation acts as a safety check
    @Override
    public String toString() // allows readable output
    {
        return "Cylinder\n" +
               "Radius: " + radius +
               "\nHeight: " + height +
               "\nSurface Area: " + String.format("%.2f", surface_area()) +
               "\nVolume: " + String.format("%.2f", volume());
    }
}
