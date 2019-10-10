package arrayList;

public class BMW extends Cars {
    public BMW(String registrNumber) {
        super(registrNumber);
    }

    @Override
    public void getInfo() {
        System.out.println("BMW number " + getRegistrNumber());
    }

    @Override
    public void drive() {
        System.out.println("BMW move back");
    }


}
