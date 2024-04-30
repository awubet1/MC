/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (Similar to Coffee, this subclass of Beverage represents another type of beverage - smoothie. It includes attributes for the number of fruits and whether protein powder is added, and overrides methods for price calculation and string representation.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
   */
class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;
    private final double PROTEIN_COST = 1.5;
    private final double FRUIT_COST = 0.5;

    public Smoothie(String beverageName, String size, int numOfFruits, boolean addProtein) {
        super(beverageName, "Smoothie", size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double totalPrice = addSizePrice();
        totalPrice += addProtein ? PROTEIN_COST : 0;
        totalPrice += numOfFruits * FRUIT_COST;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Smoothie{" +
                "beverageName='" + getBeverageName() + '\'' +
                ", size='" + getSize() + '\'' +
                ", numOfFruits=" + numOfFruits +
                ", addProtein=" + addProtein +
                ", price=" + calcPrice() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Smoothie smoothie = (Smoothie) obj;
        return numOfFruits == smoothie.numOfFruits && addProtein == smoothie.addProtein;
    }

	@Override
	protected Object getType() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters as needed
}
// Programmed by ALAZAR WUBET