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

public class ManagementCompany {
    // Attributes
    private String companyName;
    private String taxId;
    private double managementFeePercentage;
    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    // Constructors
    public ManagementCompany(String companyName, String taxId, double managementFeePercentage) {
        this.companyName = companyName;
        this.taxId = taxId;
        this.managementFeePercentage = managementFeePercentage;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.numberOfProperties = 0;
    }

    // Getter/Setter methods
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public double getManagementFeePercentage() {
        return managementFeePercentage;
    }

    public void setManagementFeePercentage(double managementFeePercentage) {
        this.managementFeePercentage = managementFeePercentage;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public int getNumberOfProperties() {
        return numberOfProperties;
    }

    // Other methods
    public int addProperty(Property property) {
        if (numberOfProperties >= MAX_PROPERTY || property == null || !plot.encompasses(property.getPlot()))
            return -1;

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot()))
                return -1;
        }

        properties[numberOfProperties++] = property;
        return numberOfProperties - 1;
    }

    public double getTotalRent() {
        double totalRent = 0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentalAmount();
        }
        return totalRent;
    }

	public Property[] getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public Property maxRentProp() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void setFee(double fee) {
		// TODO Auto-generated method stub
		
	}
}
// Programmed by ALAZAR WUBET