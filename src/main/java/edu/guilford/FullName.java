package edu.guilford;

//FullName is a class that implements the Comparable interface so that
//any FullName object can compare itself to another FullName object.
//If we're implementing an interface, we need to implement all of the
//methods in the interface
public class FullName implements Comparable<FullName>{
    
    //attributes
    private String firstName;
    private String lastName;

    enum SortOrder{FORWARD, REVERSE}
    public static SortOrder sortOrder = SortOrder.FORWARD;


    //constructor
    public FullName(){
        //Choose a random first name from a list of 20 posibilities
        String[] firstNames = {"John", "Jane", "Joe", "Jill", "Jack", 
        "Jen", "Jim", "Jenny", "Jasper", "Jade", "Jared", "Jasmine", 
        "Jesse", "Jenna", "Javier", "Jocelyn", "Jude", "Judy", "Judd", "Jules"};
        int randomIndex = (int)(Math.random() * 20);
        firstName = firstNames[randomIndex];
        //Choose a random last name from a list of 20 posibilities
        String[] lastNames = {"Smith", "Jones", "Williams", "Brown", "Wilson",
        "Taylor", "Davis", "Miller", "White", "Clark", "Hall", "Thomas", "Thompson",
        "Moore", "Hill", "Walker", "Anderson", "Wright", "Martin", "Wood"};
        randomIndex = (int)(Math.random() * 20);
        lastName = lastNames[randomIndex];
    }

    //constructor
    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    //toString method
    public String toString(){
        return firstName + " " + lastName;
    }

    //This is a method that we need to implement from the Comparable interface
    //It compares this FullName object to another FullName object
    //It returns a negative number if this FullName object is less than the other
    //It returns 0 if this FullName object is equal to the other
    //It returns a positive number if this FullName object is greater than the other
    //We're comparing the last names first, and if they're equal, we're comparing the first names
    //This is a lexicographic comparison
    @Override
    public int compareTo(FullName other){
        //We can compare the first names first using the comparTo method of
        //the String class. String is Comparable, so it has a compareTo method
        int result = lastName.compareTo(other.lastName);
        //If the last names are equal, we need to compare the first names
        if(result == 0){
            result = firstName.compareTo(other.firstName);
        }
        //If we want to sort in reverse order, we need to reverse the sign of the result
        if(sortOrder == SortOrder.REVERSE){
            result = -result;
        }
        return result;
    }
}
