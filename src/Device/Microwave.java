public class Microwave extends Device {
    private int maxTime; // Specific to Microwave

    // Required constructor for base initialization
    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);         // explicit call to superclass constructor
        this.model = "Microwave";  // overriding default model
        this.maxTime = maxCookingTime;
        System.out.println("--- Microwave initialized. ---");
    }

    // Base implementation for description (overrides parent)
    @Override
    public void describe() {
        System.out.println("Device Model: " + model
                + ", Current Power: " + powerLevel + " Watts."
                + " Max Cooking Time: " + maxTime + " minutes");
    }
}

// Microwave.java
class Device {
    protected String model;     // common field shared by all devices
    protected int powerLevel;   // inherited by subclasses

    // Required constructor for base initialization
    public Device(int startPower) {
        this.model = "Generic Device"; // default model
        this.powerLevel = startPower;
    }

    // Default description method
    public void describe() {
        System.out.println("Device Model: " + model
                + ", Power Level: " + powerLevel + " Watts");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Microwave myMicrowave = new Microwave(1200, 30); // power: 1200 watts, time: 30 minutes
        myMicrowave.describe();
    }
}
