package Project.UsbDevice;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getName();
}
