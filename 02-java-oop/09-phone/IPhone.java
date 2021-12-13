public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    private String MESSAGE = "IPhone " + getVersionNumber();
    @Override
    public String ring() {
        return MESSAGE + " says " +getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognation";
    }
    @Override
    public void displayInfo() {
        String info = MESSAGE + " from " + getCarrier();
        System.out.println(info);        
    }
}

