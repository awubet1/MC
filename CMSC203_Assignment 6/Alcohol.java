/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (Another subclass of Beverage, this class represents alcoholic beverages offered at the shop. It includes an additional attribute for whether the drink is offered on the weekend and overrides methods for price calculation and string representation.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
   */
class Alcohol extends Beverage {
    private boolean offeredInWeekend;
    private final double WEEKEND_COST = 0.6;

    public Alcohol(String beverageName, String size, boolean offeredInWeekend) {
        super(beverageName, "Alcohol", size);
        this.offeredInWeekend = offeredInWeekend;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        totalPrice += offeredInWeekend ? WEEKEND_COST : 0;
        return totalPrice;
    }

   

	@Override
    public String toString() {
        return "Alcohol{" +
                "beverageName='" + getBeverageName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", offeredInWeekend=" + offeredInWeekend +
                ", price=" + calcPrice() +
                '}';
    }

   
	@Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alcohol alcohol = (Alcohol) obj;
        return offeredInWeekend == alcohol.offeredInWeekend;
    }

	@Override
	protected Object getType() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters as needed
}
// Programmed by ALAZAR WUBET