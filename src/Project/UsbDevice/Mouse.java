package Project.UsbDevice;

public class Mouse implements USBDevice{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mouse connect");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Mouse disconnect");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
