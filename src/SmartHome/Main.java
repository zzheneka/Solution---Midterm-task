import SmartHome.composite.DeviceGroup;
import SmartHome.factories.SmartHomeFactory;
import SmartHome.factories.BasicSmartHomeFactory;
import SmartHome.devices.SmartDevice;
import SmartHome.decorators.LoggerDecorator;
import SmartHome.adapter.LegacyDoorLockAdapter;
import SmartHome.facade.SmartHomeController;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем фабрику
        SmartHomeFactory factory = new BasicSmartHomeFactory();

        // 2. Создаем устройства
        SmartDevice light1 = factory.createLight("Living Room Light");
        SmartDevice thermostat = factory.createThermostat("Living Room Thermostat");
        SmartDevice camera = factory.createCamera("Living Room Camera");

        // 3. Добавим декоратор логгирования к свету
        SmartDevice loggedLight = new LoggerDecorator(light1);

        // 4. Группируем устройства в одну комнату
        DeviceGroup livingRoom = new DeviceGroup("Living Room");
        livingRoom.addDevice(loggedLight);
        livingRoom.addDevice(thermostat);
        livingRoom.addDevice(camera);

        // 5. Добавим адаптированный старый замок
        SmartDevice legacyLock = new LegacyDoorLockAdapter();
        livingRoom.addDevice(legacyLock);

        // 6. Создаем фасад — контроллер всего дома
        SmartHomeController controller = new SmartHomeController(livingRoom);

        // 7. Демонстрация работы
        System.out.println("=== Управление умным домом ===");
        controller.activateAll(); // включаем всё
        System.out.println("\n=== Статус всех устройств ===");
        controller.showStatus(); // статус
    }
}
