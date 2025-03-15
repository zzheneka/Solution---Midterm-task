package decorators;

import devices.SmartDevice;

public class LoggerDecorator extends DeviceDecorator {
    public LoggerDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("[LOG] Starting operation");
        super.operate();
        System.out.println("[LOG] Operation completed");
    }
}
