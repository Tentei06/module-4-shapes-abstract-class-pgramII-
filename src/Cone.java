/*
 * Program Name: Cone.java
 * Author: Cody Walker
 * Date: 5/10/2026
 *
 * Pseudocode:
 * 1. Create a Cone class that extends Shape.
 * 2. Store the radius and height.
 * 3. Calculate surface area.
 * 4. Calculate volume.
 * 5. Display results using toString().
 *
 * Program Inputs:
 * Radius and height values
 *
 * Program Outputs:
 * Surface area and volume of a cone
 */

public class Cone extends Shape
/* shows Inheritance from Shape, 
   cone MUST implement surface_area () and volume() */

   {

    // Attributes 
    private double radius;
    private double height;

    // Parameterized constructor - initializes height and radius
    public Cone(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    // Override annotation acts as a safety check 
    @Override
    public double surface_area()
    {
        // Calculates slant height for cone surface area formula
        double slantHeight = Math.sqrt((height * height) + (radius * radius));

        return Math.PI * radius * (radius + slantHeight);
    }

    // Override annotation acts as a safety check
    @Override
    public double volume()
    {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // Override annotation acts as a safety check 
    @Override
    public String toString() // allows readable output
    {
        return "Cone\n" +
               "Radius: " + radius +
               "\nHeight: " + height +
               "\nSurface Area: " + surface_area() +
               "\nVolume: " + volume();
    }
}