import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

/**
 * Class for patron.
 */
class Patron {
    /**
     *variable that can be accessed within the class.
     */
    private String userName;
    /**
     *variable that can be accessed within the class.
     */
    private String mobileNumber;
    /**
     * Constructs the object.
     *
     * @param name    The name
     * @param number  The number
     */
    Patron(final String name, final String number) {
        this.userName = name;
        this.mobileNumber = number;
    }
    /**
     * Gets the user name.
     *
     * @return The user name.
     */
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the mobile number.
     *
     * @return The mobile number.
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

}
