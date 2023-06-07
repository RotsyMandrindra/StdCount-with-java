package Maths;

import java.util.Collections;
import java.util.List;

public class Sum {
    public static int ofOdds(List <Integer> list){
        int sum = 0;
        for (int i = 0; i <= list.size(); i++) {
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // it should return 9
            List<Integer> i = List.of(1, 2, 3, 4, 5);//appel d'une méthode de classe
            List<Integer> j = List.of(0, 4);
        System.out.println(("La somme des valeurs impairs du tableau est :" + ofOdds(i)));
        System.out.println(("La somme des valeurs impairs de l'autre tableau est :" + ofOdds(j)));
    }
}
