package streams;

import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> integerList = new ArrayList<>();
        for (int x : arr) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            integerList.add(x);
        }
        integerList.sort(Integer::compareTo);

        for (Integer i : integerList) System.out.println(i);
    }
}
