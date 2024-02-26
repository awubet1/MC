/*
 * Class: CMSC203 
 * Instructor: Dr.Grigoriy grinberg
 * Assignment 2
 * Description: The main method of the class PatientDriverApp is defined in this Java code. 
 The Patient and Procedure classes are created, initialized with sample data, and their information is displayed. 
 Additionally, it uses the auxiliary function calculateTotalCharges to compute and display the total charges for three procedures.
 * Due: 02/19/2024
 * Platform/compiler: Notepad++
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ALAZAR WUBET
*/

public class PatientDriverApp {
    public static void main(String[] args) {
        // Create instances of Patient and Procedure classes
        Patient patient = new Patient("Alex", "Marshal", "Junior", "243 Main St", "Kansa", "CA", "76584", "301-998-4567", "Marshal Senior", "+111-234-7899");
        Procedure procedure1 = new Procedure("Procedure 1", "06/12/2023");
        Procedure procedure2 = new Procedure("Procedure 2", "06/13/2023", "Dr. Smith", 1500.0);
        Procedure procedure3 = new Procedure("Procedure 3", "06/14/2023", "Dr. Jones", 3700.0);

        // Display patient information
        System.out.println(patient);

        // Display procedure information
        System.out.println(procedure1);
        System.out.println(procedure2);
        System.out.println(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f", totalCharges);	
		
		
		System.out.println("The program was developed by a Student: <Alazar Wubet> <02/19/24>");

    }

    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}
