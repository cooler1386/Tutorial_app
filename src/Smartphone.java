public class Smartphone extends Phone {
    public Smartphone(int imei) {
        super(imei);
    }

    @Override
    public void ring() {
        System.out.println("Ring, from smartphone" + getImei());
    }

    @Override
    public void getInfo() {
        System.out.println("This is smartphone");
    }
}
