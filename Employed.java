package HW1;

/**
 * Created by Stephen Drollinger on 3/22/15.
 */
public class Employed extends Person {

    private static boolean isEmployed = true;

    // Setter and getter
    public static boolean getIsEmployed() {
        return isEmployed;
    }

    public static void setIsEmployed(boolean isEmployed) {
        Employed.isEmployed = isEmployed;
    }
}
