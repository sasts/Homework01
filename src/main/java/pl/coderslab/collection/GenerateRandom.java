package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static void main(String[] args) {

        int amount = 50;
        int interval = 5;
        Map<Integer, Integer> map = checkRand(amount, interval);
        System.out.println(map);
    }



    public static Map<Integer, Integer> checkRand(int amount, int interval) {

        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int rNumber = random.nextInt(interval);
            if (map.containsKey(rNumber)) {
                map.put(rNumber, (map.get(rNumber) + 1));
            } else {
                map.put(rNumber, 1);
            }
        }
        return map;
    }
}
