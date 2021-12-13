public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
   
    public void setVersionNumber(String versionNum){
        this.versionNumber = versionNum;
    }
    public String getVersionNumber(){
        return this.versionNumber;
    }

    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getCarrier(){
        return this.carrier;
    }

    public void setRingTone(String ring){
        this.ringTone = ring;
    }
    public String getRingTone(){
        return this.ringTone;
    }
}

