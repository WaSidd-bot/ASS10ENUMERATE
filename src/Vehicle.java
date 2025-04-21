public class Vehicle {
    
    private String[] manufacturers;
    private int birthYear;
    private int outOfServiceYear;
    private double topSpeed;
    private double stallSpeed;

    public Vehicle(String[] manufacturers, int birthYear, int outOfServiceYear, double topSpeed, double stallSpeed) {
        this.manufacturers = manufacturers;
        this.birthYear = birthYear;
        this.outOfServiceYear = outOfServiceYear;
        this.topSpeed = topSpeed;
        this.stallSpeed = stallSpeed;
    }

    public String[] getManufacturers(String[] contracters) {
        return manufacturers;
    }

}

/*list of instance methods to implement:
 - public String[] getManufacturers() {}
also make a method to see if any two vehicles were worked on by the same company: 

public String[] commonManufacturers()

 - public int YearsInService()
return outOfServiceYear - birthyear;

 - public void getBriefHistory()
System.out.print("give a brief history of the selcted aircraft, maybe talk about the time period of manufacturing")

 - 

 - public int TopSpeedDifference()
 - public int StallSpeedDifference()

 make methods that return the value of each instance variable, getBirthYear(), getDecommissionYear(), getTopSpeed(), getStallSpeed() 
*/ 

