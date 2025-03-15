package decorators;

import devices.SmartDevice;

public abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice device;

    public DeviceDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void operate() {
        device.operate();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
