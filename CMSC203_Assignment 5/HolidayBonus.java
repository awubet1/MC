/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 5
 * Description: HolidayBonus: 
 * This class contains methods to calculate holiday bonuses based on sales data. It provides static methods to calculate individual category bonuses and the total holiday bonus.
 * calculateHolidayBonus: This method calculates the holiday bonus for each category based on the sales data provided as a two-dimensional array. It iterates over each category, finds the highest and lowest sales values, and computes the bonus accordingly.
 * calculateTotalHolidayBonus: This method calculates the total holiday bonus for all categories combined. It calls the calculateHolidayBonus method to get the bonuses for each category and then sums them up to obtain the total bonus.
 * Due: 04/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alazar wubet
*/

public class HolidayBonus {
	

    public static final double HIGHEST_BONUS = 5000;
    public static final double LOWEST_BONUS = 1000;
    public static final double OTHER_BONUS = 2000;

    public static double[] calculateHolidayBonus(double[][] sales) {
        double[] bonuses = new double[sales.length];
        for (int i = 0; i < sales.length; i++) {
            double highestInCategory = TwoDimRaggedArrayUtility.getHighestInRow(sales, i);
            double lowestInCategory = TwoDimRaggedArrayUtility.getLowestInRow(sales, i);
            if (highestInCategory <= 0 || lowestInCategory < 0) {
                bonuses[i] = 0;
            } else if (highestInCategory == lowestInCategory) {
                bonuses[i] = HIGHEST_BONUS;
            } else {
                for (double sale : sales[i]) {
                    if (sale == highestInCategory) {
                        bonuses[i] += HIGHEST_BONUS;
                    } else if (sale == lowestInCategory) {
                        bonuses[i] += LOWEST_BONUS;
                    } else {
                        bonuses[i] += OTHER_BONUS;
                    }
                }
            }
        }
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] sales) {
        double totalBonus = 0;
        double[] bonuses = calculateHolidayBonus(sales);
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}

// Programmed by ALAZAR WUBET