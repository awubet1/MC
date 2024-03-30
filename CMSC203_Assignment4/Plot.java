/*
/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy grinberg
 * Assignment 4
 * Description: (The assignment requires developing a Java application to manage properties for a company, 
 ensuring no property overlaps and all fit within a defined plot. It involves implementing classes for managing 
 properties, plots, and the company, with functionalities for adding 
 properties, calculating total rent, and ensuring properties do not overlap
 The Plot class is essential for defining the boundaries and spatial relationships 
 of properties within a real estate management system. It provides functionality to verify if points are contained within its boundaries, 
 detect overlaps with other plots, and determine if it fully encompasses other plots. 
 This class serves as a foundational component for accurately managing and analyzing real estate plots)
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ALAZAR WUBET
*/

public class Plot {
    // Attributes
    private int x;
    private int y;
    private int width;
    private int depth;

    // Constructors
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Getter/Setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // Method to check if another plot overlaps with this plot
    public boolean overlaps(Plot plot) {
        // Check if this plot is to the right of the other plot
        if (x >= plot.x + plot.width || plot.x >= x + width) {
            return false;
        }
        // Check if this plot is below the other plot
        if (y >= plot.y + plot.depth || plot.y >= y + depth) {
            return false;
        }
        return true;
    }

    // Method to check if another plot is encompassed by this plot
    public boolean encompasses(Plot plot) {
        return (plot.x >= x && plot.y >= y && plot.x + plot.width <= x + width && plot.y + plot.depth <= y + depth);
    }

    // toString method
    @Override
    public String toString() {
        return "[" + x + "],[" + y + "],[" + width + "],[" + depth + "]";
    }
}
// Programmed by ALAZAR WUBET 