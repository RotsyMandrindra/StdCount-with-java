package Maths;

import java.util.List;

public class CountStd {
    public static int countByPromotion(int promotionYear, List<String> stdList) {
        int count = 0;
        String targetPromotion = "STD" + promotionYear;

        for (String std : stdList) {
            if (std.startsWith(targetPromotion)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<String> list =
        List.of("STD21001", "STD21002", "STD21015", "STD22088", "STD22103");

        int count2021 = countByPromotion(21, list);
        System.out.println(count2021); // Output: 3

        int count2022 = countByPromotion(22, list);
        System.out.println(count2022); // Output: 2

        int count2023 = countByPromotion(23, list);
        System.out.println(count2023); // Output: 1
    }
}

