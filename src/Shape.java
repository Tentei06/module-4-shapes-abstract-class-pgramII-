/*
 * Program Name: Shape.java
 * Author: Cody Walker
 * Date: 05/10/2026
 *
 * Pseudocode:
 * 1. Create an abstract Shape class.
 * 2. Require child classes to calculate surface area.
 * 3. Require child classes to calculate volume.
 *
 * Program Inputs:
 * None
 *
 * Program Outputs:
 * Surface area and volume calculations from child classes.
 */ 
    


public abstract class Shape
{
    // Abstract method for surface area - All child classes will create their own surface area formula
    public abstract double surface_area();

    // Abstract method for volume - All child classes will create their own formula for volume
    public abstract double volume();
}

