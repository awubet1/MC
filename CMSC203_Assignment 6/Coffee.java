/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (This subclass of Beverage represents a specific type of beverage - coffee. It includes additional attributes such as whether it contains extra shots or syrup, and overrides methods for price calculation and string representation.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
   */
class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    private final double EXTRA_SHOT_COST = 0.5;
    private final double EXTRA_SYRUP_COST = 0.5;

    public Coffee(String beverageName, String size, boolean extraShot, boolean extraSyrup) {
        super(beverageName, "Coffee", size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        if (extraShot) {
            totalPrice += EXTRA_SHOT_COST;
        }
        if (extraSyrup) {
            totalPrice += EXTRA_SYRUP_COST;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "beverageName='" + getBeverageName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", extraShot=" + extraShot +
                ", extraSyrup=" + extraSyrup +
                ", price=" + calcPrice() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Coffee coffee = (Coffee) obj;
        return extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
    }

	@Override
	protected Object getType() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters as needed
}

// Programmed by ALAZAR WUBET