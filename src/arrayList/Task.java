package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    public static void main(String[] args) {

        Phone phone = new Phone(789);
      /*  phone.ring();
        phone.getInfo();*/

        Smartphone smartphone = new Smartphone(456);
//        smartphone.ring();
//        smartphone.getInfo();

        ArrayList<IPhone> phones = new ArrayList<>();

        Set<IPhone> setPhones = new HashSet<>();

        setPhones.add(phone);
        setPhones.add(phone);
        setPhones.add(smartphone);

        phones.add(phone);
        phones.add(phone);
        phones.add(phone);
        phones.add(smartphone);

//        phones.remove(0);
        phones.remove(phone);
        for (int i = 0; i < phones.size(); i++) {
            phones.get(i).getInfo();
            phones.get(i).ring();
        }

        System.out.println("\n\n\"");
        List<IPhone> listPhones = phones;
        for (IPhone iPhone : setPhones) {
            iPhone.getInfo();
            iPhone.ring();
        }
    }
}


