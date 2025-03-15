package devices;

public class Camera implements SmartDevice {
    private String name;
    private boolean recording = false;

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        recording = !recording;
        System.out.println(name + ": Camera is now " + (recording ? "RECORDING" : "OFF"));
    }

    @Override
    public String getStatus() {
        return name + ": Camera is " + (recording ? "RECORDING" : "OFF");
    }
}
