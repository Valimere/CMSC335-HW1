package HW1;

/**
 * Created by Stephen Drollinger on 3/22/15.
 */
public class TestMain {
    public static void main(String[] args) {

        //Creating Person Pam and printing their info
        System.out.println("Creating Person Pam");
        Person Pam = new Person();
        Pam.setName("Pam");
        Pam.setAddress("123 Main St. Washington DC");
        Pam.setBirthYear(1980);
        Pam.setisMarried(true);

        System.out.println(Pam);
        System.out.println();

        // Creating Employed Emily and printing their info
        System.out.println("Creating Employed Emily");
        Employed Emily = new Employed();
        Emily.setName("Emily");
        Emily.setAddress("134 1st St. Washington DC");
        Emily.setBirthYear(1985);
        Emily.setisMarried(true);

        System.out.println(Emily);
        System.out.println("Employed = " + Emily.getIsEmployed());
        System.out.println();

        //Creating Student Steve and printing their info
        System.out.println("Creating Student Steve");
        Student Steve = new Student();
        Steve.setName("Steve");
        Steve.setAddress("145 2nd St. Washington DC");
        Steve.setBirthYear(1986);
        Steve.setisMarried(false);
        Steve.setID(678);

        System.out.println(Steve);
        System.out.println("Student ID: = " + Steve.getID());
        System.out.println();

        // Creating Student Sam with some default person attributes and printing their information
        System.out.println("Creating Student Sam");
        Student Sam = new Student();
        Sam.setName("Sam");
        Sam.setID(679);

        System.out.println(Sam);
        System.out.println("Student ID; " + Sam.getID());
        System.out.println();

        //showing Sam != steve with overridden .equals method
        System.out.println("Students Sam and Steve are not the same person: " + Sam.equals(Steve));
        System.out.println();

        // showing converse that the overridden .equals can display true properly
        System.out.println("Showing I am comparing Student ID's");
        System.out.println("Getting Sam's ID:   " + Sam.getID());
        System.out.println("Getting Steve's ID: " + Steve.getID());
        System.out.println("Setting Sam's ID to equal steve's...");
        Sam.setID(Steve.getID());
        System.out.println("Showing updated result");
        System.out.println("Getting Sam's ID:   " + Sam.getID());
        System.out.println("Getting Steve's ID: " + Steve.getID());
        System.out.println("Students Sam and Steve are the same person: " + Sam.equals(Steve));
        System.out.println();

        // showing that the static variable isEmployed behaves differently
        //  then the instance variable name. Creating 2 new Employed people
        System.out.println("Showing Example of static variable effects:");
        Employed Eric = new Employed();
        Eric.setName("Eric");
        Employed Erika = new Employed();
        Erika.setName("Erika");
        System.out.println("Setting Eric to employed = false");
        Eric.setIsEmployed(false);
        System.out.println("Setting Erika to employed = true");
        Erika.setIsEmployed(true);
        System.out.println("Showing that by adjusting the static variable "
                + "isEmployed it effects both Eric and Erika");
        System.out.println("Eric is employed:" + Eric.getIsEmployed());
        System.out.println("Erika is employed:" + Erika.getIsEmployed());

        System.out.println("Both Eric and Erica's employment are updated when "
                + "you update either.");
        System.out.println();

        System.out.println("Compared to updating Eirc's name wont effect Erika:");
        System.out.println("Updating Eric to Eric1...");
        Eric.setName("Eric1");
        System.out.println("Eric's name is now: " + Eric.getName());
        System.out.println("Erika's name is still: " + Erika.getName());

    }
}
