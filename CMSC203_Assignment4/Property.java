/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy grinberg
 * Assignment 4
 * Description: (The assignment requires developing a Java application to manage properties for a company, 
 ensuring no property overlaps and all fit within a defined plot. It involves implementing classes for managing 
 properties, plots, and the company, with functionalities for adding 
 properties, calculating total rent, and ensuring properties do not overlap).
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ALAZAR WUBET
*/

public class Property {
    // Attributes
    private String propertyName;
    private String city;
    private double rentalAmount;
    private String owner;
    private Plot plot;

    // Constructors
    public Property() {
        this.propertyName = "";
        this.city = "";
        this.rentalAmount = 0.0;
        this.owner = "";
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentalAmount, String owner, Plot plot) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmount = rentalAmount;
        this.owner = owner;
        this.plot = plot;
    }

    // Getter/Setter methods
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    public void setRentalAmount(double rentalAmount) {
        this.rentalAmount = rentalAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    // toString method
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentalAmount;
    }

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
// Programmed by ALAZAR WUBET