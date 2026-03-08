package Sliding;

import java.sql.SQLOutput;
import java.util.HashMap;

public class FruitsInABasket {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }

            //Update max
            maxLength = Math.max(maxLength, right - left);

        }
        System.out.println(maxLength);
    }
}
