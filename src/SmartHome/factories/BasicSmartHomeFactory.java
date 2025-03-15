package factories;
import devices.Thermostat;
import devices.Camera;

import devices.*;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        return new Light(name);
    }

    @Override
    public SmartDevice createThermostat(String name) {
        return new Thermostat(name);
    }

    @Override
    public SmartDevice createCamera(String name) {
        return new Camera(name);
    }
}
