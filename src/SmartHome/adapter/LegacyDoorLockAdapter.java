package SmartHome;

import SmartHome.devices.SmartDevice;

public class LegacyDoorLockAdapter implements SmartDevice {
    private LegacyDoorLock lock = new LegacyDoorLock();
    private boolean isLocked = false;

    @Override
    public void operate() {
        if (isLocked) {
            lock.unlock();
        } else {
            lock.lock();
        }
        isLocked = !isLocked;
    }

    @Override
    public String getStatus() {
        return "Legacy Lock is " + (isLocked ? "LOCKED" : "UNLOCKED");
    }
}
