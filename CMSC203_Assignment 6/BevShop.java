import java.util.ArrayList;
import java.util.List;

public abstract class BevShop implements BevShopInterface {
    private int numOfAlcoholDrinks; // Number of alcohol drinks ordered for the current order
    private List<Order> orders; // List to keep track of orders
    private static final int MAX_ALCOHOL_DRINKS = 3; // Maximum number of alcohol drinks per order
    private static final int MIN_AGE_FOR_ALCOHOL = 21; // Minimum age to order alcohol drink

    // Constructor
    public BevShop() {
        this.numOfAlcoholDrinks = 0;
        this.orders = new ArrayList<>();
    }

    // Implementation of BevShopInterface methods

    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }

    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ALCOHOL_DRINKS;
    }

    @Override
    public boolean isEligibleForMore() {
        return numOfAlcoholDrinks < MAX_ALCOHOL_DRINKS;
    }

    @Override
    public int getNumOfAlcoholDrink() {
        return numOfAlcoholDrinks;
    }

    @Override
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

   

    // Other methods...

    // Overridden toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orders:\n");
        for (Order order : orders) {
            sb.append(order).append("\n");
        }
        sb.append("Total Monthly Sale: ").append(totalMonthlySale());
        return sb.toString();
    }

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}

    // Other methods as needed...
}
