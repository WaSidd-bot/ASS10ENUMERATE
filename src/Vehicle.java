public enum Vehicle {
    
    A10(new String[] { "Fairchild", "General Electric", "Grumman" }, 1977, 2025, 381, 120),
    F16(new String[] { "General Dynamics", "Pratt-Whitney", "Lockheed Martin" }, 1976, 2025, 800, 140),
    F18(new String[] { "McDonnell-Douglas", "Northrop", "Boeing" }, 1974, 2000, 1067, 135),
    ARROW(new String[] { "A.V.Roe", "Magellan", "Dowty" }, 1953, 1959, 1300, 170),
    SU35(new String[] { "Sukhoi", "UAC", "NPO" }, 1988, 2025, 1340, 142),
    MIG29(new String[] { "Mikoyan-Gurevich", "Klimov", "Avionika" }, 1977, 2025, 1310, 142),
    B52(new String[] { "Boeing", "Pratt-Whitney", "Northrop Grumman" }, 1952, 2025, 510, 130),
    F14(new String[] { "Grumman", "Pratt-Whitney", "Hughes" }, 1969, 2006, 381, 120),
    KA52(new String[] { "Kamov", "Klimov", "KRET" }, 1997, 2025, 167, 0),
    V22(new String[] { "Bell", "Boeing", "Raytheon" }, 1989, 2025, 275, 0);

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
        System.out.println(birthYear);
        return birthYear;
    }

    public int getDecommissionYear() {
        System.out.println(outOfServiceYear);
        return outOfServiceYear;
    }

    public int getTopSpeed() {
        System.out.println(topSpeed);
        return topSpeed;
    }

    public int getStallSpeed() {
        System.out.println(stallSpeed);
        return stallSpeed;
    }

    public int YearsInService() {
        System.out.println(outOfServiceYear - birthYear);
        return outOfServiceYear - birthYear;
    }

    public void getBriefHistory() {

        switch (this.ordinal()) {
            case 0:
                System.out.println("GAU-8 Avenger go brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrtttttttttttttttttttttttttttt");
                break;
            case 1:
                System.out.println("Yo guys, how about we go completely against everything taught in fighter design! - proceeds to make one of the most recognizable fighters ever to serve during the Cold War and cement it's legacy in history as one of the best!");
                break;
            case 2:
                System.out.println("US Navy's workhorse jet! has a variant other than the average Hornet called the 'Super Hornet', different enough, thats its considered an entirely new aircraft!");
                break;
            case 3:
                System.out.println("Fly high king (RIP)");
                break;
            case 4:
                System.out.println("'Just make it look like it can actually fight and we won't have a problem!' - some dude at Moscow probably");
                break;
            case 5:
                System.out.println("An aircraft with a feared reputation back then, in fact the F16 was the Western response to it! a workhorse fighter for many Eastern countries, however completely obsolete now due to radar detection distances improving.");
                break;
            case 6:
                System.out.println("Don't fix it if it's not broken!");
                break;
            case 7:
                System.out.println("'I feel the need...the need for speed!'");
                break;
            case 8:
                System.out.println("A Russian attack helicopter with a fearsome reputation before the war in Ukraine, it has a pretty loaded armament with rocket pods like the S-8 and autocannons like the Shipunov 2A42.");
                break;
            case 9:
                System.out.println("Arguably one of the coolest looking aircraft to see fly above your head, it has a tilt-rotor system meaning it can function as both an airplane and a helicopter, switching between them in flight as well! used for fast insertion/extraction of troops in hazardous cconditions.");
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
