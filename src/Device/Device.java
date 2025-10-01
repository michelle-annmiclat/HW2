package Device;

public class Device {
    public String model = "Generic Device";
    protected int powerLevel; // Protected so subclasses can access it

    public Device(int startPower) {
        this.powerLevel = startPower;
        System.out.println("--- Device initialized. ---");
    }

    public void setPower(int newLevel) {
        if (newLevel >= 0) {
            powerLevel = newLevel;
        }
    }

    public void printDescription() {
        System.out.println("Device Model: " + model + ", Current Power: " + powerLevel + " Watts.");
    }
}
