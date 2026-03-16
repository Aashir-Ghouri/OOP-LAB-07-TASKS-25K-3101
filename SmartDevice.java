public class SmartDevice {
    public void turnOn() {
        System.out.println("Turning on smart device...");
    }

    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartLight(),
                new SmartFan(),
                new SmartAC()
        };

        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }
}

class SmartLight extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light: Adjusting brightness...");
    }
}

class SmartFan extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan: Setting rotation speed...");
    }
}

class SmartAC extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart AC: Setting temperature...");
    }
}