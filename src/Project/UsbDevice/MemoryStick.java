package Project.UsbDevice;

public class MemoryStick implements USBDevice{

    private String name;
    public boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connect memory stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected) {
            System.out.println("Please eject memory stick first");
            return false;
        } else {
            System.out.println("Memory stick disconnected");
            return true;
        }
    }

    public void eject() {
        System.out.println("Ejecting memory stick");
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
