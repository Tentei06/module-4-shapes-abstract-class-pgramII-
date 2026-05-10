/*
 * Program Name: Sphere.java
 * Author: Cody Walker
 * Date: 05/10/2026
 *
 * Pseudocode:
 * 1. Create a Sphere class that extends Shape.
 * 2. Store the radius.
 * 3. Calculate surface area.
 * 4. Calculate volume.
 * 5. Display results using toString().
 *
 * Program Inputs:
 * Radius value
 *
 * Program Outputs:
 * Surface area and volume of a sphere
 */


public class Sphere extends Shape 
/*shows Inheritance from Shape, 
  sphere MUST implement surface_area() and volume() */

{
    // Attribute 
    private double radius;

    // Parameterized constructor - initializes radius when object is created
    public Sphere(double radius)
    {
        this.radius = radius;
    }

    // Override annotation acts as a safety check 
    @Override
    public double surface_area()
    {
        return 4 * Math.PI * radius * radius;
    }

    // Override annotation acts as a safety check 
    @Override
    public double volume()
    {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Override annotation acts as a safety check 
    @Override
    public String toString() // allows readable output 
    {
        return "Sphere\n" +
               "Radius: " + radius +
               "\nSurface Area: " + surface_area() +
               "\nVolume: " + volume();
    }

}
