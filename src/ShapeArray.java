/*
 * Program Name: ShapeArray.java
 * Author: Cody Walker
 * Date: 5/10/2026
 *
 * Pseudocode:
 * 1. Create one Sphere object.
 * 2. Create one Cylinder object.
 * 3. Create one Cone object.
 * 4. Store the objects in a Shape array.
 * 5. Loop through the array.
 * 6. Print object data using toString().
 *
 * Program Inputs:
 * None
 *
 * Program Outputs:
 * Surface area and volume for each shape
 */

public class ShapeArray {

    public static void main(String[] args)
    {
        // Create one object of each shape
        Sphere sphere = new Sphere(2.5);

        Cylinder cylinder = new Cylinder(6.0, 8.0);

        Cone cone = new Cone(5.0, 12.0);

        /* Polymorphism:
           shape array can store different child objects because
           Sphere, Cylinder, and Cone extend Shape */

        Shape[] shapeArray = 
        {
            sphere, 
            cylinder,
            cone
        };

        // Loop through array and print object data automatically
        for (Shape shape : shapeArray)
        {
            System.out.println(shape);

            // Adds spacing between shape outputs
            System.out.println("---------------------------");
        }
    }
}