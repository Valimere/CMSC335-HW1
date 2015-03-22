package HW1;

/**
 * Created by Stephen Drollinger on 3/22/15.
 */

// Person class
public class Person {

    private String name;
    private String address;
    private int birthYear;
    private boolean isMarried;


    //default constructor
    public Person(){
        name = "Steve Smith";
        address = "123 Main St.";
        birthYear = 1990;
        isMarried = false;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthYear=" + birthYear +
                ", isMarried=" + isMarried +
                '}';
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean getisMarried() {
        return isMarried;
    }

    public void setisMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
