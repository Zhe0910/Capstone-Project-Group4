package capstone;

/**
 * Creates Accident objects having a date
 */
public class Accidents {

    private String date;
    private Driver atFaultDriver;

    /**
     * A constructor to create accident objects
     * @param date The accident date
     */
    public Accidents(String date) {
        this.date = date;
    }

    /**
     * Gets the date of an accident object
     * @return A string representing the accident's date
     */
    public String getDate() {
        return date;
    }

    /**
     * Receives a string parameter and sets it as the date of a accident object
     * @param date A string representing the accident's date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the at fault driver for this accident
     * @return A Driver object representing the at-fault driver an accident object
     */
    public Driver getAtFaultDriver() {
        return atFaultDriver;
    }

    /**
     * Receives a Driver object as parameter and sets it as the at-fault driver for an
     * ...accident object
     * @param atFaultDriver A Driver object representing the at-fault driver for an
     *                      accident object.
     */
    public void setAtFaultDriver(Driver atFaultDriver) {
        this.atFaultDriver = atFaultDriver;
    }
}