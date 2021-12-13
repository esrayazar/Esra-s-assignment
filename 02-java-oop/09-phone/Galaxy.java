public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    private String MESSAGE = "Galaxy " + getVersionNumber();
    @Override
    public String ring() {
        return MESSAGE + " says " +getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        String info = MESSAGE + " from " + getCarrier();
        System.out.println(info);

    }
}

