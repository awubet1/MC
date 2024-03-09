import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class TwoDimArrayPractice extends JFrame {
    // GUI components
    private JButton fillValues;
    private JButton printArray;
    private JButton setValues;
    private JButton findMinimum;
    private JButton countFrequency;

    private ButtonHandler bh;

    private static int[][] intArray;
    private final int ROWS = 4;
    private final int COLUMNS = 20;
    private static int current1 = -1;
    private static int current2 = -1;
    private int key;
    private int rowSelected = -1;
    private int columnSelected = -1;
    private BarChart bc;
    private static int counter = 0;

    private static TwoDimArrayPractice app;
    private boolean firstTime = true;

    private Image offscreen;

    public TwoDimArrayPractice() {
        super("Choose your activity");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        fillValues = new JButton("Fill Values");
        c.add(fillValues);
        printArray = new JButton("Print Array");
        c.add(printArray);
        setValues = new JButton("Set Values");
        c.add(setValues);
        findMinimum = new JButton("Find Minimum");
        c.add(findMinimum);
        countFrequency = new JButton("Count Frequency");
        c.add(countFrequency);

        bh = new ButtonHandler();
        fillValues.addActionListener(bh);
        printArray.addActionListener(bh);
        setValues.addActionListener(bh);
        findMinimum.addActionListener(bh);
        countFrequency.addActionListener(bh);

        setSize(500, 550);

        intArray = new int[ROWS][COLUMNS];

        // fill with random numbers between 50 and 80
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                intArray[i][j] = rand.nextInt(31) + 50;
            }
        }

        bc = new BarChart(intArray);

        // print the array values
        System.out.println("Row\tValue");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        setVisible(true);
        offscreen = this.createImage(getSize().width, getSize().height);
    }

    // 1.  This method has been coded as an example
    /** Fills the array with random numbers between 50 and 80
     *  The instance variable named intArray is the integer array to be
     *  filled with values
     */
    public void fillValues() {
        Random rand = new Random();
        for (int row = 0; row < intArray.length; row++) {
            System.out.print(row + "\t");
            for (int column = 0; column < intArray[row].length; column++) {
                intArray[row][column] = rand.nextInt(31) + 50;
                animate1(row, column);  // needed to create visual feedback
            }
            System.out.println();
        }
    }
    // end of fillValues method

    // // 2. Student writes this method
    /**
     * Prints array to the console, elements are separated by a space
     * The instance variable named intArray is the integer array to be printed
     */
    public void printArray() {
        for (int row = 0; row < intArray.length; row++) {
            System.out.print(row + "\t");
            for (int column = 0; column < intArray[row].length; column++) {
                System.out.print(intArray[row][column] + " ");
                // Animation call placeholder:
                // animate(row, column);
            }
            System.out.println();
        }
    }
    // end of printArray method

    // ***** // 3. Student writes this method
    /**
     * Sets all the elements in the specified row to the specified value
     * The instance variable named intArray is the integer array
     * @param value the value to assign to the element of the row
     * @param row   the row in which to set the elements to value
     */
    
    public void setValues(int value, int row) {
        for (int column = 0; column < intArray[row].length; column++) {
            intArray[row][column] = value;
            animate1(row, column);
        }
    }


    /**
     * Animate method placeholder
     * @param row    the index of the array's current row
     * @param column the index of the array's current column
     * @param value  the value being assigned
     */
    public void animate1(int row, int column) {
        // Simulate animation by printing messages
        System.out.println("Animating: Setting value at row " + row + ", column " + column);
        // You can add delays or other animation logic here if needed
    }

    // 4. Student writes this method
    /**
     * Finds minimum value in the specified column
     * The instance variable named intArray is the integer array
     * @param column the column to search
     * @return the minimum value found in the column
     */
    public int findMinimum(int column) {
        int minimum = intArray[0][column];
        for (int row = 1; row < intArray.length; row++) {
            if (intArray[row][column] < minimum) {
                minimum = intArray[row][column];
            }
            // Animation call placeholder:
            // animate(row, column, minimum);
        }
        return minimum;
    }
    // end of findMinimum method

    //5. Student writes this method
    /**
     * Finds the number of times value is found in the array
     * The instance variable named intArray is the integer array
     * @param value the value to count
     * @return the number of times value was found
     */
    public int countFound(int value) {
        int count = 0;
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[row].length; column++) {
                if (intArray[row][column] == value) {
                    count++;
                }
                // Animation call placeholder:
                // animate(row, column, count);
            }
        }
        return count;
    }
    //end of countFound method

    public void startActivity(int act) {
        bc.setActivity(act);
        boolean goodInput = false;
        String answer = "";
        switch (act) {
            case (0):
                fillValues();
                JOptionPane.showMessageDialog(null, "Array filled with new values");
                break;

            case (1):
                printArray();
                JOptionPane.showMessageDialog(null, "Array printed");
                break;

            case (2):
                while (!goodInput || key < 50 || key > 80) {
                    try {
                        answer = JOptionPane.showInputDialog(null, "Enter a value between 50 and 80");
                        if (answer != null) {
                            key = Integer.parseInt(answer);
                            goodInput = true;
                        } else {
                            goodInput = false;
                            break;
                        }
                    } catch (Exception e) {
                    }
                }
                if (goodInput) {
                    goodInput = false;
                    while (!goodInput || rowSelected < 0 || rowSelected > 3) {
                        try {
                            answer = JOptionPane.showInputDialog(null, "Enter a row number between 0 and 3");
                            if (answer != null) {
                                rowSelected = Integer.parseInt(answer);
                                goodInput = true;
                            } else {
                                goodInput = false;
                                break;
                            }
                        } catch (Exception e) {
                        }
                    }
                }
                if (goodInput) {
                    bc.setKey(key);
                    setValues(key, rowSelected);
                    String message = "";
                    if (bc.getCheckNewValues())
                        message = " correctly";
                    else
                        message = " incorrectly";
                    JOptionPane.showMessageDialog(null, "Values in row " + rowSelected + " set to " + key + message);
                }
                break;

            case (3):
                while (!goodInput || columnSelected < 0 || columnSelected > 19) {
                    try {
                        answer = JOptionPane.showInputDialog(null, "Enter a column number between 0 and 19");
                        if (answer != null) {
                            columnSelected = Integer.parseInt(answer);
                            goodInput = true;
                        } else {
                            goodInput = false;
                            break;
                        }
                    } catch (Exception e) {
                    }
                }
                if (goodInput) {
                    int a = findMinimum(columnSelected);
                    String feedbackMin = "";
                    if (a == bc.getExactMinimum())
                        feedbackMin = "\nThis is correct";
                    else
                        feedbackMin = "\nThis is incorrect";

                    String displayMessageMin = "In column " + columnSelected + ", you found a minimum value of ";
                    displayMessageMin += a + feedbackMin;
                    JOptionPane.showMessageDialog(null, displayMessageMin);
                }
                break;
            case (4):
                while (!goodInput || key < 50 || key > 80) {
                    try {
                        answer = JOptionPane.showInputDialog(null, "Enter a value between 50 and 80");
                        if (answer != null) {
                            key = Integer.parseInt(answer);
                            goodInput = true;
                        } else {
                            goodInput = false;
                            break;
                        }
                    } catch (Exception e) {
                    }
                }
                if (goodInput) {
                    int frequency = countFound(key);
                    String feedbackFrequency = "";
                    if (frequency == bc.getExactFrequencyCount())
                        feedbackFrequency = "\nThis is correct";
                    else
                        feedbackFrequency = "\nThis is incorrect";

                    String plural = "";
                    if (frequency != 1)
                        plural = "s";

                    String displayMessageFrequency = "You found " + key + " " + frequency + " time" + plural;
                    displayMessageFrequency += feedbackFrequency;

                    if (frequency != -1)
                        JOptionPane.showMessageDialog(null, displayMessageFrequency);
                    else
                        JOptionPane.showMessageDialog(null, "You did not find the value " + key);
                }
                break;
        }
        enableButtons();
    }

    public static int getCurrent1() {
        return current1;
    }

    public static int getCurrent2() {
        return current2;
    }

    public static int getCounter() {
        return counter;
    }

    public static int[][] getArray() {
        return intArray;
    }

    @SuppressWarnings("unused")
	private void animate(int row, int column) {
        if (bc.getActivity() >= 0 && bc.getActivity() <= 2) {
            try {
                current1 = row;
                current2 = column;
                bc.setArray(intArray);

                Graphics g = offscreen.getGraphics();
                paint(g);
                g = this.getGraphics();
                g.drawImage(offscreen, 0, 0, this);

                if (bc.getActivity() == 0)
                    Thread.sleep(200);
                else
                    Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("IE Exception " + e.getMessage());
                System.out.println(e.toString());
            }
        } else {
            // call to animate with the wrong number of arguments
            JOptionPane.showMessageDialog(null, "Wrong number of arguments to animate method");
            System.exit(1);
        }
    }

    @SuppressWarnings("unused")
    private void animate(int row, int column, int intermedResult) {
        if (bc.getActivity() == 3 || bc.getActivity() == 4) {
            try {
                current1 = row;
                current2 = column;
                bc.setStudentResult(intermedResult);
                bc.setArray(intArray);

                Graphics g = offscreen.getGraphics();
                paint(g);
                g = this.getGraphics();
                g.drawImage(offscreen, 0, 0, this);

                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("IE Exception " + e.getMessage());
                System.out.println(e.toString());
            }
        } else {
            // call to animate has the wrong number of arguments
            JOptionPane.showMessageDialog(null, "Wrong number of arguments to animate method");
            System.exit(1);
        }
    }

    public void paint(Graphics g) {
        if ((current1 != -1 && current2 != -1) || firstTime) {
            super.paint(g);
            bc.draw(g);
            bc.updateBarChart(key, current1, current2, g);
            firstTime = false;
        }
    }

    public static void main(String[] args) {
        app = new TwoDimArrayPractice();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void disableButtons() {
        fillValues.setEnabled(false);
        printArray.setEnabled(false);
        setValues.setEnabled(false);
        countFrequency.setEnabled(false);
        findMinimum.setEnabled(false);
    }

    public void enableButtons() {
        fillValues.setEnabled(true);
        printArray.setEnabled(true);
        setValues.setEnabled(true);
        countFrequency.setEnabled(true);
        findMinimum.setEnabled(true);
    }

    private class ButtonHandler implements ActionListener {
        @SuppressWarnings("unused")
        private boolean on = true;

        public void actionPerformed(ActionEvent e) {
            PrintArrayT t = new PrintArrayT(app);

            if (e.getSource() == fillValues) {
                disableButtons();
                fillValues.requestFocus();
                bc.setActivity(0);
                disableButtons();
                t.start();
            } else if (e.getSource() == printArray) {
                disableButtons();
                printArray.requestFocus();
                bc.setActivity(1);
                t.start();
            } else if (e.getSource() == setValues) {
                disableButtons();
                setValues.requestFocus();
                bc.setActivity(2);

                // New code to handle setValues action
                String input = JOptionPane.showInputDialog(null, "Enter a value to set:");
                if (input != null) {
                    try {
                        int value = Integer.parseInt(input);
                        int row = -1;
                        while (row < 0 || row >= ROWS) {
                            input = JOptionPane.showInputDialog(null, "Enter a row number between 0 and " + (ROWS - 1) + ":");
                            if (input == null) {
                                enableButtons();
                                return;
                            }
                            try {
                                row = Integer.parseInt(input);
                            } catch (NumberFormatException ex) {
                                // Handle invalid input
                            }
                        }
                        bc.setKey(value);
                        setValues(value, row);
                        String message = bc.getCheckNewValues() ? " correctly" : " incorrectly";
                        JOptionPane.showMessageDialog(null, "Values in row " + row + " set to " + value + message);
                    } catch (NumberFormatException ex) {
                        // Handle invalid input
                    }
                }
                enableButtons();
            } else if (e.getSource() == findMinimum) {
                disableButtons();
                findMinimum.requestFocus();
                bc.setActivity(3);
                t.start();
            } else if (e.getSource() == countFrequency) {
                disableButtons();
                countFrequency.requestFocus();
                bc.setActivity(4);
                t.start();
            }
        }
    }

    public void resetButtonSelection() {
        fillValues.setSelected(false);
        printArray.setSelected(false);
        setValues.setSelected(false);
        findMinimum.setSelected(false);
        countFrequency.setSelected(false);
    }

    private class PrintArrayT extends Thread {
        @SuppressWarnings("unused")
        int[][] arr;
        @SuppressWarnings("unused")
        TwoDimArrayPractice s1;

        public PrintArrayT(TwoDimArrayPractice s) {
            arr = TwoDimArrayPractice.intArray;
            s1 = s;
        }

        public void run() {
            startActivity(bc.getActivity());
            enableButtons();
            // deselectButtons( );
        }
    }
}
