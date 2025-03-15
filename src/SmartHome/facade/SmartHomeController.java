package facade;

import composite.DeviceGroup;

public class SmartHomeController {
    private DeviceGroup house;

    public SmartHomeController(DeviceGroup house) {
        this.house = house;
    }

    public void activateAll() {
        house.operate();
    }

    public void showStatus() {
        System.out.println(house.getStatus());
    }
}
