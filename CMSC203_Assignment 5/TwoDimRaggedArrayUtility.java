import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 5
 * Description: 
 * This class contains utility methods for working with two-dimensional ragged arrays.
 * It provides methods for reading data from a file into a two-dimensional ragged array, writing a two-dimensional ragged array to a file, and performing various calculations on the array such as getting totals, averages, highest/lowest values in rows and columns, etc.
 * Each method performs a specific task related to processing or analyzing two-dimensional ragged arrays.
 * The methods in this class can be used in applications that require working with data represented in a two-dimensional ragged array format.
 * Due: 04/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alazar wubet
*/

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File selectedFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(selectedFile);
        int rows = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            rows++;
        }
        scanner.close();

        double[][] data = new double[rows][];
        scanner = new Scanner(selectedFile);
        for (int i = 0; i < rows; i++) {
            String[] tokens = scanner.nextLine().trim().split("\\s+");
            data[i] = new double[tokens.length];
            for (int j = 0; j < tokens.length; j++) {
                data[i][j] = Double.parseDouble(tokens[j]);
            }
        }
        scanner.close();

        return data;
    }

    public static void writeToFile(double[][] sales, File selectedFile) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(selectedFile);
        for (double[] row : sales) {
            for (double sale : row) {
                writer.print(sale + " ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] sales) {
        double total = 0;
        for (double[] row : sales) {
            for (double sale : row) {
                total += sale;
            }
        }
        return total;
    }

    public static double getAverage(double[][] sales) {
        int count = 0;
        double total = 0;
        for (double[] row : sales) {
            for (double sale : row) {
                total += sale;
                count++;
            }
        }
        return total / count;
    }

    public static double getRowTotal(double[][] sales, int row) {
        double total = 0;
        for (double sale : sales[row]) {
            total += sale;
        }
        return total;
    }

    public static double getColumnTotal(double[][] sales, int col) {
        double total = 0;
        for (double[] row : sales) {
            if (col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] sales, int row) {
        double highest = Double.MIN_VALUE;
        for (double sale : sales[row]) {
            if (sale > highest) {
                highest = sale;
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] sales, int row) {
        double highest = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < sales[row].length; i++) {
            if (sales[row][i] > highest) {
                highest = sales[row][i];
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInRow(double[][] sales, int row) {
        double lowest = Double.MAX_VALUE;
        for (double sale : sales[row]) {
            if (sale < lowest) {
                lowest = sale;
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] sales, int row) {
        double lowest = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < sales[row].length; i++) {
            if (sales[row][i] < lowest) {
                lowest = sales[row][i];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInColumn(double[][] sales, int col) {
        double highest = Double.MIN_VALUE;
        for (double[] row : sales) {
            if (col < row.length && row[col] > highest) {
                highest = row[col];
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] sales, int col) {
        double highest = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < sales.length; i++) {
            if (col < sales[i].length && sales[i][col] > highest) {
                highest = sales[i][col];
                index = i;
            }
        }
        return index;
    }

    public static double getLowestInColumn(double[][] sales, int col) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : sales) {
            if (col < row.length && row[col] < lowest) {
                lowest = row[col];
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] sales, int col) {
        double lowest = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < sales.length; i++) {
            if (col < sales[i].length && sales[i][col] < lowest) {
                lowest = sales[i][col];
                index = i;
            }
        }
        return index;
    }

    public static double getHighestInArray(double[][] sales) {
        double highest = Double.MIN_VALUE;
        for (double[] row : sales) {
            for (double sale : row) {
                if (sale > highest) {
                    highest = sale;
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] sales) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : sales) {
            for (double sale : row) {
                if (sale < lowest) {
                    lowest = sale;
                }
            }
        }
        return lowest;
    }
}

// Programmed by ALAZAR WUBET