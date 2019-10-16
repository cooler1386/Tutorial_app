package arrayList;

public class Phone implements IPhone {

    public Phone(int imei) {
        this.imei = imei;
    }

    private int imei;

    @Override
    public void ring() {
        System.out.println("Ring, from imei " + imei);

    }

    public int getImei() {
        return imei;
    }

    @Override
    public void getInfo() {
        System.out.println("This is basic phone");
    }
}
