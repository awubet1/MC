public class Procedure {
    private String name;
    private String date;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor for name and date
    public Procedure(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // Parametrized constructor for all attributes
    public Procedure(String name, String date, String practitionerName, double charges) {
        this.name = name;
        this.date = date;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors and Mutators

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "Name: " + name + "\n" +
                "Date: " + date + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Charges: $" + charges;
    }

    public static void main(String[] args) {
        Procedure procedure = new Procedure("Surgery", "06/12/2023", "Dr. Benson", 1500.0);
        System.out.println(procedure);
		
		
		System.out.println("The program was developed by a Student: <Alazar Wubet> <02/19/24>");

    }
}
