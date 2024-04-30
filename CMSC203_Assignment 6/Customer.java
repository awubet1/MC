/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (This class represents a customer of the beverage shop. It stores information about the customer, such as their name and age.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
*/
class Customer {
    private String name;
    private int age;

    // Parameterized constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Customer(Customer other) {
        this.name = other.name;
        this.age = other.age;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// Programmed by ALAZAR WUBET