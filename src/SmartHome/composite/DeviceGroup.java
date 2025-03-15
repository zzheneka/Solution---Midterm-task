package composite;

import devices.SmartDevice;
import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public DeviceGroup(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void operate() {
        System.out.println("[" + name + "] Operating all devices...");
        for (SmartDevice d : devices) {
            d.operate();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder("[" + name + "] Status:\n");
        for (SmartDevice d : devices) {
            status.append(d.getStatus()).append("\n");
        }
        return status.toString();
    }
}
