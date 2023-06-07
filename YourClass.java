package Maths;

import java.util.List;

public class YourClass {
    public static int countByCity(List<String> addressList, String city) {
        int count = 0;
        for (String address : addressList) {
            if (address.toLowerCase().contains(city.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> cities = List.of(
                "analamahitsy ambany, lot XYZ",
                "Analamahitsy Cité, Lot IINX",
                "aNaLaMaHiTsY Tanana, Lot IINZ",
                "Itaosy, lot ABC",
                "itaosy-unis, lot GHL",
                "Ambohitrimanjaka, lot IV PH"
        );

        System.out.println(countByCity(cities, "analamahitsy")); // Output: 3
        System.out.println(countByCity(cities, "itaosy")); // Output: 2
        System.out.println(countByCity(cities, "Ambohitrimanjaka")); // Output: 1
    }
}
