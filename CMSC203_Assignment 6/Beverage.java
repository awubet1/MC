/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (This abstract class serves as the base class for different types of beverages offered at the shop. It defines common attributes and methods for all beverage types, such as name, type, size, and price calculation.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
   */
public abstract class Beverage  {
// Instance variables
private String beverageName;
private String beverageType;
private String size;
private final double BASE_PRICE = 2.0;
private final double SIZE_PRICE = 0.5;

// Parametrized constructor
public Beverage(String beverageName, String beverageType, String size) {
    this.beverageName = beverageName;
    this.beverageType = beverageType;
    this.size = size;
}

// Method to calculate price based on size
public double addSizePrice() {
    if (size.equalsIgnoreCase("medium")) {
        return BASE_PRICE + SIZE_PRICE;
    } else if (size.equalsIgnoreCase("large")) {
        return BASE_PRICE + 2 * SIZE_PRICE;
    } else {
        return BASE_PRICE;
    }
}

// Abstract method to calculate price
public abstract double calcPrice();

// Getters and setters
public String getBeverageName() {
    return beverageName;
}

public void setBeverageName(String beverageName) {
    this.beverageName = beverageName;
}

public String getBeverageType() {
    return beverageType;
}

public void setBeverageType(String beverageType) {
    this.beverageType = beverageType;
}

public String getSize() {
    return size;
}

public void setSize(String size) {
    this.size = size;
}

// toString method
@Override
public String toString() {
    return "Beverage{" +
            "beverageName='" + beverageName + '\'' +
            ", size='" + size + '\'' +
            '}';
}

// Overridden equals method
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Beverage beverage = (Beverage) obj;
    return beverageName.equals(beverage.beverageName) && beverageType.equals(beverage.beverageType) && size.equals(beverage.size);
}

protected abstract Object getType();

// Other methods as needed
}
// Programmed by ALAZAR WUBET