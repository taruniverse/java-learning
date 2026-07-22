package design_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        UsbCCharger charger = new ChargerAdapter(new OldCharger());
        charger.chargeWithUsbC();
    }
}

interface UsbCCharger {
    void chargeWithUsbC();
}

class OldCharger {
    void chargeWithRoundPin() {
        System.out.println("Charging with old round pin");
    }
}

class ChargerAdapter implements UsbCCharger {
    private final OldCharger oldCharger;

    ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    public void chargeWithUsbC() {
        oldCharger.chargeWithRoundPin();
    }
}

