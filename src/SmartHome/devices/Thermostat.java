package devices;

import devices.SmartDevice;

public class Thermostat implements SmartDevice {
    private String name;
    private int temperature = 22;

    public Thermostat(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        temperature += 1;
        System.out.println(name + ": Temperature is now " + temperature + "°C");
    }

    @Override
    public String getStatus() {
        return name + ": Current temperature is " + temperature + "°C";
    }
}
