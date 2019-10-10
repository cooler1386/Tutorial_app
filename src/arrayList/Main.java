package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("078mo");
        BMW bmw = new BMW("555vk");

        ArrayList<ICars> cars = new ArrayList<>();

        Set<ICars> setCars = new HashSet<>();

        setCars.add(car);
        setCars.add(bmw);

        cars.add(car);
        cars.add(car);
        cars.add(bmw);


        cars.remove(car);

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).getInfo();
            cars.get(i).drive();
        }

        System.out.println("\n");
        List<ICars> listCars = cars;
        for (ICars iCars: setCars) {
            iCars.getInfo();
            iCars.drive();
        }
    }
}

