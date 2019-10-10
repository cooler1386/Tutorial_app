package arrayList;

public class Cars implements ICars {

    private String registrNumber;

    public Cars(String registrNumber) {
        this.registrNumber = registrNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("Car's registered number is " + registrNumber);
    }

    @Override
    public void drive() {
        System.out.println("Car move forward");
    }




    public String getRegistrNumber() {
        return registrNumber;
    }
}
