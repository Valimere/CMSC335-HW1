package HW1;

/**
 * Created by Stephen Drollinger on 3/22/15.
 */
public class Student extends Person{
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // overriding equals() method
    public boolean equals(Student st) {
        if (ID == st.ID)
            return true;
        else
            return false;
    }
}
