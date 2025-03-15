package devices;


public class Light implements SmartDevice {
    private String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        isOn = !isOn;
        System.out.println(name + ": Light is now " + (isOn ? "ON" : "OFF"));
    }

    @Override
    public String getStatus() {
        return name + ": Light is " + (isOn ? "ON" : "OFF");
    }
}
