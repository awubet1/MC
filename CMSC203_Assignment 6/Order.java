/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (This class represents an order placed at the beverage shop. It contains information about the order number, time, day, customer, and the list of beverages included in the order.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
   */
import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Random;

class Order implements OrderInterface, Comparable<Order> {
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    // Constructor
    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = generateOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer); // Deep copy of customer
        this.beverages = new ArrayList<>();
    }

    public Order(int orderNumber2, int time, Day day, Customer customer2) {
		// TODO Auto-generated constructor stub
	}

	// Generate a random order number
    private int generateOrderNumber() {
        Random rand = new Random();
        return rand.nextInt(80001) + 10000;
    }

    // Method to add a new beverage to the order
    public void addNewBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    // Overridden toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber)
                .append("\nOrder Time: ").append(orderTime)
                .append("\nOrder Day: ").append(orderDay)
                .append("\nCustomer: ").append(customer)
                .append("\nBeverages:\n");
        for (Beverage beverage : beverages) {
            sb.append(beverage).append("\n");
        }
        return sb.toString();
    }

    // Overridden compareTo method
    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderNumber, other.orderNumber);
    }

    // Getter method for customer (returns deep copy)
    public Customer getCustomer() {
        return new Customer(customer);
    }

	public int getTotalItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addNewBeverage(String bevName, String small, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, String small, int i, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBeverage(String bevName, String small) {
		// TODO Auto-generated method stub
		
	}

    // Other methods as needed
}
// Programmed by ALAZAR WUBET