public enum Vehicle {

    A10(new String[] { "Fairchild", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    F16(new String[] { "General Dynamics", "Pratt-Whitney", "Lockheed Martin" }, 1976, 2025, 800, 140),
    F18(new String[] { "McDonnell-Douglas", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    ARROW(new String[] { "Avro", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    SU35(new String[] { "Sukhoi", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    MIG29(new String[] { "Mikoyan-Gurevich", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    B52(new String[] { "General Dynamics", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    F14(new String[] { "Grumman", "Pratt-Whitney", "Hughes" }, 1969, 2006, 381, 120);

    private String[] manufacturer;
    private int birthYear;
    private int outOfServiceYear;
    private int topSpeed; // all speeds in knots
    private int stallSpeed;

    private Vehicle(String[] manufacturer, int birthYear, int outOfServiceYear, int topSpeed, int stallSpeed) {
        this.manufacturer = manufacturer;
        this.birthYear = birthYear;
        this.outOfServiceYear = outOfServiceYear;
        this.topSpeed = topSpeed;
        this.stallSpeed = stallSpeed;
    }

    public String[] getManufacturers() {
        for (int a = 0; a < manufacturer.length; a++) {
            System.out.println(manufacturer[a]);
        }
        return manufacturer;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDecommissionYear() {
        return outOfServiceYear;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getStallSpeed() {
        return stallSpeed;
    }

    public int YearsInService() {
        return outOfServiceYear - birthYear;
    }

    public void getBriefHistory() {

        switch (this.ordinal()) {
            case 0:
                System.out.println("GAU-8 Avenger go brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrtttttttttttttttttttttttttttt");
                break;
            case 1:
                System.out.println("Maverick make wing go sweeeeeeeeeeeeeeep");
                break;

            default:
                System.out.print("No history, vehicle does not exist within enumerated array bounds.");
        }

    }

    public void commonManufacturers(Vehicle b) {

        for (int i = 0; i < this.manufacturer.length; i++) {
            for (int j = 0; j < b.manufacturer.length; j++) {
                if (this.manufacturer[i].equals(b.manufacturer[j])) {
                    System.out.println(b.manufacturer[j]);
                }
            }
        }
    }
}

/*
 * list of instance methods to implement:
 * - public String[] getManufacturers() {}
 * also make a method to see if any two vehicles were worked on by the same
 * company:
 * 
 * 
 * 
 * - public int YearsInService()
 * return outOfServiceYear - birthyear;
 * 
 * - public void getBriefHistory() {
 * System.out.
 * print("give a brief history of the selcted aircraft, maybe talk about the time period of manufacturing"
 * )
 * }
 * 
 * make methods that return the value of each instance variable, getBirthYear(),
 * getDecommissionYear(), getTopSpeed(), getStallSpeed()
 */
