public class Laptop {
    private LaptopManufacturer manufacturer;
    private String model;
    private LaptopColor color;
    private LaptopScreen screen;
    private String serialNumber;
    private String cpu;
    private String os;
    private int ramGb;
    private int storageGb;
    private int usbPortsNum;
    private boolean opticalDrive;
    private double price;

    public Laptop(LaptopManufacturer manufacturer,
                  String model,
                  LaptopColor color,
                  LaptopScreen screen,
                  String serialNumber,
                  String cpu,
                  String os,
                  int ramGb,
                  int storageGb,
                  int usbPortsNum,
                  boolean opticalDrive,
                  double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.screen = screen;
        this.serialNumber = serialNumber;
        this.cpu = cpu;
        this.os = os;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
        this.usbPortsNum = usbPortsNum;
        this.opticalDrive = opticalDrive;
        this.price = price;
    }

    // Getters
    public LaptopManufacturer getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public LaptopColor getColor() {
        return color;
    }
    public LaptopScreen getScreen() {
        return screen;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public String getCpu() {
        return cpu;
    }
    public String getOs() {
        return os;
    }
    public int getRamGb() {
        return ramGb;
    }
    public int getStorageGb() {
        return storageGb;
    }
    public int getUsbPortsNum() {
        return usbPortsNum;
    }
    public boolean isOpticalDrive() {
        return opticalDrive;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop: " +
                "manufacturer=" + manufacturer +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ramGb=" + ramGb;
    }
}
